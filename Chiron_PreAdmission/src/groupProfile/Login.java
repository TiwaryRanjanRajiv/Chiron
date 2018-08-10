package groupProfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Login {

	WebDriver driver;
	// create a resultList that will contain number of test cases
	List<String> resultList = new ArrayList<String>();
	// create an instance of PdfUtilityClass
	PdfUtility pdfUtility = new PdfUtility();

	// login test
	@Test

	void GroupProfile_Login() throws IOException, InterruptedException {
		File f = new File("/Users/user/Desktop/Rajiv_Selenium/Chiron_PreAdmission/OR.Property");
		FileInputStream fis = new FileInputStream(f);// Input
		Properties pro = new Properties();// class
		pro.load(fis);// property form fis
		String str = pro.getProperty("URL");// Variable name
		// System.out.println(str);//to check whether it is taking value for URL

		System.setProperty("webdriver.chrome.driver",
				"/Users/user/Desktop/Rajiv_Selenium/Chiron_PreAdmission/chromedriver");
		driver = new ChromeDriver();
		driver.get(str);
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(9000);
		driver.findElement(By.xpath("/html/body/app-root/app-login/div/form/div/div[1]/input"))
				.sendKeys("nikhil@appinessworld.com"); // Email id
		driver.findElement(By.name("password")).sendKeys("12345678"); // Password
		driver.findElement(By.xpath("/html/body/app-root/app-login/div/form/button")).click();// Login Button
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@class = 'dot-icon']//span[@class = 'icon-bar']")).click(); // Profile
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class ='name-hover']//a[contains(text(),'Logout')]")).click(); // Logout
	}


}
