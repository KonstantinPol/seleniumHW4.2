package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class IndexPage {
    private WebDriver driver;

    public IndexPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy (xpath = ("//a[@class='login']"))
    WebElement LogInButton;

    @FindBy (xpath = ("//*[@id='block_top_menu']/ul/li[1]/a"))
    WebElement womanButton;

    @FindBy (xpath = ("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a"))
    WebElement cardButton;



    public LoginPage typeLogIn() {
        LogInButton.click();
        return new LoginPage(driver);
    }

    public womanPage typeWoman() {
        womanButton.click();
        return new womanPage(driver);
    }
    public cardPage typeCard() {
        cardButton.click();
        return new cardPage(driver);
    }




}