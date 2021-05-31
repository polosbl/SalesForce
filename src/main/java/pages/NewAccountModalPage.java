package pages;

import elements.Button;
import elements.Dropdown;
import elements.Input;
import org.openqa.selenium.WebDriver;

public class NewAccountModalPage extends BasePage {

    public NewAccountModalPage(WebDriver driver) {
        super(driver);
    }

    public NewAccountModalPage openPage(String url) {
        driver.get(url);
        return this;
    }

    public void createAccount(String accountName, String website,String type,String industry,String button) {
        new Input(driver,"Account Name").writeText(accountName);
        new Input(driver,"Website").writeText(website);
        new Dropdown(driver,"Type").selectOption(type);
        new Dropdown(driver,"Industry").selectOption(industry);
        new Button(driver,"Save").clickButton(button);
    }
}
