package stepdefinitions;


import org.junit.Assert;

import base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import repository.ContactUsElements;
import repository.HomePageElements;


public class Stepsdescription extends Base {
	HomePageElements homePageElement;
	ContactUsElements contactUsElement;

	
	@Before
	public void openBrowser() {
    	//setBrowser(browser);
    	driver = getDriver();		
    	homePageElement = new HomePageElements(driver);
    	contactUsElement = new ContactUsElements(driver);
	}

	@After
	public void closeBrowser() {
    	driver.close();	
	}
	
	
    @Given("^I am a website visitor$")
    public void i_am_a_website_visitor()  {
    	driver.get("https://winstoncastillo.com/robot-selenium/");
    	Assert.assertTrue(driver.getTitle().equals("La tienda de Winston Castillo"));
    }

    @When("^I click on the contact link$")
    public void i_click_on_the_contact_link()  {
    	homePageElement.contactUsElement().click();
    }

    @Then("^the contact us form is loaded$")
    public void the_contact_us_form_is_loaded() {
		Assert.assertTrue(driver.getTitle().equals("Contact Us"));
    }

    @And("^I see the contact link$")
    public void i_see_the_contact_link()  {
		Assert.assertTrue(homePageElement.contactUsElement().isDisplayed());
    }

    @Given("^I am in the contact page$")
    public void i_am_in_the_contact_page() {
    	driver.get("https://winstoncastillo.com/robot-selenium/index.php?route=information/contact");
    	Assert.assertTrue(driver.getTitle().equals("Contact Us"));
   }

    @When("^I see the form and fill the information for (.+) and (.+) with (.+)$")
    public void i_see_the_form_and_fill_the_information_for_and_with(String username, String useremail, String userenquiry) {
		contactUsElement.nameFieldElement().sendKeys(username);
		contactUsElement.emailFieldElement().sendKeys(useremail);
		contactUsElement.enquiryFieldElement().sendKeys(userenquiry);
    }

    @Then("^I send the user information$")
    public void i_send_the_user_information() {
		contactUsElement.clickButtonElement().click();    	
    }

    @And("^I return to contact us page$")
    public void i_return_to_contact_us_page() {
    	contactUsElement.continueButtonElement().click();
    	Assert.assertTrue(driver.getTitle().equals("La tienda de Winston Castillo"));
    	homePageElement.contactUsElement().click();
    }

}
