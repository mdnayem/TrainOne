package mypackage;

import org.junit.After;
import org.junit.Test;

public class Tc1 {

	@Test
	public void setUp() throws Exception {
		
		
		//float a = 6;
		//float b = 2;
		//float c = (a/b);
		int i;
		i=5;
	//for (i=10;i>-1;i--)		
		do{
		System.out.println("Looping value for i is " + i);
		i++;
		}while (i<10);
	}


	@After
	public void tearDown() throws Exception {
	}



}
