package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CigdemAPage {
    public CigdemAPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[@class='dropdown-item'])[3]")
    public WebElement myInpatient;

    @FindBy(xpath = "//tr[1]/td[13]//span/span")
    public WebElement appointmentEditButonu;

    @FindBy(xpath = "//*[text()='Show Test Results']")
    public WebElement showTestResultButonu;

    @FindBy(xpath = "//span[@class='d-none d-md-inline']")
    public WebElement viewResultButonu;


    @FindBy(xpath = "//button[@class='btn btn-warning btn-sm']")
    public WebElement yatisTalepButonu;

    @FindBy(xpath = "//*[text()='My Inpatients']")
    public WebElement myInpatientButonu;

    @FindBy(xpath = "//div[@class='btn-group flex-btn-group-container']")
    public WebElement inpatientEditButton;

    @FindBy(xpath = "//select[@id='in-patient-status']")
    public WebElement statusSekmesi;

    @FindBy(xpath = "//select[@id='in-patient-room']")
    public WebElement roomSekmesi;

    @FindBy(xpath = "//li[@class='dropdown show nav-item']")
    public WebElement myPagesDogrulama;

    @FindBy(xpath = "//h2[@id='appointment-heading']")
    public WebElement appointmentYazisi;

    @FindBy(xpath = "//span[text()='Tests']")
    public WebElement testsYazisi;

    @FindBy(xpath = "//span[text()='Test Results']")
    public WebElement testResultYazisi;

    @FindBy(xpath = "//table[@class='table']" )
    public WebElement hastaBilgileri;


    @FindBy(xpath = "//*[text()='In Patients']")
    public WebElement inPatientYazisi;

    @FindBy(xpath = "//*[text()='Create or edit a In Patient']")
    public WebElement createOrEditInpatientYazisi;

    @FindBy(xpath ="//*[contains (text(),'The In Patient is updated with identifier')]")
    public WebElement roomGuncellemeYazisi;

    @FindBy(xpath = "//select[@name='room.id']")
    public WebElement hastaRoomId;

    @FindBy(xpath = "//*[text()='InPatient request already done for this appointment']")
    public WebElement zatenYatanHastaAlerti;

    @FindBy(xpath = "//div[text()='InPatient request already done for this appointment']")
    public WebElement inpatientMessage;

    @FindBy(xpath = "//div[text()='A new In Patient is created with identifier']")
    public WebElement inpatientSuccessfulyMessage;
}