package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FormsEnglishPage {
    public FormsEnglishPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//h1[contains(text(),'This is a Liferay Forms')]")
    public WebElement formsText;

    @FindBy(xpath = "//input[@class='form-control ddm-field-text']")
    public WebElement nameBox;

    @FindBy(xpath = "(//div[@class='form-feedback-item'])[1]") //(//div[contains(text(),'This field is required')])[1]
    public WebElement fieldRequiredMessageUnderName;

    @FindBy(xpath = "//input[@class='form-control input-group-inset input-group-inset-after']")
    public WebElement dateOfBirthBox;

    @FindBy(xpath = "(//div[@class='form-feedback-item'])[2]") //(//div[contains(text(),'This field is required')])[2]
    public WebElement fieldRequiredMessageUnderDateBox;

    @FindBy(xpath = "//textarea[@class='ddm-field-text form-control']")
    public WebElement textBox;

    @FindBy(xpath = "(//div[@class='form-feedback-item'])[3]") //(//div[contains(text(),'This field is required')])[3]
    public WebElement fieldRequiredMessageUnderTextBox;

    @FindBy(xpath = "//button[@id='ddm-form-submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//h1[contains(text(),'Information sent')]")
    public WebElement successMessageText;

    @FindBy(id = "ToastAlertContainer")
    public WebElement successAlertMessage;

    @FindBy(xpath = "//span[contains(text(),'This form is invalid. Check field What is the date of your birth?.')] ")
    public WebElement dateRequiredMessage;

    @FindBy(xpath = "//span[@class='inline-item']")
    public WebElement englishOption;

    @FindBy(xpath = "//a[@class=' lfr-icon-item taglib-icon']")
    public WebElement portugueseOption;

}
