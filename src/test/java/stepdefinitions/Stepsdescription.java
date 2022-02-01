package stepdefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Stepsdescription {
	
    @Given("^iam a website visitor$")
    public void iam_a_website_visitor()  {
    }

    @When("^I click on the contact link$")
    public void i_click_on_the_contact_link()  {
    }

    @Then("^the contact us form is loaded$")
    public void the_contact_us_form_is_loaded() {
    }

    @And("^I see the contact link$")
    public void i_see_the_contact_link()  {
    }

    @Given("^I am in the contact page$")
    public void i_am_in_the_contact_page() {
    }

    @When("^I see the form and fill the information for (.+) and (.+) with (.+)$")
    public void i_see_the_form_and_fill_the_information_for_and_with(String username, String useremail, String userenquiry) {
    }

    @Then("^I return to contact us page$")
    public void i_return_to_contact_us_page() {
    }

    @And("^I send the user information$")
    public void i_send_the_user_information() {
    }

}
