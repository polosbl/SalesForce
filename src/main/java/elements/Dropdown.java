package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dropdown {

    WebDriver driver;
    String label;
    private static final String DROPDOWN_XPATH = "//*[contains(text(),'%s')]/ancestor::div[contains(@class,'uiInputSelect')]//a";
    private static final String DROPDOWN_OPTION_XPATH = "//*[contains(@class,'select-options')]/descendant::a[contains(text(),'%s')]";


    public Dropdown(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void selectOption(String option) {
        driver.findElement(By.xpath(String.format(DROPDOWN_XPATH,label))).click();
        driver.findElement(By.xpath(String.format(DROPDOWN_OPTION_XPATH,option))).click();
    }
}
