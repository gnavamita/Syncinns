package PMS;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FrontDesk {
    public class Settings {
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
        public void frontDeskModule() {
            driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle']//span[text()='Front Desk']")).click();
            driver.findElement(By.xpath("//a[normalize-space()='Inventory & Stock']")).click();
            driver.findElement(By.xpath("//a[normalize-space()='Unavailability']")).click();
            driver.findElement(By.xpath("//a[normalize-space()='Room Status']")).click();
            driver.findElement(By.xpath("//a[normalize-space()='Check In']")).click();
            driver.findElement(By.xpath("//a[normalize-space()='Check Out']")).click();
            driver.findElement(By.xpath("//a[normalize-space()='Room Management']")).click();
            driver.findElement(By.xpath("//a[normalize-space()='No Show Report']")).click();
            driver.findElement(By.xpath("//a[normalize-space()='Cancelled']")).click();
            driver.findElement(By.xpath("//a[normalize-space()='Lost and Found']")).click();
        }
    }
}
