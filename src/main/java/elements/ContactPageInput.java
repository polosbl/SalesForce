package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactPageInput {

    WebDriver driver;
    String label;
    private static final String INPUT_XPATH = "//label[contains(text(),'%s')]/ancestor::lightning-input[contains(@class,'slds-form-element')]//input";

    public ContactPageInput(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void writeText(String text) {
        driver.findElement(By.xpath(String.format(INPUT_XPATH, label))).sendKeys(text);
    }
}
