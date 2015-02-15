package mypackage;

//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Simpleclass {
	
	@BeforeClass
	public void setUp() throws Exception {
		callfunction("this is @Before");
	}
	
	@Test (timeOut = 10000)
	public void myfunc() throws Exception {
		
		int nazrul;
		int murad; 
		int difference; 
		nazrul = 20;
		murad = 30;
		difference = (nazrul - murad);
		
		if (difference > 0)
		{callfunction("Assalamualikum Nazrul bhai");}
		else
		{callfunction("walaikuAssalam Nazrul bhai");}	
		
		callfunction("so, Nazrul bhai is elder than murad by " + difference +" years of age");
	}
	@Test (timeOut = 20000)
	public void myfunc2() throws Exception {
		
		int nazrul;
		int murad; 
		int difference; 
		nazrul = 20;
		murad = 30;
		difference = (nazrul - murad);
		
		if (difference > 0)
		{callfunction("Assalamualikum Nazrul bhai");}
		else
		{callfunction("walaikuAssalam Nazrul bhai");}	
		
	callfunction("so, Nazrul bhai is elder than murad by " + difference +" years of age");
		
		
	}
     public void callfunction(String mytext) throws Exception{
		
		System.out.println(mytext);
	}

	@AfterTest
	public void tearDown() throws Exception {
		callfunction("this is @After");
		
	}
	
	
	
	
	
	

}
