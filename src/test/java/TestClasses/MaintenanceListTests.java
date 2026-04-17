package TestClasses;

import PageObjects.LoginPage;
import PageObjects.MaintenanceListPage;
import Utilities.BaseClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class MaintenanceListTests {
    BaseClass b = new BaseClass();
    LoginPage l = new LoginPage();
    MaintenanceListPage mp = new MaintenanceListPage();

    public String syncinnsURL = "https://app.syncinns.com/";

    @BeforeTest
    public void goToURL() {
        b.openBrowser();
        b.goToURL(this.syncinnsURL);
    }

    @AfterTest
    public void closeBrowser() {
        b.closeBrowser();
    }

    public void create_Maintenance_List_with_valid_credentials() {
        l.enterUserName("");
        l.enterPassword("");
        l.clickOnLoginButton();
        mp.clickOnHouseKeepingTab();
        mp.clickOnMaintenanceTab();
        mp.verifyMaintenanceListURL();
        mp.clickOnAddNewButton();
        mp.selectPropertyType("");
        mp.selectTypeOfRequest("");
        mp.selectAssignedToType("");
        mp.selectEmployeeToType("");

    }

}
