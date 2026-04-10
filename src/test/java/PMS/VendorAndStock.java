package PMS;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VendorAndStock {
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
    public void vendor_And_StockModule() {
        driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle']//span[text()='Vendor & Stock']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Vendor']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Make Order']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Order List']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Purchase Entry']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Purchase List']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Stock Report']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Purchase Transaction']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Accounts']")).click();
    }

}
