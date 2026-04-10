package PMS;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Reports {
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
    public void reportModule() throws InterruptedException{
        driver.findElement(By.xpath("//a[@href='/syncinns-pms/reports']//span[text()='Reports']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='fr-text']//div[@class='fr-title' and text()='Daily Revenue Report']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Reports']")).click();
        driver.findElement(By.xpath("//div[@class='fr-text']//div[@class='fr-title' and text()='Advance Payment Report']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Reports']")).click();
        driver.findElement(By.xpath("//div[@class='fr-text']//div[@class='fr-title' and text()='Receivables Report']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Reports']")).click();
        driver.findElement(By.xpath("//div[@class='fr-text']//div[@class='fr-title' and text()='Revenue Leakage Report']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Reports']")).click();
        driver.findElement(By.xpath("//div[@class='fr-text']//div[@class='fr-title' and text()='Tax Summary Report']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Reports']")).click();
        driver.findElement(By.xpath("//div[@class='fr-text']//div[@class='fr-title' and text()='Reservation report']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Reports']")).click();
        driver.findElement(By.xpath("//div[@class='fr-text']//div[@class='fr-title' and text()='Arrival Report']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Reports']")).click();
        driver.findElement(By.xpath("//div[@class='fr-text']//div[@class='fr-title' and text()='No show report']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Reports']")).click();
        driver.findElement(By.xpath("//div[@class='fr-text']//div[@class='fr-title' and text()='Cancelled Report']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Reports']")).click();
        driver.findElement(By.xpath("//div[@class='fr-text']//div[@class='fr-title' and text()='occupancy report']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Reports']")).click();
        driver.findElement(By.xpath("//div[@class='fr-text']//div[@class='fr-title' and normalize-space()='Average daily rate (ADR Report)']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Reports']")).click();
        driver.findElement(By.xpath("//div[@class='fr-text']//div[@class='fr-title' and text()='Daily RevPAR Breakdown']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Reports']")).click();
        driver.findElement(By.xpath("//div[@class='fr-text']//div[@class='fr-title' and text()='RevPAR by room Type']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Reports']")).click();
        driver.findElement(By.xpath("//div[@class='fr-text']//div[@class='fr-title' and text()='Room Status Report']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Reports']")).click();
        driver.findElement(By.xpath("//div[@class='fr-text']//div[@class='fr-title' and text()='In-House Guest List']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Reports']")).click();
        driver.findElement(By.xpath("//div[@class='fr-text']//div[@class='fr-title' and text()='Checkout List']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Reports']")).click();
        driver.findElement(By.xpath("//div[@class='fr-text']//div[@class='fr-title' and text()='Repeat guest Report']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Reports']")).click();
        driver.findElement(By.xpath("//div[@class='fr-text']//div[@class='fr-title' and text()='Early Check-in/Check-out Report']")).click();



    }
}
