package dataproviderExample;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataproviderclass extends BaseTest {

	// WebDriver driver;

	@Test(dataProvider = "RegressionData")
	public void verifydataprovider(String username, String password) {

		System.out.println("user name: " + username + "  password: " + password);
		driver.findElement(By.name("txtUsername")).clear();
		driver.findElement(By.name("txtUsername")).sendKeys(username);

		driver.findElement(By.name("txtPassword")).clear();
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		driver.findElement(By.name("Submit")).click();
	}

	@DataProvider(name = "smokeTest")
	public Object[][] smoketestdata() {
		Object[][] data = { { "user1", "password1" }, { "user2", "password2" }, { "user3", "password3" } };
		return data;
	}

	@DataProvider(name = "RegressionData")
	public Object[][] dataTest() {

		Object[][] data = { { "userRegression1", "password1" }, { "userRegression2", "password2" },
				{ "userRegression3", "password3" }, { "userRegression4", "password4" } }; // data - fetch - DB -number
		return data;
	}

}
