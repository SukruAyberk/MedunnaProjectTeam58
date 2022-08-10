package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class OrtakLocatePages {
    public OrtakLocatePages(){PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//div[@id='login-title']")
    public WebElement signInYazisi;

    @FindBy(xpath = "//li[@id='account-menu']")
    public WebElement profilSimgesi;

    @FindBy(xpath = "//li[@class='dropdown show nav-item']")
    public WebElement userDropdownDogrulama;

    @FindBy(xpath = "//a[@id='login-item']")
    public WebElement signInButton1;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButonu2;

    @FindBy(xpath = "//span[text()='adminteam58 adminteam58']")
    public WebElement adminGirisDogrulama;

    @FindBy(xpath = "//*[text()='MY PAGES']")
    public WebElement myPagesButonu;

    @FindBy(xpath = "//*[text()='My Appointments']")
    public WebElement myAppointmentsButonu;

    @FindBy(xpath = "//*[text()='My Patients']")
    public WebElement myPatientsButonu;

    @FindBy(xpath = "//*[text()='My Inpatients']")
    public WebElement myInpatientButonu;

    @FindBy(xpath = "//span[text()='StaffTeam58 StaffTeam58']")
    public WebElement staffGirisiDogrulama;

    @FindBy(xpath = "//span[text()='DoktorTeam58 DoktorTeam58']")
    public WebElement doktorGirisiDogrulama;

    @FindBy(xpath = "//span[text()='HastaTeam58 HastaTeam58']")
    public WebElement hastaGirisiDogrulama;

    @FindBy(xpath = "//span[text()='user Team58']")
    public WebElement userGirisiDogrulama;



}
