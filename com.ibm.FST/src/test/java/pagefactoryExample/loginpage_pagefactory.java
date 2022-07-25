package pagefactoryExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class loginpage_pagefactory {
	
	WebDriver driver;
	public loginpage_pagefactory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
//	By txt_username= By.name("txtUsername");
//	By txt_password= By.name("txtPassword");
//	By btn_login= By.xpath("//input[@value='LOGIN']");
	
	@FindBy(name="txtUsername")
	WebElement txt_username;
	
	@FindBy(name="txtPassword")
	WebElement txt_password;
	
	@FindBy(how = How.NAME, using="txtPassword")
	WebElement txt_password1;
	
	@FindBy(xpath = "//input[@value='LOGIN']")
	WebElement btn_login;
	
	public void EnterUserName(String username)
	{
		txt_username.sendKeys(username);
	}
	
	public void Enterpassword(String password)
	{
		txt_password1.clear();
		txt_password.sendKeys(password);
	}
	
	public void ClickonLogin()
	{
		btn_login.click();
	}
	
	public void verifytitle(String Expected, String Actual)
	{
//		Actual= driver.getTitle();
		Assert.assertEquals(Actual, Expected);
		
	}
}
