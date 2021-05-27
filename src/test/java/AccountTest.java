import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.NewAccountModalPage;

import java.util.concurrent.TimeUnit;

public class AccountTest {

    private static final String URL = "https://onliner2.my.salesforce.com";
    private static final String LOGIN = "polosbl-ss5w@force.com";
    private static final String PASSWORD = "&YP39TJUrqxy!Mp*";

    @Test
    public void createAccountTest() {
        //driver setup
        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        //login
        driver.get(URL);
        driver.findElement(By.id("username")).sendKeys(LOGIN);
        driver.findElement(By.id("password")).sendKeys(PASSWORD);
        driver.findElement(By.id("Login")).click();
        //open new account modal
        NewAccountModalPage newAccountModalPage = new NewAccountModalPage(driver);
        newAccountModalPage.openPage();
        newAccountModalPage.createAccount("First Account","www.tut.by","Customer","Apparel");
    }
}
