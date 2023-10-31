package POM_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookScript {
	@FindBy(id="email")
	private WebElement unTbox;
	@FindBy(id="pass")
	private WebElement pwdTbox;
	@FindBy(name="login")
	private WebElement loginBtn;
	
	public FacebookScript(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void unPass(String un)
	{
		unTbox.sendKeys(un);
	}
	public void pwdPass(String pwd)
	{
		pwdTbox.sendKeys(pwd);
	}
	public void clickLogin()
	{
		loginBtn.click();
	}

}
