package handleAlert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertExample extends BaseTest {

	@Test
	public void Alertdismissed() throws InterruptedException {

//		driver.findElement(By.xpath("(//input[@type='button'])[3]")).click();
//		driver.findElement(By.xpath("//input[@value='Show Me Alert']")).click();
		WebElement alertbox = driver.findElement(By.xpath("//button[text()='Show Me Confirmation']"));
		alertbox.click();
		Thread.sleep(3000);
		Alert at = driver.switchTo().alert();
		at.dismiss();
		String youPressedCancel = driver.findElement(By.xpath("//div[text()='You pressed Cancel!']")).getText();
		Assert.assertTrue(youPressedCancel.contains("Cancel"));
		System.out.println("Alert dismissed successfully");

	}

	@Test
	public void AlertAccepted() throws InterruptedException {
		System.out.println("=================");
		WebElement alertbox = driver.findElement(By.xpath("//button[text()='Show Me Confirmation']"));
		alertbox.click();
		Thread.sleep(3000);
		Alert at = driver.switchTo().alert();
		at.accept();
		String youPressedOK = driver.findElement(By.xpath("//div[text()='You pressed OK!']")).getText();
		Assert.assertTrue(youPressedOK.contains("OK"));
		System.out.println("Alert Accepted successfully");
	}
	
	@Test
	public void gettilteAlert() {
		driver.findElement(By.xpath("//input[@type='button']/following-sibling::button[1]")).click();
		Alert at=driver.switchTo().alert();
		at.sendKeys("Rafat Shaikh");
		at.accept();
	}
	
	@Test
    public void login() {
        
        
        
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.alertIsPresent());
        
        
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        
    }

}
