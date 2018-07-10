package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.IndexPage;
import pages.LoginPage;
import pages.cardPage;
import pages.womanPage;

import java.util.concurrent.TimeUnit;

public class MyStepdefs {

    LoginPage loginPage;
    WebDriver driver;

    @Before
    public void init(){
        System.setProperty("webdriver.chrome.driver","/Users/konstantinpolianskii/Desktop/drivers/chromedriver");
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

//    @After
//    public void close(){
//        driver.close();
//        driver.quit();
//    }

    @Given("^user navigates to the app url$")
    public void someTestInfo() {
        driver.get("http://automationpractice.com/index.php");


    }


    @When("^user fills field email with value \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void userFillsFieldEmailWithValueAndPassword(String email, String password) {
        IndexPage indexPage = PageFactory.initElements(driver, IndexPage.class);
        indexPage.typeLogIn();
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.typeloginSite(email, password);

    }


    @Then("^user navigates to the woman page$")
    public void userNavigatesToTheWomanPage() {
        IndexPage indexPage = PageFactory.initElements(driver, IndexPage.class);
        indexPage.typeWoman();
    }


    @Then("^user add first product in backet$")
    public void userAddFirstProductInBacket() throws InterruptedException {
        womanPage womanPage = PageFactory.initElements(driver, womanPage.class);
        womanPage.typeSelectProducts(womanPage.product1);
        Thread.sleep(1000);
        womanPage.typeAddProducts();
        Thread.sleep(1000);
        womanPage.typeReturn();
        Thread.sleep(1000);
        womanPage.typeReload();
    }


    @Then("^user add second product in backet$")
    public void userAddSecondProductInBacket() throws InterruptedException {
        womanPage womanPage = PageFactory.initElements(driver, womanPage.class);
        womanPage.typeSelectProducts(womanPage.product2);
        Thread.sleep(1000);
        womanPage.typeAddProducts();
        Thread.sleep(1000);
        womanPage.typeReturn();
        Thread.sleep(1000);
        womanPage.typeReload();
    }

    @Then("^user add third product in backet$")
    public void userAddThirdProductInBacket() throws InterruptedException {
        womanPage womanPage = PageFactory.initElements(driver, womanPage.class);
        womanPage.typeSelectProducts(womanPage.product3);
        Thread.sleep(1000);
        womanPage.typeAddProducts();
        Thread.sleep(1000);
        womanPage.typeReturn();
        Thread.sleep(1000);
        womanPage.typeReload();
    }

    @Then("^user add fourth product in backet$")
    public void userAddFourthProductInBacket() throws InterruptedException {
        womanPage womanPage = PageFactory.initElements(driver, womanPage.class);
        womanPage.typeSelectProducts(womanPage.product4);
        Thread.sleep(1000);
        womanPage.typeAddProducts();
        Thread.sleep(1000);
        womanPage.typeReturn();
        Thread.sleep(1000);
        womanPage.typeReload();
    }

    @Then("^user navigate to shoping card$")
    public void userNavigateToShopingCard() {
        IndexPage indexPage = PageFactory.initElements(driver, IndexPage.class);
        indexPage.typeCard();
    }

    @Then("^user Assert Totall price$")
    public void userAssertTotallPrice() {
        cardPage cardPage = PageFactory.initElements(driver, pages.cardPage.class);
        Assert.assertEquals(cardPage.totalAllLink.getText(), "$87.91");
    }

    @Then("^user click Checkout two time and Agree$")
    public void userClickCheckoutTwoTimeAndAgree() throws InterruptedException {
        cardPage cardPage = PageFactory.initElements(driver, pages.cardPage.class);
        cardPage.typeCheckout1();
        Thread.sleep(1000);
        cardPage.typeCheckout2();
        Thread.sleep(1000);
        cardPage.typeIagree();
        Thread.sleep(1000);
    }

    @Then("^user click Checkout use pay by Check and navigate to my Order$")
    public void userClickCheckoutUsePayByCheckAndNavigateToMyOrder() throws InterruptedException {
        cardPage cardPage = PageFactory.initElements(driver, pages.cardPage.class);
        cardPage.typeCheckout3();
        Thread.sleep(3000);
        cardPage.typePayByCheck();
        Thread.sleep(2000);
        cardPage.typeIconfMyOrder();
        Thread.sleep(1000);
    }

    @Then("^user Assert Your order on my Store is complete$")
    public void userAssertYourOrderOnMyStoreIsComplete() {
        cardPage cardPage = PageFactory.initElements(driver, pages.cardPage.class);
        Assert.assertEquals(cardPage.CopyTextLink.getText(), "Your order on My Store is complete.");
    }

    @Then("^user navigate to Back to order$")
    public void userNavigateToBackToOrder() throws InterruptedException {
        cardPage cardPage = PageFactory.initElements(driver, pages.cardPage.class);
        Thread.sleep(2000);
        cardPage.typeBackToOrder();
        Thread.sleep(1000);
    }

    @And("^user Assert order exist$")
    public void userAssertOrderExist() {
        cardPage cardPage = PageFactory.initElements(driver, cardPage.class);
        Assert.assertNotNull(cardPage.CopyTextOrderCompleteLink.getText());
    }
}





















