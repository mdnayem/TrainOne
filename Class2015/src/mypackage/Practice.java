package mypackage;

import org.junit.Test;

public class Practice {
	
	@Test
	public void simplefunc() throws Exception{
	
		//a, b, , d all are variables. in this case, they are integer. 
		int a; 
		int b;
		int c;
		int d;
		int e;
		
		
		a = 1; b = 8; c=10; d= 15; e=12;
		System.out.println(a);
		
		int total;
		String Generation; 
		Generation = "service 1 center";
		total = (a+b+c+d+e);
		//System.out.println(a+b+c+d);
		System.out.println(total);
		
		if (total> 50)
		{System.out.println("Senior "+ Generation );}
		else
		{System.out.println("Young " + Generation );}	
		
		
		
	}
	
	
	
	
	

}
