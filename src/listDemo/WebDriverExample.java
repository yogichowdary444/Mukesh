package listDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class WebDriverExample {
	public static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yogi.v\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("userName")).sendKeys("Mercury");
		driver.findElement(By.name("password")).sendKeys("yogi@123");
		driver.findElement(By.name("login")).click();
		
		driver.findElement(By.xpath("//"));
		Select sel = new Select(driver.findElement(By.xpath("")));
		sel.getOptions();
		

	}

}
