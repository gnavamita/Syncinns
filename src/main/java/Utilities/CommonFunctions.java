package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CommonFunctions extends BaseClass {

    public void clickOnButton(String locator) {
        driver.findElement(By.xpath(locator)).click();
    }


    public String fetchText(String locator) {
        return driver.findElement(By.xpath(locator)).getText();
    }

    public void xpathTypeText(String locator, String text) {
        driver.findElement(By.xpath(locator)).sendKeys(text);
    }

    public void xpathTypeTextClick(String locator){
        driver.findElement(By.xpath(locator)).click();
    }

    public void idTypeText(String locator, String text) {
        driver.findElement(By.id(locator)).sendKeys(text);
    }

    public void idTypeTextClick(String locator) {
        driver.findElement(By.id(locator)).click();
    }


    public void selectDropdown(String locator, String value) {
        Select select = new Select(driver.findElement(By.xpath(locator)));
        select.selectByValue(value);
    }

    public void hover(WebElement locator){
        Actions actions = new Actions(driver);
        actions.moveToElement(locator).perform();
    }


    public void assertion(String expected, String actual) {
        if (expected.equals(actual)) {
            System.out.println("PASS : Expected " + expected + " is equal to actual " + actual);
        } else
            System.out.println("FAIL : Expected " + expected + " is not equal to actual " + actual);
    }

    public String getCurrentURL() {
        return driver.getCurrentUrl();
    }

}
