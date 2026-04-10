package PMS;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

@Test
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
    public void settingModule() throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(By.xpath("//app-side-nav[@class='ng-star-inserted']//a[@href='/syncinns-pms/settings']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//div[@class='gs-acc-header']//span[text()='Company Management']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//span[text()='E-Mail Template']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//h5[normalize-space()='E-mail Template']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//span[text()='Invoice Template']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//h5[normalize-space()='Invoice Template']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//span[text()='Email Setting']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//h5[normalize-space()='E-mail Template']")).click();
        driver.findElement(By.xpath("//span[text()='Seasons']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//h5[normalize-space()='Seasons']")).click();
        driver.findElement(By.xpath("//span[text()='Seasons']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//h5[normalize-space()='Seasons']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Booking']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//i[@class='fas fa-chevron-left']//span[normalize-space()='Room Management']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Hotel Facilities']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[normalize-space()='Operations']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='gs-acc-header']//span[text()='Account Settings']")).click();
   }
}
