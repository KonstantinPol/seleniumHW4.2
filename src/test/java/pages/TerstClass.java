package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class TerstClass {

    WebDriver driver;
    private IndexPage indexPage;


    @BeforeClass
    protected void beforeClass () {

        System.setProperty("webdriver.chrome.driver", "/Users/konstantinpolianskii/Desktop/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String baseUrl = "http://automationpractice.com/index.php";
        driver.get(baseUrl);
        indexPage = new IndexPage(driver);


    }
    @AfterTest
    public void close(){
        driver.quit();

    }

    @Test
    public void test1 () {
        IndexPage indexPage = PageFactory.initElements(driver, IndexPage.class);
        indexPage.typeLogIn();

        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.typeloginSite();

    }

    @Test
    public void test2 () throws InterruptedException {
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

    }

    @Test
    public void test3 () throws InterruptedException {
        cardPage cardPage = PageFactory.initElements(driver, cardPage.class);
        indexPage.typeCard();
        Assert.assertEquals(cardPage.totalAllLink.getText(), "$87.91");
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

    }
    @Test
    public void test4 () throws InterruptedException {

        cardPage cardPage = PageFactory.initElements(driver, cardPage.class);
        //Check this text++++++++++++++++
        Assert.assertEquals(cardPage.CopyTextLink.getText(), "Your order on My Store is complete.");

        Thread.sleep(2000);
        cardPage.typeBackToOrder();
        Thread.sleep(1000);

    }

    @Test
    public void test5 () {

        cardPage cardPage = PageFactory.initElements(driver, cardPage.class);
        Assert.assertNotNull(cardPage.CopyTextOrderCompleteLink.getText());

    }

}


