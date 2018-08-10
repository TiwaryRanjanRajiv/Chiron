package groupProfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class object_repository {
	WebDriver driver;
	@Test
	public void setup() throws IOException
	{
		File f = new File("/Users/user/Desktop/Rajiv_Selenium/Chiron_PreAdmission/OR.Property");//Location of file
		FileInputStream fis = new FileInputStream(f);// Input
		Properties pro = new Properties();//class
		pro.load(fis);//property form fis
		String str = pro.getProperty("URL");//Variable name 
		//System.out.println(str);//to check whether it is taking value for URL
		
		System.setProperty("webdriver.chrome.driver", "/Users/user/Desktop/Rajiv_Selenium/Chiron_PreAdmission/chromedriver");
		driver = new ChromeDriver();
		driver.get(str);
		
	
}
}
