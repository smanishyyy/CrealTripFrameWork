package TestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

import com.snow.customfunction.customefunction;
import com.snow.pages.HotelPage;
import com.snow.util.TestUtil;
import com.sun.javafx.PlatformUtil;

public class HotelBookingTest {

	public static WebDriver driver;
	ChromeOptions options = new ChromeOptions();

	@FindBy(how = How.XPATH, using = "//*[@id='Home']/div/aside[1]/nav/ul[1]/li[2]/a[1]/span")
	private WebElement hotelLink;

	@FindBy(id = "Tags")
	private WebElement localityTextBox;

	@FindBy(id = "SearchHotelsButton")
	private WebElement searchButton;

	@FindBy(id = "travellersOnhome")
	private WebElement travellerSelection;

	@Test
	public void shouldBeAbleToSearchForHotels() {
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.implicit_wait, TimeUnit.SECONDS);
		setDriverPath();
		HotelPage hotel = new HotelPage(driver);
		driver.get("https://www.cleartrip.com/");
		hotel.hotelLink.click();
		hotel.sendKeys();
		customefunction.captureScreenMethod(driver, "D:\\Workspace\\ClearTripFrameWork\\Screenshot_",
				"TC02_HotelBookingTest");
		waitFor(4000);
		customefunction.pressEnter();

		driver.findElement(By.xpath("//*[@id=\"SearchForm\"]/section[2]/div[1]/dl/dd/div/i")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[5]/td[5]/a")).click();
		customefunction.captureScreenMethod(driver, "D:\\Workspace\\ClearTripFrameWork\\Screenshot_",
				"TC02_HotelBookingTest");
		driver.findElement(By.xpath("//*[@id=\"SearchForm\"]/section[2]/div[2]/dl/dd/div/i")).click();

		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[5]/td[6]/a")).click();

		// Select sel=new Select(travellerSelection).selectByVisibleText("1 room, 2
		// adults");
		hotel.searchButton.click();
		customefunction.captureScreenMethod(driver, "D:\\Workspace\\ClearTripFrameWork\\Screenshot_",
				"TC02_HotelBookingTest");
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
