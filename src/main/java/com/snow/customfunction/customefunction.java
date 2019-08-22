package com.snow.customfunction;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

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

	public static File captureScreenMethod(WebDriver driver2, String DirPath, String TestcaseNumber) {

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyy_mm_dd_hh_mm_ss");
		System.out.println("DirPath : " + DirPath);
		String timeStamp = dateFormat.format(new Date());
		TakesScreenshot tk = ((TakesScreenshot) driver2);
		File src = tk.getScreenshotAs(OutputType.FILE);
		File dst = new File(DirPath + TestcaseNumber + "\\screenshots" + timeStamp + ".png");
		try {
			FileUtils.copyFile(src, dst);
		} catch (IOException e) {

			e.printStackTrace();
		}
		return dst;

	}

}
