package HeadlessModeExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	WebDriver driver;
//	loginpage lp;
	@BeforeTest
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
//		co.addArguments("--headless", "--window-size=1920,1200");
        co.addArguments("ignore-certificate-errors");
		
		
		driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
//		lp=new loginpage(driver);
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	
}
