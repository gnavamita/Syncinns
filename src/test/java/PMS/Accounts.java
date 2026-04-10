package PMS;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Accounts {
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
    public void AccountsModule() {
        driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle']//span[text()='Accounts']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Expenses']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Payment List']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='VAT Report']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Balance Sheet']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Hotel Transactions']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Restaurant Transactions']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Vendor Accounts']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Investments']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='All Transactions']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Profit Reports']")).click();
    }
}
