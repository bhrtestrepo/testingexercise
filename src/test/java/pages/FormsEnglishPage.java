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

    @FindBy(xpath = "//button[@class='date-picker-dropdown-toggle btn btn-unstyled']")
    public WebElement dateButtonClick;

    //these locators are changed, I've found new locators below
//    @FindBy(xpath = "//button[@aria-label='2021 12 14']")
//    public WebElement dateOfBirthButton;
//
//    @FindBy(xpath = "//button[@aria-label='2026 12 23']")
//    public WebElement futureDate;

    @FindBy(css = "button[aria-label='Wed Dec 01 2021']")
    public WebElement dateOfBirthButton;

    @FindBy(css = "button[aria-label='Fri Dec 31 2021']")
    public WebElement futureDate;

    @FindBy(xpath = "//textarea[@class='ddm-field-text form-control']")
    public WebElement textBox;

    @FindBy(xpath = "//button[@id='ddm-form-submit']")
    public WebElement submitButton;

//    @FindBy(xpath = "//h1[contains(text(),'Information sent')]")
//    public WebElement successMessageText;
    @FindBy(xpath = "//h1[@class='ddm-form-name']")
    public WebElement successMessageText;


    @FindBy(id = "uvlz____")
    public WebElement englishButton;

    @FindBy(xpath = "//span[@class='taglib-text-icon']")
    public WebElement portugueseButton;



}
