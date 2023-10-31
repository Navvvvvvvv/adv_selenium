package Generic_Script;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class GenericScreenshot {
	public static void getPhoto(WebDriver driver)
	{
		String photo="./Screenshot/";
		Date d=new Date();
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dst=new File(d+photo+".jpeg");
	}

}
