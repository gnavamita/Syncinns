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
        driver.manage().window().maximize();
    }

    public void Request_A_Demo() throws InterruptedException {
        driver.findElement(By.xpath("//span[normalize-space()='Request a Demo']")).click();
        driver.findElement(By.id("nameModern")).sendKeys("tester");
        driver.findElement(By.id("finalEmailModern")).sendKeys("tester@yopmail.com");
        driver.findElement(By.xpath("//div[@class='iti__selected-country-primary']")).click();
        Thread.sleep(3000);
        WebElement flag = driver.findElement(By.xpath("//input[@placeholder='Search']"));
        flag.sendKeys("india");
        Thread.sleep(3000);
        flag.sendKeys(Keys.ENTER);
        driver.findElement(By.id("mobile_code")).sendKeys("9876543210");
        WebElement solution = driver.findElement(By.id("employeeModern"));
        solution.click();
        Thread.sleep(3000);
        Select select = new Select(solution);
        Thread.sleep(3000);
        select.selectByValue("68381b13e00523079ccb3226");
        driver.findElement(By.id("propertyModern")).sendKeys("BusinessName");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='datepicker-icon-wrapper']")).sendKeys("April 10,2026" );

    }

    @AfterMethod(enabled = false)
    public void close_browser() {
        driver.close();
    }
}