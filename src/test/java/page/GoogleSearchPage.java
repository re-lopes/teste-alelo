package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import core.BasePage;

/**
 *
 * @author renato.lopes
 * @date 06/12/2019
 */
public class GoogleSearchPage extends BasePage<GoogleSearchPage> {

  @FindBy(name = "q")
  private WebElement txtSearchBar;

  public GoogleSearchPage(WebDriver driver) {
    super(driver);
  }

  public GoogleResultPage pesquisarPor(String texto) {
    txtSearchBar.sendKeys(texto);
    txtSearchBar.submit();

    return new GoogleResultPage(driver);
  }

}
