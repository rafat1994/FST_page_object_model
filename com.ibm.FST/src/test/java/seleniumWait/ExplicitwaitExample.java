package seleniumWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitwaitExample {

	WebDriver driver;

	@BeforeTest
	public void launchApp() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@AfterTest
	public void closeApp() throws InterruptedException {
		Thread.sleep(4000);
		driver.close();

	}

	@Test
    public void login() {
        
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#text3")));
        
        
        driver.findElement(By.cssSelector("#text3")).sendKeys("enter value into text box.....");
        
	}    
    
}
