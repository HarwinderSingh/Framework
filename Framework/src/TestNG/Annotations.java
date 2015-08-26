package TestNG;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Annotations {
	
	
	@BeforeGroups (enabled=false)
	private void beforetestmenthod() {
		// TODO Auto-generated method stub
		System.out.println("Will run before Test");

	}
	
	@BeforeMethod (enabled=false)
	private void beforementhodmethod() {
		// TODO Auto-generated method stub
		System.out.println("Will run before each method");
		}
	

	@AfterTest (enabled=false)
	private void afterTestMethod() {
		// TODO Auto-generated method stub
		System.out.println("After Test");
		}
	@AfterMethod (enabled=false)
	private void aftermytest() {
		// TODO Auto-generated method stub
		System.out.println("will run after each menthod");
	}
	
	@Test
	public void printMe(){
	System.out.println("hi");
	}
	
	@Test (dependsOnMethods = "iAmAwesome")
	public void flight(){
		System.out.println("canadahi");
	}
	
	@Test (dependsOnMethods = "printMe")
	public void iAmAwesome(){
		System.out.println("I am awesome");
	}
	
	@Test
	public void dataDriven() throws IOException{
	Properties prop = new Properties();
	FileInputStream ds = new FileInputStream("C:\\Users\\Harwinder\\workspace\\Framework\\src\\TestNG\\Cmndata.properties");
	prop.load(ds);
	System.out.println(prop.getProperty("place"));
	}
	
	@Test (enabled=false)
	@Parameters ({"name"})
	public void printMeNow(String name){
	System.out.println(name);
	}
	
	@Test (enabled=false)
	@Parameters ({"place"})
	public void dreamPlace(String place){
		System.out.println("place");
	}
	
	//WebDriver driver = new FirefoxDriver();
	
}
