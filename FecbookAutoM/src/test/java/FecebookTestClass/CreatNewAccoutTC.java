package FecebookTestClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import FacbookPom.LogInOrSignUp;

public class CreatNewAccoutTC {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Velocity Class material\\Selenium Auto\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		LogInOrSignUp logInOrSignUp =new LogInOrSignUp(driver);
		
		logInOrSignUp.ClickOnCreatNA();
		logInOrSignUp.SendFirstN();
		logInOrSignUp.SendLastN();
		logInOrSignUp.SendMobileN();
	
		logInOrSignUp.SelectDay();
		logInOrSignUp.SelectMonth();
		logInOrSignUp.SelectYear();
		logInOrSignUp.SelectGender();
		
		
		
		
		
		
	}
	

}
