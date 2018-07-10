package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    String useremail = "superuser7@gmail.com";
    String password1 = "12345";

    WebDriver driver;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy (id = "SubmitLogin")
    public WebElement Submit;

    @FindBy (id = "email")
    public WebElement email;

    @FindBy (id = "passwd")
    public WebElement password;

    public LoginPage typeEmail(String useremail){
        email.sendKeys(useremail);
        return this;
    }
    public LoginPage typePassword(String userPassword){
        password.sendKeys(userPassword);
        return this;
    }
    public IndexPage typeloginSite (String email, String password){
        typeEmail(email);
        typePassword(password);
        Submit.click();
        return new IndexPage(driver);

//    public IndexPage typeloginSite (){
//        typeEmail(useremail);
//        typePassword(password1);
//        Submit.click();
//        return new IndexPage(driver);
//
      }


}
