package mypackage;



import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Search2 {
  private WebDriver driver;
  
  private String baseUrl;
  private StringBuffer verificationErrors = new StringBuffer();
  int myage;

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://www.ad-mela.com";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    myage = 50;
    
  }
  
  @Test
  public void testUntitled() throws Exception {
	
	 int i;
	 i = 1;
	do {
    driver.get(baseUrl + "/Default.asp");
    WebElement SW; WebElement SB;
    SW = driver.findElement(By.name("SearchWord"));
    SB = driver.findElement(By.name("searchbutton"));
    SW.clear();
    SW.sendKeys("car");
    SB.click();
    
    WebElement mydescription;
    String myDesc;
    myDesc = "Description";
    mydescription = driver.findElement(By.linkText(myDesc));
    //mydescription = driver.findElement(By.linkText("Description"));
 
    
    try {
        assertEquals(myDesc, mydescription.getText());
        emssg("Verified link, passed. Name we found is "+ myDesc + "Count number " + i);
      } catch (Error e) {
        verificationErrors.append(e.toString());
        emssg("Error occurred");
      }
    i++;
	} while (i<11);
	

  
  }
  

  @After
  public void tearDown() throws Exception {
	  driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
    
 
  }
  
  public void emssg(String mymssg) throws Exception {
	  
	  System.out.println(mymssg);
	  
  }
  
  
}

