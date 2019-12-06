package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author renato.lopes
 * @date 06/12/2019
 */
public class DriverFactory {

  private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

  private DriverFactory() {

  }

  public static void setDriver(String browser) {
    switch (browser.toLowerCase()) {
      case "chrome":
        driver = ThreadLocal.withInitial(() -> new ChromeDriver());
        break;
      default:
        throw new IllegalArgumentException("Driver nao implementado: " + browser);
    }
  }

  public static WebDriver getDriver() {
    return driver.get();
  }

}
