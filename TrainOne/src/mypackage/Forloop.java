package mypackage;

import org.junit.Test;
import org.testng.annotations.*;

public class Forloop {

	@Test
	public void forlup(){
		
		int i = 10;
		for (i=0;i<10;i++)
			System.out.println("lets count  " +i);
	}
	
	@BeforeTest
	public void forlupmsg(){
		
		
			System.out.println("before test  ");
	}
	  @AfterClass
	  public void afterClass() {
	  }
}
