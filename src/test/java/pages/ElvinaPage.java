package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ElvinaPage{
    public ElvinaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='dropdown-item active']")
    public WebElement settingButonu;

    @FindBy(xpath = "//input[@id='firstName']")
    public WebElement firstnameGuncelleme;

    @FindBy(xpath = "//input[@id='lastName']")
    public WebElement lastnameGuncelleme;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement eMailGuncelleme;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveButonu;



}
