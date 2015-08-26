package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParameterizedTest {
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data= new Object[3][2];
		data[0][0] = "User1";
		data[0][1] = "Pwd1";
		data[1][0] = "User2";
		data[1][1] = "Pwd2";
		data[2][0] = "User3";
		data[2][1] = "Pwd3";
		return data;
	}
	


@Test (dataProvider = "getData")
public void userLogin(String Username, String Password){
	System.out.println("Username is: "+Username + "and Password is: " +Password);
}}