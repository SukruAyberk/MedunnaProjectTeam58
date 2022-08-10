package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RecepTPage {
    public RecepTPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//li[@id='account-menu']")
    public WebElement girisDropdown;
    @FindBy(linkText = "Register")
    public WebElement registerButton;
    @FindBy(xpath = "//input[@id='ssn']")
    public WebElement ssnTextBox;
    @FindBy(id = "firstName")
    public WebElement firstNameTextBox;
    @FindBy(id = "lastName")
    public WebElement lastNameTextBox;
    @FindBy(id = "username")
    public WebElement userNameTextBox;
    @FindBy(id = "email")
    public WebElement emailTextBox;
    @FindBy(id = "firstPassword")
    public WebElement firstPasswordTextBox;
    @FindBy(id = "secondPassword")
    public WebElement secondPasswordTextBox;
    @FindBy(id = "register-submit")
    public WebElement registerSubmitButton;
    @FindBy(xpath = "//*[text()='Your SSN is required.']")
    public WebElement errorBlankSsnMessage;
    @FindBy(xpath = "//*[text()='Your SSN is invalid']")
    public WebElement errorInvalidSsnMessage;
    @FindBy(xpath = "//*[text()='Your FirstName is required.']")
    public WebElement errorFirstNameMessage;
    @FindBy(xpath = "//*[text()='Your LastName is required.']")
    public WebElement errorLastNameMessage;
    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement successMessageToastContainer;
    @FindBy(xpath = "//*[text()='Your username is required.']")
    public WebElement errorBlankUsernameMessage;
    @FindBy(xpath = "//*[text()='Your email is required.']")
    public  WebElement errorBlankEmailMessage;
    @FindBy(xpath = "//*[text()='This field is invalid']")
    public WebElement errorInvalidEmailMessage;

}
