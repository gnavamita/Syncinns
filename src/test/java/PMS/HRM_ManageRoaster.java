package PMS;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

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


    public void manageRoaster(){

        driver.findElement(By.xpath("//a[normalize-space()='Manage Roster']")).click();
        driver.findElement(By.xpath("//input[@aria-controls='pn_id_34_panel' and @placeholder='DD/MM/YYYY']")).sendKeys("13/04/2026");
        driver.findElement(By.xpath("//input[@aria-controls='pn_id_35_panel' and @placeholder='DD/MM/YYYY']")).sendKeys("13/04/2026");
        driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
    }
}
