package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.FormsEnglishPage;
import pages.FormsPortuguesePage;
import utilities.ConfigReader;
import utilities.Driver;


public class Forms_App_Step_Definitions {
    FormsPortuguesePage formsPortuguesePage = new FormsPortuguesePage();
    FormsEnglishPage formsEnglishPage = new FormsEnglishPage();

    @Given("user goes to the url")
    public void user_goes_to_the_url() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @Then("user verifies {string} title")
    public void user_verifies_title(String title) {
        String expectedTitle = "This is a Liferay Forms";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(expectedTitle.equals(actualTitle));
    }

    @Then("user enters name {string}")
    public void user_enters_name(String name) {
        formsEnglishPage.nameBox.sendKeys(name);

    }

    @Then("user enters date of birth {string}")
    public void user_enters_date_of_birth(String dateOfBirth) {
//        Driver.wait(5);
//        formsEnglishPage.dateButtonClick.click();
//        formsEnglishPage.dateOfBirthButton.click();

        Driver.waitAndClick(formsEnglishPage.dateButtonClick);
        Driver.waitAndClick(formsEnglishPage.dateOfBirthButton);
        //I tried to use different formats to choose the date, but only with this method I could automate it.

    }

    @Then("user enters a text {string} in the box")
    public void user_enters_a_text_in_the_box(String text) {
        formsEnglishPage.textBox.sendKeys(text);
    }

    @Then("user clicks submit button")
    public void user_clicks_submit_button() {
        formsEnglishPage.submitButton.click();
    }

    @Then("user verifies success message")
    public void user_verifies_success_message() {
        //Driver.wait(2);
        Driver.waitForVisibility(formsEnglishPage.successMessageText, 2);
        Assert.assertTrue(formsEnglishPage.successMessageText.isDisplayed());

    }

    @Then("user closes the application")
    public void user_closes_the_application() {
        Driver.closeDriver();
    }

    @Then("user enters name2 {string}")
    public void user_enters_name2(String name2) {
        formsEnglishPage.nameBox.sendKeys(name2);
    }

    @Then("user enters text {string} in the box")
    public void user_enters_text_in_the_box(String blankText) {
        formsEnglishPage.textBox.sendKeys(blankText);
    }

    @Then("user enters name3 {string}")
    public void user_enters_name3(String name3) {
        formsPortuguesePage.nameBox.sendKeys(name3);
    }

    @Then("user enters a future date of birth {string}")
    public void user_enters_a_future_date_of_birth(String futureDateOfBirth) {
        formsEnglishPage.dateButtonClick.click();
        formsEnglishPage.futureDate.click();
    }

    @Then("user enters a text with {string} in the box")
    public void user_enters_a_text_with_in_the_box(String textWithSpecCharAndNumber) {
        formsPortuguesePage.textBoxP.sendKeys(textWithSpecCharAndNumber);
    }

    @Given("user clicks language icon and navigates to portuguese form page")
    public void user_clicks_language_icon_and_navigates_to_portuguese_form_page() {
        Driver.waitAndClick(formsEnglishPage.englishButton);
        Driver.waitAndClick(formsEnglishPage.portugueseButton);
    }

}
