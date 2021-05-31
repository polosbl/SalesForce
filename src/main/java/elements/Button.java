package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Button {

    WebDriver driver;
    String label;
    private static final String BUTTON_ON_MODAL_XPATH = "//*[@class='inlineFooter']//*[text()='%s']";

    public Button(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void clickButton(String label) {
        driver.findElement(By.xpath(String.format(BUTTON_ON_MODAL_XPATH,label))).click();
    }
}
