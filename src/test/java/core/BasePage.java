package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author renato.lopes
 * @date 06/12/2019
 */
public class BasePage<T extends BasePage<T>> {

  protected WebDriver driver;
  protected WebDriverWait wait;

  public BasePage(WebDriver driver) {
    this.driver = driver;
    this.wait = new WebDriverWait(driver, 10);

    PageFactory.initElements(driver, (T) this);
  }

  public T open(String url) {
    driver.navigate().to(url);
    return (T) this;
  }

}
