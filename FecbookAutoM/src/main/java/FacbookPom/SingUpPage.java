package FacbookPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SingUpPage {
	@FindBy(xpath="(//a[contains(@class,'_42ft _4jy0 ')])[1]")
	private WebElement clickOnCreatNewA ;
	
	
	@FindBy (xpath ="//a[@id='non-users-notice-link']")
	private WebElement clickOnLearnMore;
	
	
	public SingUpPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void ClickACreation() {
		clickOnCreatNewA.click();
	}
	
	public void ClickOnLM() {
		clickOnLearnMore.click();
		
		
	}
}
