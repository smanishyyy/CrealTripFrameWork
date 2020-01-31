package com.java.interview;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HighlighterClass {
	
	
	@BeforeMethod
	public void open()
	{
		
	}
	@Test
	 public void highlighterElement() {
	 
	 System.setProperty("webdriver.gecko.driver", "D:/Workspace/ClearTripFrameWork/chromedriver.exe");
	 WebDriver driver = new FirefoxDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.gmail.com");
	 WebElement ele = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
	                //Call the highlighterMethod and pass webdriver and WebElement which you want to highlight as arguments.
	 highLighterMethod(driver,ele);
	 ele.sendKeys("SoftwareTestingMaterial.com");
	 Actions act=new Actions(driver);
	 act.contextClick(ele).build().perform();
	
	 }
	 
	        //Creating a custom function
	 public void highLighterMethod(WebDriver driver, WebElement element){
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 //js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
	 js.executeScript("arguments[0].setAttribute('style', 'border: solid red;');", element);
	 }
	 @AfterMethod
		public void tear()
		{
			
		}
}
