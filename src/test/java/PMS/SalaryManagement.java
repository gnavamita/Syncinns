package PMS;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SalaryManagement {
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
    public void salaryManagementModule() throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle']//span[text()='Salary Management']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[normalize-space()='Create Salary Category']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[normalize-space()='Generate Salary']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[normalize-space()='Generate Payroll']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[normalize-space()='Salary List']")).click();
    }
}
