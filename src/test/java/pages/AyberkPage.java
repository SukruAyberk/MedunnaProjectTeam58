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

    @FindBy(xpath = "//*[text()='Sign in']")
    public WebElement sing_in_button1;

    @FindBy(xpath = "(//*[text()='Sign in'])[3]")
    public WebElement sing_in_button2;

    @FindBy(xpath = "(//ul[@id='header-tabs']//li)[7]")
    public WebElement userTeam58_symbol;

    @FindBy(xpath = "//*[text()='Sign out']")
    public WebElement sing_out_button;

    @FindBy(xpath = "//*[text()='Did you forget your password?']")
    public WebElement did_you_forget_your_password_button;

    @FindBy(xpath = "//*[text()='Failed to sign in!']")
    public WebElement giris_yapilamadi_mesaji;

    @FindBy(xpath = "//*[text()='Cancel']")
    public WebElement cancel_button;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement email;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(id = "rememberMe")
    public WebElement rememberMe_checkbox;

    @FindBy(xpath = "//input[@name='firstPassword']")
    public WebElement new_password_textbox;

    @FindBy(xpath = "(//ul[@id='strengthBar']/li)[1]")
    public WebElement strength_bar1;

    @FindBy(xpath = "(//ul[@id='strengthBar']/li)[2]")
    public WebElement strength_bar2;

    @FindBy(xpath = "(//ul[@id='strengthBar']/li)[3]")
    public WebElement strength_bar3;

    @FindBy(xpath = "(//ul[@id='strengthBar']/li)[4]")
    public WebElement strength_bar4;

    @FindBy(xpath = "(//ul[@id='strengthBar']/li)[5]")
    public WebElement strength_bar5;

}
