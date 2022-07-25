package seleniumWait;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class WaitExample extends BaseTest{
	
	@Test
	public void login()
	{
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
	}

}
