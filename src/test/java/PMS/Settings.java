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
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Booking']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[normalize-space()='Room Management']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Hotel Facilities']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[normalize-space()='Operations']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='gs-acc-header']//span[text()='Account Settings']")).click();
    }

    @Test
    public void hrmModule() throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle']//span[text()='HRM']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[normalize-space()='Manage Employee']")).click();
        Thread.sleep(3000);
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

    @Test
    public void customerModule() {
        driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle']//span[text()='Customer']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Customer List']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Balance Sheet']")).click();
    }

    @Test
    public void reservationsModule() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle']//span[text()='Reservations']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='New Reservation']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Reservation List']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Check In']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Check Out']")).click();
    }

    @Test
    public void propertyModule() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle']//span[text()='Property']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[normalize-space()='Show Properties']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[normalize-space()='Property Policies']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[normalize-space()='Add Room']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[normalize-space()='Manage Room Rate']")).click();
    }

    @Test
    public void frontDeskModule() {
        driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle']//span[text()='Front Desk']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Inventory & Stock']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Unavailability']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Room Status']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Check In']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Check Out']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Room Management']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='No Show Report']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Cancelled']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Lost and Found']")).click();
    }

    @Test
    public void house_KeepingModule() {
        driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle']//span[text()='Front Desk']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='House Insight']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Task List']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='User Engagement']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Maintenance List']")).click();
    }

    @Test
    public void vendor_And_StockModule() {
        driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle']//span[text()='Vendor & Stock']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Vendor']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Make Order']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Order List']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Purchase Entry']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Purchase List']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Stock Report']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Purchase Transaction']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Accounts']")).click();
    }

    @Test
    public void RestaurantModule() {
        driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle']//span[text()='Restaurant']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Create Table']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Table List']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Create Recipe']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Recipe List']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Create Order']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Buffet List']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Order List']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Transactions']")).click();
    }

    @Test
    public void AccountsModule() {
        driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle']//span[text()='Accounts']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Expenses']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Payment List']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='VAT Report']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Balance Sheet']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Hotel Transactions']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Restaurant Transactions']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Vendor Accounts']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Investments']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='All Transactions']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Profit Reports']")).click();
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
