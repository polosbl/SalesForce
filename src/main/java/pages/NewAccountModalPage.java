package pages;

import elements.Dropdown;
import elements.Input;
import org.openqa.selenium.WebDriver;

public class NewAccountModalPage extends BasePage {

    public NewAccountModalPage(WebDriver driver) {
        super(driver);
    }

    private static final String URL = "https://onliner2.lightning.force.com/lightning/o/Account/new";

    public void openPage() {
        driver.get(URL);
    }

    public void createAccount(String accountName, String website,String type,String industry) {
        new Input(driver,"Account Name").writeText(accountName);
        new Input(driver,"Website").writeText(website);
        new Dropdown(driver,"Type").selectOption(type);
        new Dropdown(driver,"Industry").selectOption(industry);
    }
}
