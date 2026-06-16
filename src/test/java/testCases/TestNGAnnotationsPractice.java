package testCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotationsPractice {
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before Suite");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method");
	}

	@Test(dependsOnMethods="loginTest", groups = "smoke")
	public void signupTest()
	{
		System.out.println("Signup Test");
	}
	
	@Test(priority=1, description= "This is Login Test", timeOut=1000) // description for the test and timeout for the execution
	public void loginTest()
	{
		System.out.println("Login Test");
	}
	
	@Test(priority=2, invocationCount=2) // excute same test multiple times
	public void homeTest()
	{
		System.out.println("Home Test");
	}
	
	@Test(priority=3, enabled=false) //ignore this test with attribute
	public void logoutTest()
	{
		System.out.println("Logout Test");
	}
	
	@Test(priority = 5,timeOut = 2000)
	public void timeoutExample() throws Exception {
          Thread.sleep(3000);

		}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After Suite");
	}
}
