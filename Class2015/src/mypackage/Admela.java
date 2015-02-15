package mypackage;



import java.io.PrintStream;
import java.util.concurrent.TimeUnit;

//import org.junit.*;

//import static org.junit.Assert.*;





import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Admela {
  private WebDriver driver;
  private String baseUrl;
private PrintStream verificationErrors;
  @BeforeTest
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://www.ad-mela.com";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void linkCheck() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.linkText("Home")).click();
    driver.findElement(By.linkText("PostAd")).click();
    //driver.findElement(By.name("SearchWord")).clear();
   
  }
  @Test
  public void oSearch() throws Exception{
	  driver.get(baseUrl + "/");
	  driver.findElement(By.name("SearchWord")).sendKeys("groom");
	  driver.findElement(By.name("searchbutton")).click();  
	  driver.findElement(By.linkText("Descriptions")).click();
  }

@AfterTest
  public void tearDown() throws Exception {
   //driver.quit();
   
  }
}

