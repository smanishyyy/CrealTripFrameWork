package com.ust.global.interview;

import org.junit.Assert;
import org.testng.annotations.Test;


@Test(groups= {"AllGroups"})
public class TestNg2 extends BaseClass {

	@Test(priority=3,groups= {"sanity"})
	public void first()
	{
		System.out.println(" first");		
	}
	@Test(priority=1,groups= {"sanity","smoke"} )

	public void second()
	{
		System.out.println(" second");		
	}
	@Test
	public void third()
	{
		System.out.println(" third1");		
	}
	@Test(priority=4,groups= {"smoke"})
	public void fourth()
	{
		System.out.println(" fourth");		
	}
	@Test(priority=0,groups= {"sanity","smoke","regression"})
	
	public void fifth()
	{
		System.out.println("fifth");		
	}
	
	
}
