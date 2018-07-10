package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class womanPage {
    WebDriver driver;

    public womanPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy (linkText = "Faded Short Sleeve T-shirts")
    public
    WebElement product1;
    @FindBy (linkText = "Printed Dress")
    public
    WebElement product2;
    @FindBy (linkText = "Printed Chiffon Dress")
    public
    WebElement product3;
    @FindBy (linkText = "Blouse")
    public
    WebElement product4;
    @FindBy (xpath = ("//*[@id='add_to_cart']/button/span"))
    WebElement addToCardButtn;


    public womanPage typeSelectProducts(WebElement name) {
        name.click();
        return new womanPage(driver);
    }

    public poductPage typeAddProducts() {
        addToCardButtn.click();
        return new poductPage(driver);
    }

    public womanPage typeReturn() {
        driver.navigate().back();
        return new womanPage(driver);
    }

    public womanPage typeReload() {
        driver.navigate().refresh();
        return new womanPage(driver);
    }






}
