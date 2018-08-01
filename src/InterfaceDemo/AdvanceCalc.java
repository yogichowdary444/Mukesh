package InterfaceDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdvanceCalc implements Calc {
	
	public WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		
		AdvanceCalc obj1 = new AdvanceCalc();
		obj1.add();
		obj1.sub();
		obj1.calculateCosc();
		obj1.calculateSin();
		

	}

	public void calculateSin() throws Exception{
		//driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yogi.v\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.fb.com");
		Thread.sleep(5000);
		System.out.println("I am in Advance calc- sin");
		driver.close();
		
	}
	
	public void calculateCosc(){
		System.out.println("I am in Advance calc- cosc");
	}
	
	
	public void add() {
		
		System.out.println("Im in calc add");
	}

	
	public void sub() {
		
		System.out.println("Im in calc sub");
	}
	
	

}
