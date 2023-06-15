package Com.MVN;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng {
	@BeforeTest
	public void beforetestcase()
	{
		System.out.println("before test case");
	}
	@AfterTest
	public void aftertestcase()
	{
		System.out.println("after testcase");
	}
	@BeforeMethod
	public void beforemymethod()
	{
		System.out.println("Before Method");
	}
	
	@AfterMethod
	
	public void aftermymethod()
	{
		System.out.println("after method");
	}
	
	@Test(priority = 1,description = "test script for login")
	public void bloginTest() {
		System.out.println("Test script");
	}
	
	@Test(priority = 2,description = "Test script for logout")
	public void alogoutTest()
	{
		System.out.println("logout");
	}

}
