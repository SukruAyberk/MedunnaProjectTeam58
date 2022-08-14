package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class CigdemAPage {
    public CigdemAPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[@class='dropdown-item'])[3]")
    public WebElement myInpatient;

    @FindBy(xpath = "//span[text()='Edit']")
    public WebElement appointmentEditButonu;

    @FindBy(xpath = "//*[text()='Show Test Results']")
    public WebElement showTestResultButonu;

    @FindBy(xpath = "//span[@class='d-none d-md-inline']")
    public WebElement viewResultButonu;

    @FindBy(xpath = "(//tr//th)[1]")
    public List<WebElement> idList;

    @FindBy(xpath = "(//tr//th)[2]")
    public List<WebElement> nameList;

    @FindBy(xpath = "(//tr//th)[4]")
    public List<WebElement> defaultMinValueList;

    @FindBy(xpath = "(//tr//th)[5]")
    public List<WebElement> defaultMaxValueList;

    @FindBy(xpath = "((//tr//th)[6])")
    public  List<WebElement> testList;

    @FindBy(xpath ="(//tr//th)[7]")
    public List<WebElement> descriptionList;

    @FindBy(xpath ="(//tr//th)[8]")
    public List<WebElement> dateList;

    @FindBy(xpath ="//*[text()='Request Inpatient']")
    public WebElement requestInpatientButonu;

    @FindBy(xpath = "//div[text()='InPatient request already done for this appointment']")
    public WebElement inpatientMessage;

    @FindBy(xpath = "//*[text()='My Inpatients']")
    public WebElement myInpatientButonu;

    @FindBy(xpath = "(//tr//th)[1]")
    public List<WebElement> hastaIdListesi;

    @FindBy(xpath = "(//tr//th)[2]")
    public List<WebElement> startDateList;

    @FindBy(xpath = "(//tr//th)[3]")
    public List<WebElement> endDateList;

    @FindBy(xpath ="(//tr//th)[4]")
    public List<WebElement> statusList;

    @FindBy(xpath = "(//tr//th)[5]")
    public List<WebElement> descriptionList2;

    @FindBy(xpath = "(//tr//th)[6]")
    public List<WebElement> createDateList;

    @FindBy(xpath = "(//tr//th)[7]")
    public List<WebElement> roomList;

    @FindBy(xpath = "(//tr//th)[8]")
    public List<WebElement> appointmentList;

    @FindBy(xpath = "(//tr//th)[9]")
    public List<WebElement> patientList;

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
    public WebElement hastaRoomİd;
}