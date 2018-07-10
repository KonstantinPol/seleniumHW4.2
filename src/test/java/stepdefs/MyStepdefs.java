package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
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
    }
}





















