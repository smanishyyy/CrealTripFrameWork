package com.snow.customfunction;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class customefunction {

	public static WebDriver driver;

	public static void pressEnter() {
		try {
			Robot robot = new Robot();

			robot.keyPress(KeyEvent.VK_ENTER);

			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(3000);

		} catch (AWTException e) {

			e.printStackTrace();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}

	public static void copyText() {
		try {
			Robot robot = new Robot();

			robot.keyPress(KeyEvent.VK_A);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_A);

			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_C);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_C);
			Thread.sleep(3000);

		} catch (AWTException e) {

			e.printStackTrace();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	public static void sleep(int timeInMilliSecond) {
		try {
			Thread.sleep(timeInMilliSecond);
		} catch (InterruptedException e) {

		}
	}

	public static void cFunScrollToElement(String Xpath, WebDriver driver2) {

		WebElement ele;
		System.out.println("Scroll down");
		try {
			ele = driver2.findElement(By.xpath(Xpath));
			JavascriptExecutor ex = (JavascriptExecutor) driver2;
			ex.executeScript("arguments[0].scrollIntoView(true);", ele);
			Thread.sleep(3000);

		} catch (Exception e) {
			e.getMessage();

		}

	}

	public static void cFunScrollToElementt(WebElement ele, WebDriver driver) {

		System.out.println("Scroll down");
		try {

			JavascriptExecutor ex = (JavascriptExecutor) driver;
			ex.executeScript("arguments[0].scrollIntoView(true);", ele);
			Thread.sleep(3000);

		} catch (Exception e) {
			e.getMessage();

		}

	}

	public static void SwitchToFrmaeByNameOrID(WebDriver driver2, String name) {
		driver2.switchTo().frame(name);
		System.out.println("Frame swictched succesfully");
	}

	public static void SelectValueFromDrp(WebDriver driver2, String xpath, String Value) {
		Select sel = new Select(driver2.findElement(By.xpath(xpath)));
		System.out.println("Frame swictched succesfully");
		sel.selectByVisibleText(Value);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();

		}
	}

	public static void captureScreenMethod(WebDriver driver2, String DirPath, String TestcaseNumber) {

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyy_mm_dd_hh_mm_ss");
		String timeStamp = dateFormat.format(new Date());
		TakesScreenshot tk = ((TakesScreenshot) driver2);
		File src = tk.getScreenshotAs(OutputType.FILE);
		File dst = new File(DirPath + TestcaseNumber + "\\screenshots" + timeStamp + ".png");
		try {
			FileUtils.copyFile(src, dst);
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public static void switchWindow(WebDriver driverPa) {

		Set handles = driverPa.getWindowHandles();
		System.out.println("driverPa : " + driverPa);
		// System.out.println("driver3 : "+ driver3);
		for (String handles1 : driverPa.getWindowHandles()) {
			System.out.println(handles1);

			driverPa.switchTo().window(handles1);

			System.out.println("Driver swicthed successfully");

		}
		// @SuppressWarnings("rawtypes")
		// String parent=driver2.getWindowHandle();
		// System.out.println(parent);
		// Set handles = driver2.getWindowHandles();
		// System.out.println(handles);
		// for (String handles1 : driver2.getWindowHandles()) {
		//
		// System.out.println(handles1);

		// driver.switchTo().window(handles1);

	}

	public static void cFunToVrfyStaticTextGeneric(WebDriver driver2, String partialtext, String fulltext) {
		String data = partialtext;
		String data2 = fulltext.trim();
		System.out.println("data22 : " + data2);
		driver2.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		try {
			LinkedList<String> ls = new LinkedList<>();
			LinkedList<String> ls2 = new LinkedList<>();

			String gg = driver2.findElement(By.xpath("//*[contains(text(),'" + data + "')]")).getText();
			System.out.println(gg);

			String hh = data2;

			String[] str = hh.split("\\s*");
			String[] str2 = gg.split("\\s*");

			for (int i = 0; i < str2.length; i++) {

				ls.add(str2[i]);

			}
			System.out.println("Ls : " + ls);
			Object arr[] = ls.toArray();
			for (int i = 0; i < arr.length; i++) {
				arr[i] = arr[i].toString();
				System.out.println("[AppUI " + i + "]" + arr[i]);
			}

			for (int i = 0; i < str.length; i++) {

				ls2.add(str[i]);

			}
			System.out.println("tt" + ls);
			System.out.println("tttt" + ls2);
			System.out.println("Ls2 : " + ls);
			Object arr2[] = ls2.toArray();
			for (int i = 0; i < arr2.length; i++) {
				arr2[i] = arr2[i].toString();
				System.out.println("[Condition " + i + "]" + arr[i]);
			}
			System.out.println("ls" + ls);
			System.out.println("ls2" + ls2);
			Thread.sleep(2000);
			if (ls2.equals(ls)) {
				System.out.println("Text is veryfied :" + gg);

			} else {

				System.out.println(
						"You are passing incorrect text from condition column so please enter this text :" + gg);

			}
			// } else {
			// System.out.println("Text is not present anywhere in application");
			// Report.updateTestLog("Text is not present anywhere in application", " Not
			// Done " + data, Status.FAIL);
			// }
			// Thread.sleep(10000);
			//
			//// addGlobalVar("%strSelectedValue%", gg);
			// userData.putData("Login&User", "Data1", gg);
			// Report.updateTestLog("Text is verified", " Done "+data, Status.PASS);
		} catch (Exception e) {

		}

	}

	public static void cfunToEnterDateAfterBeforeCurrent(int numberOfDays, String Xpath, WebDriver driver) {
		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");

			Calendar c = Calendar.getInstance();
			c.add(Calendar.DATE, numberOfDays);

			String date = dateFormat.format(c.getTime());
			System.out.println("Changed date" + c.getTime());
			System.out.println(date);
			WebElement ele = driver.findElement(By.xpath(Xpath));
			ele.click();

			ele.sendKeys(date);
		} catch (Exception e) {

		}
	}

	public static String getORvalue2(String data, String xmlFilePath) {
		try {
			xmlFilePath = "C:\\Users\\chaurma\\eclipse-workspace\\SnowNowPageObjectFramework\\ObjectRepository.xml";
			File inputFile = new File(xmlFilePath);
			SAXReader saxReader = new SAXReader();
			Document document;

			document = saxReader.read(inputFile);

			String GoogleSearch = document.selectSingleNode("//menu/" + data).getText();

			data = GoogleSearch;
		} catch (DocumentException e) {

			e.printStackTrace();
		}
		return data;

	}

	public static void writeFile(String canonicalFilename, String text) throws IOException {
		File file = new File(canonicalFilename);
		BufferedWriter out = new BufferedWriter(new FileWriter(file));
		out.write(text);
		out.close();

	}

	public static void cFunSelectValueByIndexXpath(String xpath, WebDriver driver) {

		List<WebElement> ele;

		try {

			ele = driver.findElements(By.xpath(xpath));
			Thread.sleep(3000);
			System.out.println("Rowcount" + ele);

			int RowCount = ele.size();
			System.out.println("Rowcount" + RowCount);

			for (WebElement option : ele) {
				System.out.println("Otion " + option.getText());

				option.click();
				// JavascriptExecutor ex= (JavascriptExecutor)Driver;
				// ex.executeScript("arguments[0].click", option);
				Thread.sleep(3000);
				System.out.println("Selected value is " + xpath);

			}

		} catch (Exception e) {
			System.out.println("Value are not finding");
		}
	}

	public static boolean IsElementExist(WebElement ele) {
		try {
			System.out.println("IsElementExist :" + ele);
			ele.isDisplayed();
			return true;
		} catch (Exception e) {
			System.out.println("Exception :" + ele);
			return false;
		}

	}

	public static void SetIfExist(WebElement ele, String Value) {
		try {
			System.out.println("IsElementExist :" + ele);
			ele.isDisplayed();
			ele.sendKeys(Value);

		} catch (Exception e) {
			System.out.println("Exception :" + ele);

		}
	}

}
