package PMS;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HouseKeeping {
    WebDriver driver;

    @BeforeMethod
    public void launchBrowser() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://app.syncinns.com/");
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("pmstest@yopmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("123456");
        driver.findElement(By.xpath("//button[@class='tpfLoginBtn']")).click();
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }

    @Test
    public void house_KeepingModule() {
        driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle']//span[text()='Front Desk']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='House Insight']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Task List']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='User Engagement']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Maintenance List']")).click();
    }
}
