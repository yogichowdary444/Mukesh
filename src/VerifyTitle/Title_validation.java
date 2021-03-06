package VerifyTitle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Title_validation {
	
	public WebDriver driver;
	
	@Test
	public void verifyApplicationTitle() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yogi.v\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//Actual Title
		String title = driver.getPageSource();
		System.out.println("This is"+title);
		//Expected title
		//String expected_title = "Facebook � log in or sign up";
		//Assert.assertEquals(title, expected_title);
		Assert.assertTrue(title.contains("Facebook � log in or sign up"));
		System.out.println("Test Completed");
		driver.quit();
	}

}
