package groupProfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Add_School {

	WebDriver driver;
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
		driver.findElement(By.xpath("//button[@class = \"btn btn-small btn-primary-2 icnbttn\"]")).click(); // Add School
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@class = 'nav-link selected']")).click(); // Basic Details
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@class = 'form-control ng-pristine ng-invalid ng-touched' and @id = 'schoolName']")).sendKeys("Ruh International School");// School Name
		Thread.sleep(8000);
		driver.findElement(By.xpath("//input[@class = 'form-control ng-pristine ng-invalid ng-touched' and @id = 'schoolAcronym']")).sendKeys("RIS"); // ACRONYM
		Thread.sleep(8000);


	
	}
}
