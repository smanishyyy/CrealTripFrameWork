package com.ust.global.interview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageObject {
	public static WebDriver driver;
	PageObject(WebDriver dr)
	{
		this.driver=dr;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.XPATH,using="//a[text()='Departments']")
	public WebElement Department;
	@FindBy(how=How.XPATH,using="//*[@id=\"link3\"]/strong")
	public WebElement civil;
	@FindBy(how=How.XPATH,using="//*[contains(text(),'Departement of Civil En')]")
	public WebElement dpcivil;

}
