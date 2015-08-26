package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CopyOfCopyOfAnnotations {
	
	@BeforeTest
	private void beforetestmenthodNew() {
		// TODO Auto-generated method stub
		System.out.println("Will run before Test");

	}
	
	@BeforeMethod (enabled=false)
	private void beforementhodmethod() {
		// TODO Auto-generated method stub
		System.out.println("Will run before each method");
		}
	@Test (dependsOnMethods = "printMe")
	public void iAmAwesome(){
		System.out.println("I am awesome");
	}

	@AfterTest
	private void afterTestMethod() {
		// TODO Auto-generated method stub
		System.out.println("After Test");
		}
	@AfterMethod
	private void aftermytest() {
		// TODO Auto-generated method stub
		System.out.println("will run after each menthod");
	}
	
	@Test
	public void printMe(){
	System.out.println("hi");
	}
	@Test (dependsOnMethods = "iAmAwesome")
	public void flight()
	{
		System.out.println("canada");
	}
}
