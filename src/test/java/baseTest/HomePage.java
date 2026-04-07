package baseTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class HomePage {
    public WebDriver driver;

    @BeforeMethod
    public void launch_browser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://syncinns.com/");
    }

    public void Request_A_Demo() {
        driver.findElement(By.xpath("//span[normalize-space()='Request a Demo']")).click();
        driver.findElement(By.id("nameModern")).sendKeys("tester");
        driver.findElement(By.id("finalEmailModern")).sendKeys("tester@yopmail.com");
        driver.findElement(By.xpath("//div[@class='iti__selected-country-primary']")).click();
        WebElement flag = driver.findElement(By.xpath("//input[@placeholder='Search']"));
        flag.sendKeys("saudi");
        flag.sendKeys(Keys.ARROW_DOWN);
        flag.sendKeys(Keys.ENTER);
        driver.findElement(By.id("mobile_code")).sendKeys("9876543210");
        WebElement solution = driver.findElement(By.xpath("//option[text()='Select']"));
        Select select = new Select(solution);
        select.selectByVisibleText("Hotelier (PMS)");

    }

    @AfterMethod
    public void close_browser() {
        driver.close();
    }
}