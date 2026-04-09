package PMS;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class Dashboard {

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
    public void tabMenuList() throws InterruptedException {
        //driver.findElement(By.id("overview-tab")).click();

        driver.findElement(By.id("check-tab")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[normalize-space()='Front Office & Reservation Desk']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//ul[@class='nav nav-tabs mb-0']//button[normalize-space()='House Keeping']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[normalize-space()='Accounts']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[normalize-space()='HR Dashboard']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[normalize-space()='Restaurant']")).click();
        Thread.sleep(3000);

    }


}
