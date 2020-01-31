package com.ust.global.interview;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sun.javafx.PlatformUtil;

public class Tc01 {
	public static WebDriver dr;
	@BeforeMethod
	public void initialization()
	{
	
		if(PlatformUtil.isMac())
		{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir"));	
		}
		if(PlatformUtil.isWindows())
		{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");	
		
		
		}
		if(PlatformUtil.isLinux())
		{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir"));	
		}

	dr=new ChromeDriver();
	dr.manage().window().maximize();
	dr.manage().deleteAllCookies();
	dr.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	dr.get("https://www.annauniv.edu/");
	}
	@Test
	public void test() throws InterruptedException
	{
		PageObject dp=new PageObject(dr);	
		
		WebDriverWait wt=new WebDriverWait(dr,20);

		JavascriptExecutor ex = (JavascriptExecutor)dr;
		ex.executeScript("arguments[0].click();", dp.Department);
		Thread.sleep(4000);
		List<WebElement> allLinks = dr.findElements(By.tagName("a"));
		for(WebElement el:allLinks)
		{
		System.out.println(el.getText() + " - " + el.getAttribute("href"));
		
		}
		Actions ac=new Actions(dr);
		ac.moveToElement(dp.civil).build().perform();
		Thread.sleep(4000);
		List<WebElement> allLinks2 = dr.findElements(By.tagName("a"));
		for(WebElement el:allLinks2)
		{
		System.out.println(el.getText() + " - " + el.getAttribute("href"));
		
		}
		ac.moveToElement(dp.dpcivil).click();
		Thread.sleep(4000);
		
	}
	@AfterMethod
	public void tearDown()
	{
		dr.quit();
	}

}
