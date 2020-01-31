package com.ust.global.interview;

import org.junit.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
@Test(groups= {"AllGroups2"})
public class TestNgg extends BaseClass {
	
	
	@Test
	public void zz()
	{
		System.out.println("@Test zz");		
	}
	


	@Test(dependsOnGroups= {"depend"})
	public void tb()
	{
		System.out.println("@tbt tb tbtb");	
		Assert.assertEquals(true, true);
	}
	@Test
	public void t1()
	{
		System.out.println("@Test ddd1");		
	}
	@Test(priority=0,groups= {"sanity","smoke","regression"},invocationCount=10,enabled=true)
	@Parameters("browserName")
	public void aa(@Optional String str)
	{
		System.out.println("@Test 11");		
		System.out.println(str);
		
		
		
	}
	@Test(dependsOnMethods="tb")
	public void next1()
	{
		System.out.println("next1 next1 next1");		
	}
	@Test(groups= {"depend"})
	public void excludeGroup()
	{
		System.out.println("@dependddddd");	
		Assert.assertEquals(true, true);
	}

}
