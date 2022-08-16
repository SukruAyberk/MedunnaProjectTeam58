package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class ErvaPage {
    public  ErvaPage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath="//span[text()='Search Patient']")
    public WebElement searchPatientButonu;


    @FindBy (xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div/table/tbody/tr")
    public List<WebElement> patientDatenList;


    @FindBy (xpath = "(//a[@class='btn btn-primary btn-sm'])[1]")
    public WebElement editButonu;

    @FindBy (xpath="//span[text()='Create or edit a Patient']")  //DÜZENLENEBİLİR OLDUGUNU TEST EDER YAZIYA MI BAKCAZ
    public WebElement editButonuTestEt;

    @FindBy (xpath = "//button[@id='save-entity']")    //DÜZENLENEBİLİR OLDUGUNU TEST EDER SAVE BUTONUNA MI BAKCAZ
    public WebElement saveButou;

    @FindBy (xpath = "//input[@name='ssn']")
    public WebElement ssnKismi;

    @FindBy (xpath = "(//a[@class='btn btn-info btn-sm'])[1]")
    public WebElement viewButonu;

    @FindBy (xpath = "//*[@class='jh-entity-details']")
    public WebElement kayitBilgileri;

    @FindBy(xpath = "//input[@name='id']")
    public WebElement id;

    @FindBy (xpath="//input[@name='firstName']")
    public WebElement firstName;

    @FindBy (xpath ="//input[@name='lastName']" )
    public WebElement lastname;

    @FindBy (xpath = "//input[@name='birthDate']")
    public WebElement birthDate;

    @FindBy (xpath = "//input[@name='email']")
    public WebElement email;

    @FindBy (xpath = "//input[@name='phone']")
    public WebElement phone;

    @FindBy (xpath = "//select[@name='gender']")
    public WebElement gender;

    @FindBy (xpath = "//input[@name='adress']")
    public WebElement adress;

    @FindBy (xpath = "//textarea[@name='description']")
    public WebElement description;

    @FindBy (xpath = "//select[@name='user.id']")
    public WebElement user;

    @FindBy (xpath = "//select[@name='country.id']")
    public WebElement country;

    @FindBy (xpath = "//select[@name='cstate.id']")
    public  WebElement stateCity;

    @FindBy (xpath = "//select[@name='bloodGroup']")
    public WebElement bloodGroup;

    @FindBy (xpath = "//span[text()='Save']")
    public  WebElement saveButonu;

    @FindBy (xpath = "//a[@class='btn btn-danger btn-sm']")
    public WebElement deleteButton;

    @FindBy(xpath = "//input[@name='adress']")
    public WebElement hastaBilgileriGuncellemeAdressTextBoxElementi;

    @FindBy(xpath = "//div[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']")
    public WebElement alertButton;

    @FindBy (id = "hospitalmsappfrontendApp.patient.delete.question")
    public WebElement deleteButtonConfirmation;

    @FindBy (id="//input[@name='ssn']")
    public WebElement patientSsn;






}
