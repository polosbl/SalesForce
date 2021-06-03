package pages;

import elements.Button;
import elements.Dropdown;
import elements.Input;
import objects.Account;
import org.openqa.selenium.WebDriver;

public class NewAccountModalPage extends BasePage {

    public NewAccountModalPage(WebDriver driver) {
        super(driver);
    }

    public NewAccountModalPage openPage(String url) {
        driver.get(url);
        return this;
    }

    public void createAccount(Account account) {
        new Input(driver,"Account Name").writeTextIntoAccountInput(account.getAccountName());
        new Input(driver,"Website").writeTextIntoAccountInput(account.getWebsite());
        new Dropdown(driver,"Type").selectOption(account.getType());
        new Dropdown(driver,"Industry").selectOption(account.getIndustry());
        new Button(driver,"Save").clickButton(account.getButton());
        new Input(driver,"Phone").writeTextIntoAccountInput(account.getPhone());
        new Input(driver,"Description").writeTextIntoAccountInput(account.getDescription());
    }
}
