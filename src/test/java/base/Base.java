package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	protected WebDriver driver;
	protected String browser = "Edge";
	
	public WebDriver getDriver() {
		if ((browser.equals("Chrome")) || (browser.equals(""))) {
			System.setProperty("webdriver.chrome.driver","D:\\driversParaNavegadores\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		if ((browser.equals("Firefox")) || (browser.equals("ff"))) {
			System.setProperty("webdriver.gecko.driver","D:\\driversParaNavegadores\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		if (browser.equals("Edge")) {
			System.setProperty("webdriver.edge.driver","D:\\driversParaNavegadores\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		
		return driver;
	}
	
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getBrowser() {
		return browser;
	}
	
	public void setBrowser(String browser) {
		this.browser = browser;
	}
	
	
	
}
