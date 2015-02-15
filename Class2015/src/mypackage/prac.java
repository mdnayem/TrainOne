package mypackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class prac {

	@Before
	public void setUp() throws Exception {
	
		
	}

	@After
	public void tearDown() throws Exception {
		
		
		
		
	}

	@Test
	public void test() throws Exception {
		String myname;
		myname = "Tarek";
		//myname = "Nazrul2";
		//System.out.println(myname);
		if (myname.equals("Nazrul"))
		{System.out.println("Hello" + myname);}
		
		else if (myname.equals("Nazrul2"))
		{System.out.println("Oh you are not Nazrul, you are " + myname);}
		
		else
		{System.out.println("Oh you are " + myname);}
			
		
		
	}

}
