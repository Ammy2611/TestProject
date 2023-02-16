package FBookTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BrowserPk.BrowserClass;
import FacbookPom.LogInOrSignUp;
import FacbookPom.SingUpPage;

public class TestNG extends BrowserClass {
	WebDriver driver;
	@Parameters("browser")
//	@BeforeSuite
//	public void beforeSuite() {
//		System.out.println("BeforeSuite");
//		
//	}
//	
//	@BeforeTest
//	public void beforeTest() {
//		System.out.println("BeforeTest");
//		}
	@BeforeTest
	public void openBrowser(String browserName) {
		if (browserName.equals("Chrome")) {
			driver= openCromeBrowser();
		}
		if (browserName.equals("Firefox")) {
			driver=openFireFoxBrowser();
		}
	//	"D:\Internet Explorer\IEDriverServer.exe"
		if (browserName.equals("InternetExplorer")) {
			 System.setProperty("webdriver.ie.driver","D:\\Internet Explorer\\IEDriverServer.exe");
				
			 driver= new InternetExplorerDriver();
		}
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		}
	



	

	@BeforeMethod
	public void openURL() {
		driver.navigate().to("https://www.facebook.com");
		
//		LogInOrSignUp logInOrSignUp =new LogInOrSignUp(driver);
		
		
	}
	
	@Test 
	public void singUp() throws InterruptedException {
		
		LogInOrSignUp logInOrSignUp =new LogInOrSignUp(driver);
		Thread.sleep(2000);

		logInOrSignUp.ClickOnCreatNA();
		Thread.sleep(2000);
		logInOrSignUp.SendFirstN();
		logInOrSignUp.SendLastN();
		logInOrSignUp.SendMobileN();
	Thread.sleep(2000);
		logInOrSignUp.SelectDay();
		logInOrSignUp.SelectMonth();
		logInOrSignUp.SelectYear();
		Thread.sleep(2000);
		logInOrSignUp.SelectGender();
		
		String url=driver.getCurrentUrl();
		
		System.out.println(url);
		String titel=driver.getTitle();
		System.out.println(titel);
		String expectedURl="https://www.facebook.com/";
		String expectedTitel="Facebook – log in or sign up";
		
		
		SoftAssert soft = new SoftAssert();/// For Soft Assert Object creation & AssertAll method is Requierd (Manditery)
		
		soft.assertEquals(titel, expectedTitel,"Titel");
		
//		soft.assertNotEquals(url, expectedURl);
		
//		boolean result=url.equals(expectedURl);
//		soft.assertFalse(result);
//		soft.assertTrue(result);    
		
		
		soft.assertAll();
		
		Assert.assertEquals(url, expectedURl,"URL");  //url/Data & ExpectedURL are Match the Result is Pass
//		Assert.assertNotEquals(url, expectedURl);//url/Data & ExpectedURL Are Not Match the Result is Pass/True
		//		boolean result=url.equals(expectedURl);
		//		Assert.assertTrue(result);//url/Data & ExpectedURL Are Match the Result is Pass/True
		
//		Assert.assertFalse(result);////url/Data & ExpectedURL Are Not Match the Result is Pass/True
		
//		Assert.fail();
//		if (url.equals(expectedURl) && titel.equals(expectedTitel))
//			{
//				Assert.fail();
//			}
//		if (url.equals(expectedURl) && titel.equals(expectedTitel))
//		{
//			System.out.println("Pass");
//		}
//		else {
//			System.out.println("Fail");
//		}
		
	}
	
	@Test 
	public void ClickTerms() throws InterruptedException {
		
       SingUpPage singUpPage =new SingUpPage(driver);
		
		singUpPage.ClickACreation();
		Thread.sleep(2000);
		singUpPage.ClickOnLM();
		
		
		
		
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String titel=driver.getTitle();
		System.out.println(titel);
		String expectedURl="https://www.facebook.com";
		String expectedTitel="Facebook � log in or sign up";
		
		if (url.equals(expectedURl) && titel.equals(expectedTitel))
		{
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		
	}
	
	@AfterMethod
	public void Closet() {
//	driver.close();
//		driver.navigate().back();
		
	}
	
	@AfterTest
	public void Quit() {
		driver.quit();
	}
	
	
//	@AfterTest
//	public void afterTest() {
//		System.out.println("AfterTest");
//	}
//	@AfterSuite
//	public void afterSuite() {
//		System.out.println("AfterSuite");
//	}
//	
	
	
	
	
	
	
	
	
	
	
	

}
