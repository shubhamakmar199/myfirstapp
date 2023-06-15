package Com.TestBluestone;

import org.testng.annotations.Test;

@Test(groups="Register-test")
public class Test2 {
	@Test(groups="regression")
	public void aTesta()
	{
		System.out.println("Hello test A");
		
	}
	
	@Test(groups="regression")
	public void aTestb()
	{
		System.out.println("Hello test B");
		
	}
	
	
	@Test(groups={"regression","bvt"})
	public void aTestc()
	{
		System.out.println("Hello test C");
		
	}
	
	@Test(groups="bvt")
	public void aTestd()
	{
		System.out.println("Hello test D");
		
	}
	
	
	@Test(groups={"regression","bvt"})
	public void aTeste()
	{
		System.out.println("Hello test E");
		
	}

}
