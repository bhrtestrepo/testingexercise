package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.FormsEnglishPage;
import pages.FormsPortuguesePage;

public class Forms_App_Step_Definitions {
    FormsPortuguesePage formsPortuguesePage = new FormsPortuguesePage();
    FormsEnglishPage formsEnglishPage = new FormsEnglishPage();

    @Given("user goes to the url")
    public void user_goes_to_the_url() {

    }
    @Then("user verifies {string} title")
    public void user_verifies_title(String string) {

    }
    @Then("user enters {string}")
    public void user_enters(String string) {

    }
    @Then("user enters a {string} in the box")
    public void user_enters_a_in_the_box(String string) {

    }
    @Then("user clicks submit button")
    public void user_clicks_submit_button() {

    }
    @Then("user verifies {string} message")
    public void user_verifies_message(String string) {

    }
    @Then("user closes the application")
    public void user_closes_the_application() {

    }
    @Then("user verifies This field is required message under date box")
    public void user_verifies_this_field_is_required_message_under_date_box() {

    }
    @Then("user verifies This field is required message under text box")
    public void user_verifies_this_field_is_required_message_under_text_box() {

    }

    @Given("user clicks language icon and navigates to portuguese form page")
    public void user_clicks_language_icon_and_navigates_to_portuguese_form_page() {

    }
}
