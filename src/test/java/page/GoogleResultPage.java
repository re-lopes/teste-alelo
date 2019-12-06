package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import core.BasePage;
import util.NumberFormatter;

/**
 *
 * @author renato.lopes
 * @date 06/12/2019
 */
public class GoogleResultPage extends BasePage<GoogleResultPage> {

  private WebElement resultStats;

  public GoogleResultPage(WebDriver driver) {
    super(driver);
  }

  public Long getTotalResultadoAproximado() {
    String total = resultStats.getText().split(" ")[1];
    return NumberFormatter.stringToLong(total);
  }
}
