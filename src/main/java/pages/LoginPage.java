package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private static final By USERNAME_FIELD = By.xpath("//*[@id='username']");
    private static final By PASSWORD_FIELD = By.xpath("//*[@id='password']");
    private static final By LOGIN_BUTTON = By.xpath("//*[@id='Login']");

//TODO: Implement Page Factory
    @FindBy(xpath = "//*[@id='username']")
    public WebElement usernameInput;
    @FindBy(xpath = "//*[@id='password']")
    public WebElement passwordInput;
    @FindBy(xpath = "//*[@id='Login']")
    public WebElement loginButton;

    public LoginPage openPage(String url) {
        driver.get(url);
        return this;
    }

//    TODO: Implement Page Factory
    public void loginPageFactory(String username, String password) {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }

    public void login(String username, String password) {
        driver.findElement(USERNAME_FIELD).sendKeys(username);
        driver.findElement(PASSWORD_FIELD).sendKeys(password);
        driver.findElement(LOGIN_BUTTON).click();
    }
}
