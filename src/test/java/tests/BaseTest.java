package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.*;

import java.util.concurrent.TimeUnit;

public class BaseTest implements ITestConstants {
    WebDriver driver;
    HomePage homePage;
    AccountListPage accountListPage;
    NewAccountModalPage newAccountModalPage;
    LoginPage loginPage;
    NewContactModalPage newContactModalPage;

    @BeforeMethod
    public void initTest() {
        WebDriverManager.chromiumdriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        PageFactory.initElements(driver,this);
        initPages();
    }

    @AfterMethod(alwaysRun = true)
    public void endTest() {
        driver.quit();
    }

    public void initPages() {
        accountListPage = new AccountListPage(driver);
        homePage = new HomePage(driver);
        newAccountModalPage = new NewAccountModalPage(driver);
        loginPage = new LoginPage(driver);
        newContactModalPage = new NewContactModalPage(driver);
    }
}
