package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FormsPortuguesePage {

    public FormsPortuguesePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='alert alert-dismissible alert-danger']")
    public WebElement errorMessageForDate;

    @FindBy(linkText = "Cancel")
    public WebElement cancelButton;


}
