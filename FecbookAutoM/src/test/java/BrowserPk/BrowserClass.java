package BrowserPk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserClass {

	public static WebDriver openCromeBrowser() {
		 System.setProperty("webdriver.chrome.driver","D:\\Velocity Class material\\Selenium Auto\\chromedriver.exe");
			
		WebDriver driver= new ChromeDriver();
	return driver;
	}
	
	public static WebDriver openFireFoxBrowser() {
		 System.setProperty("webdriver.gecko.driver","D:\\Fierfox\\geckodriver.exe");
			
		 WebDriver driver= new FirefoxDriver();
		
			return driver;

	}
	
	
}
