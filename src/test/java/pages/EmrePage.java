package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EmrePage {

    public EmrePage() {
        PageFactory.initElements(Driver.getDriver(),this); }

    @FindBy (xpath = "//*[text()='Make an']")
    public WebElement makeAppointmentButton;

    @FindBy (xpath = "//div[@class='col']")
    public  WebElement makeAppointmentPage;

    @FindBy (xpath = "//div[@class='col-md-8']")
    public WebElement actualAppointmentTitle;

    @FindBy (xpath = "//input[@name='firstName']")
    public WebElement firstNameButton;

    @FindBy (xpath = "//input[@name='lastName']")
    public WebElement lastNameButton;

    @FindBy (xpath = "//div[text()='Your FirstName is required.']")
    public WebElement firstNameIsntEmpty;

    @FindBy (xpath = "//div[text()='Your LastName is required.']")
    public WebElement lastNameIsntEmpty;

    @FindBy (id = "ssn")
    public WebElement ssnButton;

    @FindBy (xpath = "//div[text()='Your SSN is required.']")
    public WebElement ssnButtonIsntEmpty;

    @FindBy (id = "email")
    public WebElement emailButton;

    @FindBy (xpath = "//div[text()='Your email is required.']")
    public WebElement emailButtonIsntEmpty;

    @FindBy (id = "phone")
    public WebElement phoneButton;

    @FindBy (xpath = "//div[text()='Phone number is required.']")
    public WebElement phoneButtonIsntEmpty;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement sendAnRequestButton;

    @FindBy (xpath = "//*[text()='Appointment registration saved!']")
    public WebElement appointmentAlertMessage;








    }

