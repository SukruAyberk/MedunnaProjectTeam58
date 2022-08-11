package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ErvaPage {
    public  ErvaPage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath="//span[text()='Search Patient']")
    public WebElement searchPatientButonu;


    @FindBy(xpath ="//span[@class='d-none d-md-inline']" )
    public WebElement viewButonu;
}
