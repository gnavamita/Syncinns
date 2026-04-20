package TestClasses;

import PageObjects.LoginPage;
import PageObjects.MaintenanceListPage;
import PageObjects.NewReservationPage;
import Utilities.BaseClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class NewReservationTests {
    BaseClass b = new BaseClass();
    NewReservationPage rp = new NewReservationPage();
    LoginPage l = new LoginPage();

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

    public void create_new_reservations_with_valid_details() {
        l.enterUserName("");
        l.enterPassword("");
        l.enterPassword("");
        rp.clickOnReservationModule();
        rp.clickOnNewReservationTab();
        rp.selectCustomerType("");
        rp.enterCustomerName("");
        rp.enterPhoneNumber("");
        rp.enterEmailAddress("");
        rp.selectCustomerType2();
        rp.selectGender();
        rp.selectNationality();
        rp.selectPurposeOfVisit();
    }


}
