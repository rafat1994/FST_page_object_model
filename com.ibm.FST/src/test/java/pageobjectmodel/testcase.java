package pageobjectmodel;

import org.testng.annotations.Test;

public class testcase extends BaseTest {
	
	@Test
	public void HRMloginTest()
	{
		lp.EnterUserName("Admin");
		lp.Enterpassword("admin123");
		lp.ClickonLogin();
//		lp.verifytitle(null, null);
	}

}
