package Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://qamagnus.jalatechnologies.com/");
		
		
		TakesScreenshot scrShot=((TakesScreenshot)driver);
		File source=scrShot.getScreenshotAs(OutputType.FILE); 
        File dest=new File("G:/error.png");	//path	
		FileUtils.copyFile(source, dest);		
		
		
		
		/*File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);   
				
		File dest1=new File("G:/error.png");
		
		FileUtils.copyFile(src, dest1);		
		
		//FileUtils.copyFile(src, new File("G:/error1.png"));*/
		
		
		
		
		
	}

}
