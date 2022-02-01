package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class SendingInformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\driversParaNavegadores\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		
		
		driver.get("https://winstoncastillo.com/robot-selenium/");
		Assert.assertTrue(driver.getTitle().equals("La tienda de Winston Castillo"));
		driver.findElement(By.linkText("Contact Us")).click();
		
		Assert.assertTrue(driver.getTitle().equals("Contact Us"));
		driver.findElement(By.id("input-name")).sendKeys("User 01");
		driver.findElement(By.id("input-email")).sendKeys("user@mail.com");
		driver.findElement(By.id("input-enquiry")).sendKeys("This is an enquiry for more than 10 chars");
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input")).click();

		
		
	}

}
