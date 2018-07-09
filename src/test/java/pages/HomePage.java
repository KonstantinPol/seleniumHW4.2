package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "firstName")
    private WebElement firstname;

    @FindBy(name = "lastName")
    private WebElement lastName;

    @FindBy(xpath="//html//div[@class='radio-container col-sm-10']//label[1]/input[1]")
    WebElement gender;

    @FindBy(id = "dob")
    WebElement dobField;

    @FindBy(id = "address")
    WebElement addressField;

    @FindBy(id = "email")
    WebElement emailField;

    @FindBy(id = "password")
    WebElement passwordField;

    @FindBy(id = "company")
    WebElement companyField;

    @FindBy(id = "role")
    WebElement roleField;

    @FindBy(id = "expectation")
    WebElement jobField;

    @FindBy (xpath = ("//html//div[2]/label[1]/input[1]"))
    WebElement checkbox1;

    @FindBy (xpath = ("//html//div[6]/label[1]/input[1]"))
    WebElement checkbox2;

    @FindBy(id = "comment")
    WebElement commentField;

    @FindBy(id = "submit-msg")
    WebElement confirmSubmitted;

    public void setFirstName(String firstName) {
        this.firstname.sendKeys(firstName);
    }

    public void setLastName(String lastName) {
        this.lastName.sendKeys(lastName);
    }

    public void typeGender(){
        if(!gender.isSelected())
            gender.click();
    }
    public HomePage typeDOB(String name){
        dobField.sendKeys(name);
        return this;
    }
    public HomePage typeAddress(String name){
        addressField.sendKeys(name);
        return this;
    }

    public HomePage typeEmail(String name){
        emailField.sendKeys(name);
        return this;
    }

    public HomePage typePassword(String name){
        passwordField.sendKeys(name);
        return this;
    }
    public HomePage typeCompany(String name){
        companyField.sendKeys(name);
        return this;
    }

    public void typeRole(){
        Select role = new Select(roleField);
        role.selectByVisibleText("QA");
    }

    public void typeJob(){
        Select job = new Select(jobField);
        job.selectByVisibleText("Good teamwork");
        job.selectByVisibleText("High salary");
        job.selectByVisibleText("Challenging");
    }

    public void typeCheckbox1() {
        if (!checkbox1.isSelected())
            checkbox1.click();
    }
    public void typeCheckbox2() {
        if (!checkbox2.isSelected())
            checkbox2.click();
    }
    public HomePage typeComments(String name){
        commentField.sendKeys(name);
        return this;
    }
    public void typeSubmit() {
        firstname.submit();
    }

    public String typeConfirmSubmitted() {
        //"Successfully submitted!"
        return confirmSubmitted.getText();


    }


}
