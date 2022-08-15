package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ElvinaPage{
    public ElvinaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id = "account-menu")
    public WebElement accountMenu;

    @FindBy(xpath = "//span[text()='Settings']")
    public WebElement settingButonu;

    @FindBy(id = "settings-title")
    public WebElement settingsForUserText;

    @FindBy(xpath = "//input[@id='firstName']")
    public WebElement firstnameUpdate;

    @FindBy(xpath = "//input[@id='lastName']")
    public WebElement lastnameUpdate;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement eMailUpdate;

    @FindBy(xpath = "//span[text()='Save']")
    public WebElement saveButonu;



}
