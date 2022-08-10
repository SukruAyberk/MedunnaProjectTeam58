package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class OrtakLocatePages {
    public OrtakLocatePages(){PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//li[@id='account-menu']")
    public WebElement profilSimgesi;

    @FindBy(xpath = "//*[text()='Sign in']")
    public WebElement signInSekmesi1;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButonu2;

    @FindBy(xpath = "//*[text()='MY PAGES']")
    public WebElement myPagesButonu;

    @FindBy(xpath = "//*[text()='My Appointments']")
    public WebElement myAppointmentsButonu;

    @FindBy(xpath = "//*[text()='My Patients']")
    public WebElement myPatientsButonu;

    @FindBy(xpath = "//*[text()='My Inpatients']")
    public WebElement myInpatientButonu;



}
