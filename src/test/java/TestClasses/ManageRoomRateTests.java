package TestClasses;

import PageObjects.LoginPage;
import PageObjects.RoomRatePage;
import Utilities.BaseClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ManageRoomRateTests {
    BaseClass b = new BaseClass();
    LoginPage l = new LoginPage();
    RoomRatePage rp = new RoomRatePage();

    public String goToURL = "https://app.syncinns.com/";

    @BeforeTest
    public void openBrowser() {
        b.openBrowser();
        b.goToURL(this.goToURL);

    }

    @BeforeTest
    public void closeBroswer() {
        b.closeBrowser();
    }

    @Test
    public void Add_Manage_Room_Rate_with_valid_details() {
        l.enterUserName("");
        l.enterPassword("");
        l.clickOnLoginButton();
        rp.selectPropertyModule();
        rp.selectManageRoomRateTan();
        rp.selectPropertyModule();
        rp.selectRoomType();
        rp.enterDefaultRate("");
        rp.enterHalfMealRate("");
        rp.enterFullMealRate("");


    }


}
