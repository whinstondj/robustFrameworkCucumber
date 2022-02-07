package repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsElements {
	WebDriver driver;
	
	public ContactUsElements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="input-name")
	WebElement nameField;

	@FindBy(id="input-email")
	WebElement emailField;

	@FindBy(id="input-enquiry")
	WebElement enquiryField;

	@FindBy(xpath="//*[@id=\"content\"]/form/div/div/input")
	WebElement clickButton;

	@FindBy(linkText="Continue")
	WebElement continueButton;
	
	public WebElement nameFieldElement() {
		return nameField;
	}

	public WebElement emailFieldElement() {
		return emailField;
	}
	
	public WebElement enquiryFieldElement() {
		return enquiryField;
	}

	public WebElement clickButtonElement() {
		return clickButton;
	}

	public WebElement continueButtonElement() {
		return continueButton;
	}


}
