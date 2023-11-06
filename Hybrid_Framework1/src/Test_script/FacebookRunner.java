package Test_script;

import org.testng.annotations.Test;

import Generic_Script.GenericReadExcel;
import POM_script.FacebookScript;

public class FacebookRunner 
{
	@Test
	public void run()
	{
		driver.get("https://www.facebook.com/login/");
		FacebookScript fb=new FacebookScript(driver);
		fb.unPass(GenericReadExcel.fetchData(null, 0, 0));
		fb.pwdPass("Ajith@Naik@25");
		fb.clickLogin();
	}

}
