package TestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.snow.customfunction.customefunction;
import com.snow.util.TestUtil;
import com.sun.javafx.PlatformUtil;

public class SignInTest {

	public static WebDriver driver;
	ChromeOptions options = new ChromeOptions();

	@Test
	public void shouldThrowAnErrorIfSignInDetailsAreMissing() {
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		setDriverPath();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.implicit_wait, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/");
		waitFor(2000);

		driver.findElement(By.linkText("Your trips")).click();
		waitFor(4000);
		customefunction.captureScreenMethod(driver, "D:\\Workspace\\ClearTripFrameWork\\Screenshot_",
				"TC03_SignInTest");
		driver.findElement(By.id("SignIn")).click();
		driver.switchTo().frame("modal_window");
		driver.findElement(By.id("signInButton")).click();
		customefunction.captureScreenMethod(driver, "D:\\Workspace\\ClearTripFrameWork\\Screenshot_",
				"TC03_SignInTest");
		String errors1 = driver.findElement(By.xpath("//*[@id=\"errors1\"]//span")).getText();
		System.out.println("errors1 : " + errors1);
		Assert.assertTrue(errors1.contains("There were errors in your submission"));
		customefunction.captureScreenMethod(driver, "D:\\Workspace\\ClearTripFrameWork\\Screenshot_",
				"TC03_SignInTest");
		driver.quit();
	}

	private void waitFor(int durationInMilliSeconds) {
		try {
			Thread.sleep(durationInMilliSeconds);
		} catch (InterruptedException e) {
			e.printStackTrace(); // To change body of catch statement use File | Settings | File Templates.
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
