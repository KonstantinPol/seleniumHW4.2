package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class cardPage {

    WebDriver driver;

    public cardPage(WebDriver driver) {
        this.driver = driver;
    }

    //check this TotalAll+++++++++++
    @FindBy (id = ("total_price"))
    WebElement totalAllLink;

    @FindBy (xpath = ("//*[@id=\"center_column\"]/p[2]/a[1]/span/i"))
    WebElement checkout1Link;

    @FindBy (xpath = ("//*[@id=\"center_column\"]/form/p/button"))
    WebElement checkout2Link;

    @FindBy (xpath = ("//input[@id='cgv']"))
    WebElement IagreeLink;

    @FindBy (xpath = ("//p[@class='cart_navigation clearfix']//button[@type='submit']//span"))
    WebElement checkout3Link;

    @FindBy (xpath = ("//div[@id='HOOK_PAYMENT']/div[2]/div/p/a/span"))
    WebElement payByCheckLink;

    @FindBy (xpath = ("//p[@id='cart_navigation']//button[@type='submit']//span"))
    WebElement IconfMyOrderLink;

    //Check this text++++++++++++++++
    @FindBy (xpath = ("//div[@id='center_column']/p"))
    WebElement CopyTextLink;

    @FindBy (linkText = ("Back to orders"))
    WebElement BackToOrderLink;

    //Check this text too ++++++++++++++++
    @FindBy (xpath = ("//div[@id='center_column']/p"))
    WebElement CopyTextOrderCompleteLink;







    public cardPage typeCheckout1() {
        checkout1Link.click();
        return new cardPage(driver);
    }
    public cardPage typeCheckout2() {
        checkout2Link.click();
        return new cardPage(driver);
    }

    public cardPage typeIagree() {
        IagreeLink.click();
        return new cardPage(driver);
    }
    public cardPage typeCheckout3() {
        checkout3Link.click();
        return new cardPage(driver);
    }
    public cardPage typePayByCheck() {
        payByCheckLink.click();
        return new cardPage(driver);
    }
    public cardPage typeIconfMyOrder() {
        IconfMyOrderLink.click();
        return new cardPage(driver);
    }
    public cardPage typeBackToOrder() {
        BackToOrderLink.click();
        return new cardPage(driver);
    }




}

