package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class BahattinPage {
    public BahattinPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath ="//*[@id='entity-menu']/a/span")
    public WebElement mypages;

    @FindBy(xpath = "//*[@id='entity-menu']/div/a[1]/span")
    public WebElement myappointments;

    @FindBy(xpath ="//h2")
    public WebElement Appoinments;

    @FindBy(xpath="//input[@id='fromDate']")
    public WebElement fromDate;

    @FindBy(xpath="//input[@id='toDate']")
    public WebElement toDate;

    @FindBy(xpath="(//table[@class='table'])/tbody/tr/td[1]")
    public WebElement patientId;

    @FindBy(xpath="(//table[@class='table'])/tbody/tr/td[1]")
    public WebElement startDate;

    @FindBy(xpath="(//table[@class='table'])/tbody/tr/td[3]/span")
    public WebElement endDate;

    @FindBy(xpath="(//table[@class='table'])/tbody/tr/td[4]/span")
    public WebElement status;


}

