package PMS;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HRM_ManageRoaster {
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
    public void manageRoaster() throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle']//span[text()='HRM']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[normalize-space()='Manage Roster']")).click();
        Thread.sleep(3000);
        WebElement fromDate = driver.findElement(By.xpath("//input[@aria-controls='pn_id_34_panel' and @placeholder='DD/MM/YYYY']"));
        fromDate.sendKeys(Keys.chord(Keys.CONTROL,"a"));
        fromDate.sendKeys(Keys.DELETE);
        fromDate.sendKeys("13/04/2026");

//        driver.findElement(By.xpath("//input[@aria-controls='pn_id_34_panel' and @placeholder='DD/MM/YYYY']")).sendKeys("13/04/2026");
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//input[@aria-controls='pn_id_35_panel' and @placeholder='DD/MM/YYYY']")).clear();
//        driver.findElement(By.xpath("//input[@aria-controls='pn_id_35_panel' and @placeholder='DD/MM/YYYY']")).sendKeys("13/04/2026");
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
    }
}
