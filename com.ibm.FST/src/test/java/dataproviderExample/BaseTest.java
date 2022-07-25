package dataproviderExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	WebDriver driver;
//	loginpage lp;
//	loginpage_pagefactory lp;
	@BeforeTest
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
//		lp=new loginpage(driver);
//		lp= new loginpage_pagefactory(driver);
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	
}
