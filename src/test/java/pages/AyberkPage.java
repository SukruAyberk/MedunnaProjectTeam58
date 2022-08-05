package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AyberkPage {

    public AyberkPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@aria-haspopup='true']")
    public WebElement user_symbol;

    @FindBy(xpath = "//*[text()='Register']")
    public WebElement register_button;

    @FindBy(xpath = "//input[@name='firstPassword']")
    public WebElement new_password_textbox;

}
