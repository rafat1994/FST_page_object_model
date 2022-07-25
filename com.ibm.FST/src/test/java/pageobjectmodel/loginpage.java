package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class loginpage {
	
	WebDriver driver;
	public loginpage(WebDriver driver) {
		this.driver=driver;
	}
	
	By txt_username= By.name("txtUsername");
	By txt_password= By.name("txtPassword");
	By btn_login= By.xpath("//input[@value='LOGIN']");
	
	public void EnterUserName(String username)
	{
		driver.findElement(txt_username).sendKeys(username);
	}
	
	public void Enterpassword(String password)
	{
		driver.findElement(txt_password).sendKeys(password);
	}
	
	public void ClickonLogin()
	{
		driver.findElement(btn_login).click();
	}
	
	public void verifytitle(String Expected, String Actual)
	{
//		Actual= driver.getTitle();
		Assert.assertEquals(Actual, Expected);
		
	}
}
