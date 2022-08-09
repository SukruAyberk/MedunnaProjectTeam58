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

    @FindBy(xpath = "//a[@class='btn btn-primary btn-sm']")
    public WebElement appointmentEditButonu;

    @FindBy(xpath = "//a[@class='btn btn-danger btn-sm']")
    public WebElement showTestResultButonu;

    @FindBy(xpath = "//span[@class='d-none d-md-inline']")
    public WebElement viewResultButonu;

    @FindBy(xpath = "(//tr//th)[1]")
    public List<WebElement> idList;

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

    @FindBy(xpath = "//*[text()='Edit']")
    public WebElement inpatientEditButton;

    @FindBy(xpath = "//select[@id='in-patient-status']")
    public WebElement statusSekmesi;

    @FindBy(xpath = "//select[@id='in-patient-room']")
    public WebElement roomSekmesi;
}
