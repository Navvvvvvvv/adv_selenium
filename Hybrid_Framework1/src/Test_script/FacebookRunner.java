package Test_script;

import org.testng.annotations.Test;

import POM_script.FacebookScript;

public class FacebookRunner {
	@Test
	public void run()
	{
		driver.get("https://www.facebook.com/login/");
		FacebookScript fb=new FacebookScript(driver);
		fb.unPass("9480787655");
		fb.pwdPass("Ajith@Naik@25");
		fb.clickLogin();
	}

}
