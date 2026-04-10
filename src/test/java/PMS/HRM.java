package PMS;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HRM {
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
    public void hrmModule() throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle']//span[text()='HRM']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[normalize-space()='Manage Employee']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='col-xl-7 col-lg-6 col-md-6 col-12']//button[normalize-space()='Add Employee']")).click();
        driver.findElement(By.xpath("//input [@placeholder='Enter first name']")).sendKeys("PMSEmp");
        driver.findElement(By.xpath("//input [@placeholder='Enter last name']")).sendKeys("one");
        driver.findElement(By.id("phone")).sendKeys("9876543210");
        driver.findElement(By.xpath("//input [@placeholder='Enter email address']")).sendKeys("one");
        driver.findElement(By.xpath("//span[text()='Select Gender']")).sendKeys("one");
        driver.findElement(By.xpath("//input[@role='searchbox']")).click();
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
        driver.findElement(By.xpath("//input[@placeholder='Select date of birth']")).sendKeys("01/01/2000");


        driver.findElement(By.xpath("//a[normalize-space()='Manage Roster']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[normalize-space()='Manual Attendance']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[normalize-space()='Daily Attendance']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[normalize-space()='Daily Attendance']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[normalize-space()='Attendance Summary']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[normalize-space()='Leaves']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[normalize-space()='My Leaves']")).click();
    }
}
