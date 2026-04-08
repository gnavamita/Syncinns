package baseTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class HomePage {
    public WebDriver driver;

    @BeforeMethod
    public void launch_browser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://syncinns.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void Request_A_Demo() throws InterruptedException {
        try {

            driver.findElement(By.xpath("//span[normalize-space()='Request a Demo']")).click();
            driver.findElement(By.id("nameModern")).sendKeys("tester");
            driver.findElement(By.id("finalEmailModern")).sendKeys("tester@yopmail.com");
            driver.findElement(By.xpath("//div[@class='iti__selected-country-primary']")).click();
            Thread.sleep(3000);
            WebElement flag = driver.findElement(By.xpath("//input[@placeholder='Search']"));
            flag.sendKeys("india");
            Thread.sleep(3000);
            flag.sendKeys(Keys.ENTER);
            driver.findElement(By.id("mobile_code")).sendKeys("9876543210");
            WebElement solution = driver.findElement(By.id("employeeModern"));
            solution.click();
            Thread.sleep(3000);
            Select select = new Select(solution);
            Thread.sleep(3000);
            select.selectByValue("68381b13e00523079ccb3226");
            driver.findElement(By.id("propertyModern")).sendKeys("BusinessName");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//input[@placeholder='Choose a date']")).sendKeys("April 10,2026");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("request a demo form filled");
        }

        ;
//        Thread.sleep(3000);
//        Calendar.click();
//        Calendar.
//        Calendar.sendKeys(Keys.ENTER);

    }

    @Test
    public void Talk_TO_Us() {
        driver.findElement(By.xpath("//span[text()='Talk to Us']")).click();
        driver.findElement(By.name("first_name")).sendKeys("tester");
        driver.findElement(By.name("last_name")).sendKeys("last name");
        driver.findElement(By.name("work_email")).sendKeys("tester@yopmail.com");
        driver.findElement(By.name("company_name")).sendKeys("company@yopmail.com");
        driver.findElement(By.name("message")).sendKeys("This is a test!");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Test
    public void Solutions_For_Hoteliers() throws InterruptedException {
        Thread.sleep(2000);
        WebElement solutions = driver.findElement(By.xpath("//a[text()='Solutions']"));
        Actions actions = new Actions(driver);
        Thread.sleep(2000);
        actions.moveToElement(solutions).perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[text()='For Hoteliers']")).click();
    }

    @Test
    public void Solutions_For_Transporters() throws InterruptedException {
        Thread.sleep(2000);
        WebElement solutions = driver.findElement(By.xpath("//a[text()='Solutions']"));
        Actions actions = new Actions(driver);
        Thread.sleep(2000);
        actions.moveToElement(solutions).perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[text()='For Transporters']")).click();
    }

    @Test
    public void Solutions_For_Reservation_Agencies() throws InterruptedException {
        Thread.sleep(2000);
        WebElement solutions = driver.findElement(By.xpath("//a[text()='Solutions']"));
        Actions actions = new Actions(driver);
        Thread.sleep(2000);
        actions.moveToElement(solutions).perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[text()='For Reservation Agencies']")).click();
    }

    @Test
    public void Solutions_For_Travel_Companies() throws InterruptedException {
        Thread.sleep(2000);
        WebElement solutions = driver.findElement(By.xpath("//a[text()='Solutions']"));
        Actions actions = new Actions(driver);
        Thread.sleep(2000);
        actions.moveToElement(solutions).perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[text()='For Travel Companies']")).click();
    }

    @Test
    public void Solutions_For_B2B_Marketplace() throws InterruptedException {
        Thread.sleep(2000);
        WebElement solutions = driver.findElement(By.xpath("//a[text()='Solutions']"));
        Actions actions = new Actions(driver);
        Thread.sleep(2000);
        actions.moveToElement(solutions).perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[text()='For B2B Marketplace']")).click();
    }

    @Test
    public void Pricing() {
        driver.findElement(By.xpath("//a[text()='Pricing']")).click();
        driver.findElement(By.xpath("//a[@href='https://syncinns.com/for-hotel-pricing']")).click();
    }

    @Test
    public void Syncinns_AI() {
        driver.findElement(By.xpath("//ul[@class='navbar-nav']//a[text()='Syncinns AI']")).click();
        driver.findElement(By.xpath("//a[text()='Upgrade with AI']")).click();

    }

    @Test
    public void Get_a_demo() throws InterruptedException {
        try {
            driver.findElement(By.xpath("//span[text()='Get a demo']")).click();
            driver.findElement(By.id("nameModern")).sendKeys("tester");
            driver.findElement(By.id("finalEmailModern")).sendKeys("tester@yopmail.com");
            driver.findElement(By.xpath("//div[@class='iti__selected-country-primary']")).click();
            Thread.sleep(3000);
            WebElement flag = driver.findElement(By.xpath("//input[@placeholder='Search']"));
            flag.sendKeys("india");
            Thread.sleep(3000);
            flag.sendKeys(Keys.ENTER);
            driver.findElement(By.id("mobile_code")).sendKeys("9876543210");
            WebElement solution = driver.findElement(By.id("employeeModern"));
            solution.click();
            Thread.sleep(3000);
            Select select = new Select(solution);
            Thread.sleep(3000);
            select.selectByValue("68381b13e00523079ccb3226");
            driver.findElement(By.id("propertyModern")).sendKeys("BusinessName");
            Thread.sleep(3000);
            WebElement calendar = driver.findElement(By.xpath("//input[@placeholder='Choose a date']"));
            calendar.sendKeys("April 10,2026");
        } catch (Exception e) {
            System.out.println(e);
            ;
        } finally {
            System.out.println("form filled");
        }
    }

    @Test
    public void Partner_With_Us_For_Sellers() {
        driver.findElement(By.xpath("//span[text()='Partner with us']")).click();
        driver.findElement(By.xpath("//div[@class='banner-BtnBox partnerbanner-BtnBox']//span[text()='For Sellers']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Start your Listing']")).click();
    }

    @Test
    public void Partner_With_Us_For_Buyers() {
        driver.findElement(By.xpath("//span[text()='Partner with us']")).click();
        driver.findElement(By.xpath("//div[@class='banner-BtnBox partnerbanner-BtnBox']//a[@href='https://syncinns.com/buy-from-marketplace']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Register Now']")).click();
    }

    @Test
    public void Partner_With_Us_For_Affiliates() {
        driver.findElement(By.xpath("//span[text()='Partner with us']")).click();
        driver.findElement(By.xpath("//div[@class='banner-BtnBox partnerbanner-BtnBox']//a[@href='https://syncinns.com/affiliate-program']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Register Now →']")).click();
    }


    @AfterMethod //(enabled = false)
    public void close_browser() {
        driver.close();
    }
}