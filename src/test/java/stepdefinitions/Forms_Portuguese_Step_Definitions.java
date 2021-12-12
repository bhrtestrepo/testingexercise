package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.FormsPortuguesePage;
import utilities.Driver;

public class Forms_Portuguese_Step_Definitions {

    FormsPortuguesePage formsPortuguesePage = new FormsPortuguesePage();


    @Then("user verifies the {string} title in portuguese")
    public void user_verifies_the_title_in_portuguese(String title) {
        Assert.assertTrue(formsPortuguesePage.pageTextAssert.isDisplayed());
    }
    @Then("user enters name {string} in portuguese page")
    public void user_enters_name_in_portuguese_page(String name) {
        Driver.waitAndSendText(formsPortuguesePage.nameBox,"Loren Williams");
    }
    @Then("user enters date of birth {string} in portuguese page")
    public void user_enters_date_of_birth_in_portuguese_page(String dateOfBirth) {

       Driver.waitAndClick(formsPortuguesePage.dateButtonClick);
       Driver.waitAndClick(formsPortuguesePage.dateOfBirthButton);
    }
    @Then("user enters a text {string} in the box in portuguese page")
    public void user_enters_a_text_in_the_box_in_portuguese_page(String text) {
        formsPortuguesePage.textBoxP.sendKeys("This is a test");
    }
    @Then("user clicks submit button in portuguese page")
    public void user_clicks_submit_button_in_portuguese_page() {
        formsPortuguesePage.submitButton.click();
    }
    @Then("user verifies success message in portuguese page")
    public void user_verifies_success_message_in_portuguese_page() {
        //Assert.assertTrue(formsPortuguesePage.headerText.getText().equals("Este é um Liferay Forms"));

        //In our case, one example for the real assertion should have been as below if we could have seen the success message.
        //Assert.assertFalse(formsPortuguesePage.headerText.getText().equals("Este é um Liferay Forms"));

        Assert.assertTrue(formsPortuguesePage.successMessageText.isDisplayed());
    }



}
