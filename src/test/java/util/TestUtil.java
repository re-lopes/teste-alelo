package util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author renato.lopes
 * @date 06/12/2019
 */
public class TestUtil {

  public static void takeScreenshot(WebDriver driver, String filename) {
    File ss = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

    try {
      FileUtils.copyFile(ss, new File("target/output/" + filename + ".jpg"));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void takeScreenshot(WebDriver driver) {
    takeScreenshot(driver, String.valueOf(System.currentTimeMillis()));
  }

}
