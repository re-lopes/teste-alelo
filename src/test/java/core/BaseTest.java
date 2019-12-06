package core;

import static driver.DriverFactory.getDriver;
import static driver.DriverFactory.setDriver;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;

import util.TestUtil;

/**
 *
 * @author renato.lopes
 * @date 06/12/2019
 */
public class BaseTest {

  @Rule
  public TestName testName = new TestName();

  @Before
  public void setUpTest() {
    setDriver("chrome");
  }

  @After
  public void tearDownTest() {
    TestUtil.takeScreenshot(getDriver(), testName.getMethodName());
    getDriver().quit();
  }

}
