package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FormsPortuguesePage {

    public FormsPortuguesePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "senna_surface1")
    public WebElement pageTextAssert;

    @FindBy(xpath = "//h1[@class='ddm-form-name']")
    public WebElement headerText;

    @FindBy(xpath = "//input[@class='form-control ddm-field-text']")
    public WebElement nameBox;

    @FindBy(xpath = "//button[@class='date-picker-dropdown-toggle btn btn-unstyled']")
    public WebElement dateButtonClick;

    @FindBy(xpath = "//button[@aria-label='2021 12 14']")
    public WebElement dateOfBirthButton;

    @FindBy(xpath = "//textarea[@class='ddm-field-text form-control']")
    public WebElement textBoxP;

    @FindBy(xpath = "//button[@id='ddm-form-submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//h1[contains(text(),'Information sent')]")
    public WebElement successMessageText;

    @FindBy(id = "ToastAlertContainer")
    public WebElement successAlertMessage;

    @FindBy(xpath = "//*[@class='alert alert-dismissible alert-danger']")
    public WebElement errorMessageForDate;

    @FindBy(linkText = "Cancel")
    public WebElement cancelButton;


}
