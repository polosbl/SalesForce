package pages;

import org.openqa.selenium.WebDriver;

public class AccountListPage extends BasePage {

    public AccountListPage(WebDriver driver) {
        super(driver);
    }

    private static final String URL = "https://onliner2.lightning.force.com/lightning/o/Account/list?filterName=Recent";

    public void openPage() {
        driver.get(URL);
    }
}
