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
        Thread.sleep(2000);
    }

    @Test
    public void Front_office(){
        driver.findElement(By.xpath("//button[text()=' Check in & Check out ']")).click();
        driver.findElement(By.xpath("//button[text()=' Check in & Check out ']")).click();
        driver.findElement(By.xpath("//button[minimize-spacing()=' Front Office & Reservation Desk ']")).click();

    }
}
