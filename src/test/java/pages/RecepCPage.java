package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class RecepCPage {
    public RecepCPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "account-menu")
    public WebElement account;

    @FindBy(id = "login-item")
    public WebElement girisSignin;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement username;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement kullaniciSigninButton;

    @FindBy(id = "entity-menu")
    public WebElement myPagesMenu;

    @FindBy(xpath = "//a[@class='dropdown-item']")
    public WebElement myAppointments;

    @FindBy(xpath = "//td[1]")
    public List<WebElement> idTabloList;

    @FindBy(id = "appointment-id")
    public WebElement idTextBox;

    @FindBy(xpath = "//input[@name='startDate']")
    public WebElement startDateTextBox;

    @FindBy(xpath = "//input[@name='endDate']")
    public WebElement endDateTextBox;

    @FindBy(id = "appointment-status")
    public WebElement statusTextBox;

    @FindBy(xpath = "//textarea[@name='anamnesis']")
    public WebElement anamnesisTextBox;

    @FindBy(xpath = "//textarea[@name='treatment']")
    public WebElement treatmentTextBox;

    @FindBy(xpath = "//textarea[@name='diagnosis']")
    public WebElement diagnosisTextBox;

    @FindBy(id = "appointment-prescription")
    public WebElement prescriptionTextBox;

    @FindBy(id = "appointment-description")
    public WebElement descriptiontionTextBox;

    @FindBy(id = "appointment-physician")
    public WebElement physicianTextBox;

    @FindBy(id = "save-entity")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement editSaveOnay;

    @FindBy(className = "btn btn-success btn-sm")
    public WebElement requestATest;

    @FindBy(xpath = "//tr/td[2]")
    public List<WebElement> testName;
}
