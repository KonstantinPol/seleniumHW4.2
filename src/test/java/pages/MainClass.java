package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class MainClass {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/konstantinpolianskii/Desktop/drivers/chromedriver");

        driver = new ChromeDriver();
        String baseUrl = "http://automationpractice.com/index.php";
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


         IndexPage indexPage = PageFactory.initElements(driver, IndexPage.class);
         indexPage.typeLogIn();

          LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
          loginPage.typeloginSite();

          womanPage womanPage = PageFactory.initElements(driver, womanPage.class);
          indexPage.typeWoman();
          Thread.sleep(1000);
          womanPage.typeSelectProducts(womanPage.product1);
          Thread.sleep(1000);
          womanPage.typeAddProducts();
          Thread.sleep(1000);
          womanPage.typeReturn();
          Thread.sleep(1000);
          womanPage.typeSelectProducts(womanPage.product2);
          Thread.sleep(1000);
          womanPage.typeAddProducts();
          Thread.sleep(1000);
          womanPage.typeReturn();
          Thread.sleep(1000);
          womanPage.typeSelectProducts(womanPage.product3);
          Thread.sleep(1000);
          womanPage.typeAddProducts();
          Thread.sleep(1000);
          womanPage.typeReturn();
          Thread.sleep(1000);
          womanPage.typeSelectProducts(womanPage.product4);
          Thread.sleep(1000);
          womanPage.typeAddProducts();
          Thread.sleep(1000);
          womanPage.typeReturn();
          Thread.sleep(1000);
          womanPage.typeReload();

        cardPage cardPage = PageFactory.initElements(driver, cardPage.class);
        indexPage.typeCard();

        //here we check total price
        //cardPage.totalAllLink.getText();
        Thread.sleep(1000);
        cardPage.typeCheckout1();
        Thread.sleep(1000);
        cardPage.typeCheckout2();
        Thread.sleep(1000);
        cardPage.typeIagree();
        Thread.sleep(1000);
        cardPage.typeCheckout3();
        Thread.sleep(3000);
        cardPage.typePayByCheck();
        Thread.sleep(2000);
        cardPage.typeIconfMyOrder();
        Thread.sleep(1000);

        //Check this text++++++++++++++++
        cardPage.CopyTextLink.getText();
        Thread.sleep(2000);
        cardPage.typeBackToOrder();
        Thread.sleep(1000);

        //Check this text too if not empty "" pass++++++++++++++++
        cardPage.CopyTextOrderCompleteLink.getText();








    }
}
