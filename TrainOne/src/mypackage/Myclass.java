package mypackage;


import org.testng.annotations.*;

public class Myclass {
	
	@BeforeTest

	public void main0() {
		// TODO Auto-generated method stub adding more comments
		
		System.out.println("Hello world from beforeTest ");

	}
	
	@Test (dataProvider = "datareader1")

	public void main1(String vName, String vEmail, String vPass) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("login");
		System.out.println("Name = " + vName);
		System.out.println("Email = " + vEmail);
		System.out.println("Password = " + vPass);
	}
	@Test (dataProvider = "datareader2")
	public void main2(String myName2, String myEmail2, String myPassword2) {
		// TODO Auto-generated method stub
		
		System.out.println("Account");
		
		System.out.println("Name = " + myName2);
		System.out.println("Email = " + myEmail2);
		System.out.println("Password = " + myPassword2);

	}
	@Test
	public void main3() {
		// TODO Auto-generated method stub
		
		System.out.println("send money");

	}
	@DataProvider 
	public Object [][] datareader1(){
		//this function will run two sets of data
		Object [][] myData = new Object[2][3];
		myData[0][0] = "Nayemul";
		myData[0][1] = "Nayemul@yahoo.com";
		myData[0][2] = "password";
		
		myData[1][0] = "Laila";
		myData[1][1] = "Laila@yahoo.com";
		myData[1][2] = "pass";
		
		return myData;
	}
	
	@DataProvider 
	public Object [][] datareader2(){
		//this function will run two sets of data
		Object [][] myData = new Object[2][3];
		myData[0][0] = "Nayemul2";
		myData[0][1] = "Nayemul2@yahoo.com";
		myData[0][2] = "password2";
		
		myData[1][0] = "Laila2";
		myData[1][1] = "Laila2@yahoo.com";
		myData[1][2] = "pass2";
		
		return myData;
	}
	
	
	@AfterClass
	public void atEnd(){
		
	}

}
