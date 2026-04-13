package PMS;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HRM_ManageEmployee {
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
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input [@placeholder='Enter first name']")).sendKeys("PMSEmp");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input [@placeholder='Enter last name']")).sendKeys("one");
        Thread.sleep(3000);
        driver.findElement(By.id("phone")).sendKeys("9876543210");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input [@placeholder='Enter email address']")).sendKeys("PMSEmpone@yopmail.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Select Gender']")).sendKeys("one");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@role='searchbox']")).click();
        Thread.sleep(3000);
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Select date of birth']")).sendKeys("01/01/2000");
        Thread.sleep(3000);
//        driver.findElement(By.xpath("//p-select[@formcontrolname='employment_status']"));
//        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER);
        actions.moveToElement(driver.findElement(By.xpath("//input[@formcontrolname='doc_id_number']"))).perform();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@formcontrolname='street']")).sendKeys("makkah");
        Thread.sleep(3000);
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//p-select[@filterby='propertyName']")).click();
        Thread.sleep(3000);
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Select department']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[@class='ng-star-inserted' and text()='Dept 1']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[@aria-label='Select role']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Rol1']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Select joining date']")).sendKeys("01/04/2026");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Select shift time']")).click();
        Thread.sleep(3000);
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Enter password']")).click();
        Thread.sleep(3000);
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[minimize-space()='Add Employee']")).click();
        Thread.sleep(3000);


//
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//a[normalize-space()='Manual Attendance']")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//a[normalize-space()='Daily Attendance']")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//a[normalize-space()='Daily Attendance']")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//a[normalize-space()='Attendance Summary']")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//a[normalize-space()='Leaves']")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//a[normalize-space()='My Leaves']")).click();
    }
}
