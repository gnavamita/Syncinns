package TestClasses;

import PageObjects.Customer_CustomerListPage;
import Utilities.BaseClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CustomerListTests {
    BaseClass b = new BaseClass();
    Customer_CustomerListPage c = new Customer_CustomerListPage();

    public String syncinnsURL = "https://app.syncinns.com/";


    @BeforeTest
    public void goToURL(){
        b.openBrowser();
        b.goToURL(this.syncinnsURL);
    }

    @AfterTest
    public void closeBrowser(){
        b.closeBrowser();
    }

    @Test
    public void create_Customer_With_valid_Details(){
        c.clickOnCustomer();
        c.clickOnCustomerList();
        c.clickOnAddNewCustomer();
        c.clickOnCustomerType("");
        c.enterFirstName("");
        c.enterLastName("");
        c.enterEmailAddress("");
        c.enterContactNumber("");
        c.enterAddress("");
        c.clickAddButton();
    }

    @Test
    public void verifyCustomerPageRL(){
        c.verifyCustomerListPageURL();
    }



}
