package mypackage;



import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Search {
  private WebDriver driver;
  private String baseUrl;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://www.ad-mela.com";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testUntitled() throws Exception {
	  
	  driver.get(baseUrl + "/");
	String moreWords;
	moreWords = "bride";
	WebElement mySearch;
	mySearch = driver.findElement(By.name("SearchWord"));
    mySearch.clear();
    mySearch.sendKeys("Groom " + "and " + moreWords );
    WebElement myButton;
    myButton = driver.findElement(By.name("searchbutton"));
    myButton.click();
    
    try {
    	  assertEquals("\"No Results have been found!\n Index is up-to-date.\"", driver.findElement(By.cssSelector("td.matter > font")).getText());
    	} catch (Error e) {
    	  verificationErrors.append(e.toString());
    	}
  }
  

  @After
  public void tearDown() throws Exception {
    //driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }
}

