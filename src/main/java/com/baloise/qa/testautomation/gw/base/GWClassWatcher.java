package com.baloise.qa.testautomation.gw.base;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Hashtable;
import java.util.Map;

import org.junit.Assert;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.open.insurance.baloise.qa.ui.taf.gw.interfaces.IGWTestcaseManager;
import org.open.insurance.baloise.qa.ui.taf.gw.interfaces.IGWTestcaseManager.TestcaseManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.baloise.testautomation.taf.base._base.AnnotationHelper;

public class GWClassWatcher extends TestWatcher {

  private static final String INI = ".ini";
  private static final String TXT = ".txt";
  public static Logger logger = LoggerFactory.getLogger(GWClassWatcher.class);;
  private static String filename = null;

  private static String nodeIndex = "";

  public String path = "";

  private boolean allPassed = true;

  private boolean debug = false;

  private Map<String, String> previousResults = new Hashtable<String, String>();

  private IGWTestcaseManager manager = null;

  public GWClassWatcher(String path) {
    this.path = path;
    init();
  }

  private void appendResult(Description description) {
    String result;
    if (allPassed) {
      result = "passed";
    }
    else {
      result = "failed";
    }
    try {
      logger.info("Writing result for: " + description + " to: " + getOutFilename());
      Files.write(Paths.get(getOutFilename()),
          (description.toString() + "-->" + result + System.lineSeparator()).getBytes(), StandardOpenOption.APPEND);
    }
    catch (IOException e) {
      e.printStackTrace();
    }

  }

  private void createFileIfNotExists() {
    logger.info("clear / create file: " + getOutFilename());
    try {
      Path fullpath = Paths.get(getOutFilename());
      Files.write(fullpath, "".getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
    }
    catch (Exception e) {
      e.printStackTrace();
    }
  }

  private void fillList() {
    if (previousResults.isEmpty()) {
      try (BufferedReader br = new BufferedReader(new FileReader(getInFilename()))) {
        readPreviousResult(br);
      }
      catch (Exception e) {}
      finally {}
    }
  }

  private String getFilename(String runname, String runid) {
    return runname + "_" + runid;
  }

  private String getInFilename() {
    return path + filename + TXT + INI;
  }

  public IGWTestcaseManager getManager() {
    return manager;
  }

  private String getOutFilename() {
    return path + filename + nodeIndex + TXT;
  }

  private void init() {
    String runId = "";
    if (!debug) {
      runId = new Long(System.currentTimeMillis()).toString();
    }
    if (filename == null) {
      String nodeIndex = System.getProperty("build.nodeindex");
      if (nodeIndex == null) {
        String runName = System.getProperty("build.runname", System.getProperty("user.name"));
        runId = System.getProperty("build.runid", runId);
        if ("true".equalsIgnoreCase(System.getProperty("build.usepreviousresult"))) {
          String tempSuffix = System.getProperty("build.runid", null);
          if (tempSuffix != null) {
            try {
              int buildId = Integer.parseInt(tempSuffix) - 1;
              logger.info("use previous result --> " + buildId);
              Files.copy(Paths.get(path + getFilename(runName, new Integer(buildId).toString())),
                  Paths.get(path + getFilename(runName, new Integer(buildId + 1).toString() + INI)));
              logger.info("previous result found and successfully copied");
            }
            catch (Exception e) {
              logger.warn("error copying previous result!");
              e.printStackTrace();
            }
          }
        }
        filename = getFilename(runName, runId);
      }
      else {
        GWClassWatcher.nodeIndex = nodeIndex;
        path = "./../";
        filename = "testclassresults";
      }
      fillList();
      createFileIfNotExists();
    }
  }

  public boolean needsToRun(Description description) {
    String result = previousResults.get(description.getClassName());
    if (result == null) {
      return true;
    }
    return "failed".equalsIgnoreCase(result);
  }

  private void readPreviousResult(BufferedReader br) throws IOException {
    String line = br.readLine();
    while (line != null) {
      logger.info("Reading previous result for: " + line);
      String[] parts = line.split("-->");
      previousResults.put(parts[0], parts[1]);
      line = br.readLine();
    }
    br.close();
  }

  public void setToFailed() {
    allPassed = false;
  }

  @Override
  protected void starting(Description description) {
    logger.info("Starting test on class: " + description);
    TestcaseManager annotation = AnnotationHelper.getAnnotationInHierarchy(description.getTestClass(),
        TestcaseManager.class);
    Assert.assertNotNull("Keine Anntoation @TestcaseMananger gefunden --> Test kann nicht gestartet werden",
        annotation);
    try {
      // Constructor<?> c = annotation.value().getConstructor(Description.class);
      manager = (IGWTestcaseManager)annotation.value().newInstance();
    }
    catch (Exception e) {
      Assert.fail("Instantiierung TestcaseManager fehlgeschlagen");
    }
    allPassed = true;
  }

  @Override
  protected void succeeded(Description description) {
    appendResult(description);
  }

}
