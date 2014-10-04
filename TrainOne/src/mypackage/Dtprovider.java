package mypackage;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Dtprovider {
  @Test(dataProvider = "dp")
  public void func(Integer n, String s, String p) {
	  
	  
  }

  @DataProvider
  public Object[][] dp() {
     Object[][] myData = new Object [2][3];
    		 {
      myData[0][1] = "001";
      myData[0][2] = "Chowdhury, Nayemul";
    }; 
    return(myData);
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

}
