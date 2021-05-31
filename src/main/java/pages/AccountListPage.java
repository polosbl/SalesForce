package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountListPage extends BasePage {

    public AccountListPage(WebDriver driver) {
        super(driver);
    }

    private static final String ACCOUNT_NAME = "//*[contains(text(),'%s')]/ancestor::table//t[@scope='row']//a";
    private static final String ACCOUNT_NAME_IN_ROW = "(//*[contains(@class,'slds-row-number')])[%s]/ancestor::tr//a[contains(@class,'slds-truncate')]";

    public void openPage(String url) {
        driver.get(url);
    }

    public String getAccountNameFromRowNumber(String rowNumber) {
        return driver.findElement(By.xpath(String.format(ACCOUNT_NAME_IN_ROW,rowNumber))).getText();
    }
}
