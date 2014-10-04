package mypackage;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;
import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Admeal {
  private WebDriver driver;
  private String baseUrl;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeTest
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://www.ad-mela.com";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testUntitled() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.linkText("Login")).click();
    prtMsg("JUst clicked Login link","================");
    driver.findElement(By.linkText("Home")).click();
    prtMsg("JUst clicked Home link","================");
    driver.findElement(By.name("SearchWord")).clear();
    driver.findElement(By.name("SearchWord")).sendKeys("groom");
    driver.findElement(By.name("searchbutton")).click();
    WebElement linkName = driver.findElement(By.linkText("Home"));
    linkName.click();
    prtMsg("JUst clicked Final Home link named" + linkName,"================");
    try {
      assertEquals("Login", driver.findElement(By.linkText("Login")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
  }

  @AfterTest
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }
  
  public void prtMsg(String message, String msg){
	  
	  System.out.println(message);
	  System.out.println(msg);
	  
  }
  
}
