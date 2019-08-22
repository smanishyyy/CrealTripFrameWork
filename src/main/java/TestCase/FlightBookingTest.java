package TestCase;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.snow.customfunction.customefunction;
import com.snow.util.TestUtil;
import com.sun.javafx.PlatformUtil;

public class FlightBookingTest {
	public static WebDriver driver;
	ChromeOptions options = new ChromeOptions();

	@Test
	public void testThatResultsAppearForAOneWayJourney() {
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		setDriverPath();

		driver.get("https://www.cleartrip.com/");
		waitFor(2000);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.implicit_wait, TimeUnit.SECONDS);
		driver.findElement(By.id("OneWay")).click();
		customefunction.captureScreenMethod(driver, "D:\\Workspace\\ClearTripFrameWork\\Screenshot_",
				"TC01_FlightBookingTest");
		driver.findElement(By.id("FromTag")).clear();
		customefunction.captureScreenMethod(driver, "D:\\Workspace\\ClearTripFrameWork\\Screenshot_",
				"TC01_FlightBookingTest");
		driver.findElement(By.id("FromTag")).sendKeys("Bangalore");
		customefunction.captureScreenMethod(driver, "D:\\Workspace\\ClearTripFrameWork\\Screenshot_",
				"TC01_FlightBookingTest");

		// wait for the auto complete options to appear for the origin

		waitFor(2000);
		// List<WebElement> originOptions =
		// driver.findElement(By.id("ui-id-1")).findElements(By.tagName("li"));
		// originOptions.get(0).click();

		driver.findElement(By.id("ToTag")).clear();
		driver.findElement(By.id("ToTag")).sendKeys("Delhi");

		// wait for the auto complete options to appear for the destination

		waitFor(2000);
		// select the first item from the destination auto complete list
		List<WebElement> destinationOptions = driver.findElement(By.id("ui-id-2")).findElements(By.tagName("li"));
		destinationOptions.get(0).click();

		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[5]/td[5]/a")).click();
		customefunction.captureScreenMethod(driver, "D:\\Workspace\\ClearTripFrameWork\\Screenshot_",
				"TC01_FlightBookingTest");
		// all fields filled in. Now click on search
		driver.findElement(By.id("SearchBtn")).click();
		customefunction.captureScreenMethod(driver, "D:\\Workspace\\ClearTripFrameWork\\Screenshot_",
				"TC01_FlightBookingTest");
		waitFor(5000);
		// verify that result appears for the provided journey search
		Assert.assertTrue(isElementPresent(By.className("searchSummary")));
		customefunction.captureScreenMethod(driver, "D:\\Workspace\\ClearTripFrameWork\\Screenshot_",
				"TC01_FlightBookingTest");
		// close the browser
		driver.quit();

	}

	private void waitFor(int durationInMilliSeconds) {
		try {
			Thread.sleep(durationInMilliSeconds);
		} catch (InterruptedException e) {
			e.printStackTrace(); // To change body of catch statement use File | Settings | File Templates.
		}
	}

	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	private void setDriverPath() {
		if (PlatformUtil.isMac()) {
			System.setProperty("webdriver.chrome.driver", "chromedriver");
		}
		if (PlatformUtil.isWindows()) {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		}
		if (PlatformUtil.isLinux()) {
			System.setProperty("webdriver.chrome.driver", "chromedriver_linux");
		}
	}
}
