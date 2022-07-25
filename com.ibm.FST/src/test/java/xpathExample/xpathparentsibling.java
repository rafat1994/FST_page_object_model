package xpathExample;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class xpathparentsibling extends BaseTest{
	
	@Test
	public void xpathexampleparentchild() throws InterruptedException
	{
		
		driver.findElement(By.xpath("//td[contains(text(),'Helen Bennett')]//parent::tr//child::td/input")).click();
		Thread.sleep(3000);
		//another method by accessing child with type attribute
		//driver.findElement(By.xpath("//td[text()='Helen Bennett']//preceding-sibling::td//child::input[@type='checkbox']")).click();
	}

}
