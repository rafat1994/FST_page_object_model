package SeleniumAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoHRM {
	
	WebDriver driver;
	
	@Test
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\0032F7744\\eclipse-workspace\\DemoJavaProj\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		System.out.println("chrome has been launched successfully");
		driver.close();
		
	}

}
