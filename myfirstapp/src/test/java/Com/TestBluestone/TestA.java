package Com.TestBluestone;

import org.testng.annotations.Test;

@Test(groups="login-test")
public class TestA {
	@Test(groups="regression")
	public void aTest1()
	{
		System.out.println("Hello test1");
		
	}
	
	@Test(groups="regression")
	public void aTest2()
	{
		System.out.println("Hello test2");
		
	}
	
	@Test(groups={"regression","bvt"})
	public void aTest3()
	{
		System.out.println("Hello test3");
		
	}
	
	@Test(groups="bvt")
	public void aTest4()
	{
		System.out.println("Hello test4");
		
	}
	
	
	@Test(groups={"regression","bvt"})
	public void aTest5()
	{
		System.out.println("Hello test5");
		
	}

}
