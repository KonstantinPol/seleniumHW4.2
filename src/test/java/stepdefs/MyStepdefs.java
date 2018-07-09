package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.HomePage;

import java.util.concurrent.TimeUnit;

public class MyStepdefs {

    HomePage homePage;
    WebDriver driver;

    @Before
    public void init(){
        System.setProperty("webdriver.chrome.driver","/Users/konstantinpolianskii/Desktop/drivers/chromedriver");
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @After
    public void close(){
        driver.close();
        driver.quit();
    }

    @Given("^user navigates to the app url$")
    public void someTestInfo() {
        driver.get("http://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");
    }
    
    @When("^user fills first name with value \"([^\"]*)\"$")
    public void userFillsFirstNameWithValue(String firstName){
       homePage.setFirstName(firstName);
    }

    @When("^user fills last name with value \"([^\"]*)\"$")
    public void userFillsFirstNameForValue(String lastName) {
        homePage.setLastName(lastName);
    }


    @When("^user fills gender$")
    public void userFillsGender() {
        homePage.typeGender();
    }

    @When("^user fills date of birth with value \"([^\"]*)\"$")
    public void userFillsDateOfBirthWithValue(String dob){
        homePage.typeDOB(dob);
    }

    @When("^user fills address$")
    public void userFillsAddress() {
        homePage.typeAddress("555 Emerson cir Bolingbook. IL 60440");
    }

    @When("^user fills email with value \"([^\"]*)\"$")
    public void userFillsEmailWithValue(String email){
           homePage.typeEmail(email);
    }

    @When("^user fills password with value \"([^\"]*)\"$")
    public void userFillsPasswordWithValue(String password) {
        homePage.typePassword(password);
    }

    @When("^user fills company$")
    public void userFillsCompany() {
      homePage.typeCompany("Home inc");
    }

    @When("^user fills Role$")
    public void userFillsRole() {
         homePage.typeRole();
    }

    @When("^user fills Job$")
    public void userFillsJob() {
         homePage.typeJob();
    }

    @When("^user fills CheckboxOne$")
    public void userFillsCheckboxOne() {
           homePage.typeCheckbox1();
    }

    @When("^user fills CheckboxTwo$")
    public void userFillsCheckboxTwo() {
        homePage.typeCheckbox2();
    }

    @When("^user fills Comments$")
    public void userFillsComments() {
        homePage.typeComments("Very excited to do something new in my life, thank you for this opportunity.");
    }

    @When("^user submit form$")
    public void userSubmitForm()  {
        homePage.typeSubmit();
    }

    @When("^user check form is submitted$")
    public void userCheckFormIsSubmitted(){
        Assert.assertEquals(homePage.typeConfirmSubmitted(), "Successfully submitted!");
    }


    @When("^user reload page$")
    public void userReloadPage() {
        driver.get("http://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");
    }
}





















