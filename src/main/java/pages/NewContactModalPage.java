package pages;

import elements.Button;
import elements.Dropdown;
import elements.Input;
import org.openqa.selenium.WebDriver;

public class NewContactModalPage extends BasePage {

    public NewContactModalPage(WebDriver driver) {
        super(driver);
    }

    public NewContactModalPage openPage(String url) {
        driver.get(url);
        return this;
    }

    //TODO: Implement method
    public void createContact(String lastName,String account,String button){
        new Input(driver, "Last Name").writeTextToContactInput(lastName);
//        new Dropdown(driver, "Account").selectOption(account);
//        new Button(driver, "Save").clickButton(button);
    }
}
