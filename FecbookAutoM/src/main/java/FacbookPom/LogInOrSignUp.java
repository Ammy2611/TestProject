package FacbookPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LogInOrSignUp {
	@FindBy(xpath="(//a[contains(@class,'_42ft _4jy0 ')])[1]")
	private WebElement clickOnCreatNewA ;
	
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement clickOnFristN;
	
	@FindBy (xpath="//input[@name='lastname']")
	private WebElement clickOnLastN;
	
	@FindBy(xpath="//input[@name='reg_email__']")
	private WebElement clickOnMobileN;
	
	@FindBy(xpath="//select[@name='birthday_day']")
	private WebElement selectDay ;
	
	@FindBy(xpath="//select[@title='Month']")
	private WebElement selectMonth;
	
	@FindBy(xpath="//select[@title='Year']")
	private WebElement selectYear;
	
	@FindBy(xpath ="(//input[@type='radio'])[2]")
	private WebElement selectRadioB;
	
	public LogInOrSignUp (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnCreatNA() {
		clickOnCreatNewA.click();
		
		
	}
	public void SendFirstN() {
			clickOnFristN.sendKeys("Amey");
			clickOnFristN.click();
		}
			
		
	public void SendLastN() {
				clickOnLastN.sendKeys("Shewale");
				clickOnLastN.click();
			}
	public void SendMobileN() {
		clickOnMobileN.sendKeys("8975285364");
	
	}
				
					
	public void SelectDay() {
		Select D= new Select(selectDay);
		D.selectByIndex(25);
		
	}
	public void SelectMonth() {

		Select M= new Select(selectMonth);
		M.selectByVisibleText("Nov");
	
	}
	public void SelectYear() {
		Select Y = new Select(selectYear);
		Y.selectByVisibleText("1994");
		
	}
	
	public void SelectGender() {
		selectRadioB.click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
