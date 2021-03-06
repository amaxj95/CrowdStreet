// Generated by Selenium IDE - Automated by Austin Jones
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class NewCSTestTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() throws MalformedURLException {
    driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.chrome());
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void newCSTest() {
    // Test name: newCSTest
    // Step # | name | target | value
    // 1 | open | http://test.crowdstreet.com | 
    driver.get("http://test.crowdstreet.com");
    // 2 | click | css=.tablet-menu > .join-button | 
    driver.findElement(By.cssSelector(".tablet-menu > .join-button")).click();
    // 3 | type | id=firstName | AUTOMATED
    driver.findElement(By.id("firstName")).sendKeys("AUTOMATED");
    // 4 | type | id=lastName | TEST
    driver.findElement(By.id("lastName")).sendKeys("TEST");
    // 5 | type | id=email | amaxj95@gmail.com
    driver.findElement(By.id("email")).sendKeys("email@email.com");
    // 6 | type | id=password | db!ppQer5TTtA56
    driver.findElement(By.id("password")).sendKeys("db!ppQer5TTtA56");
    // 7 | type | id=confirmPassword | db!ppQer5TTtA56
    driver.findElement(By.id("confirmPassword")).sendKeys("db!ppQer5TTtA56");
    // 8 | click | id=accreditedYes | 
    driver.findElement(By.id("accreditedYes")).click();
    // 9 | click | id=hasAgreedTos | 
    driver.findElement(By.id("hasAgreedTos")).click();
    // 10 | click | css=.h-14 | 
    driver.findElement(By.cssSelector(".h-14")).click();
    // 11 | click | css=button | 
    driver.findElement(By.cssSelector("button")).click();
    // 12 | close |  | 
    driver.close();
  }
}
