package TestClasses;

import PageObjects.LoginPage;
import PageObjects.LostAndFoundPage;
import Utilities.BaseClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class LostAndFoundTests {
    BaseClass b = new BaseClass();
    LoginPage l = new LoginPage();
    LostAndFoundPage fp = new LostAndFoundPage();

    public String syncinnsURL = "https://app.syncinns.com/";

    BeforeTest

    public void openBrowser() {
        b.openBrowser();
        b.goToURL(this.syncinnsURL);
    }

    @AfterTest
    public void closeBrowser() {
        b.closeBrowser();
    }

    public void submit_form_with_all_valid_Inputs() {
        l.enterUserName("");
        l.enterPassword("");
        l.clickOnLoginButton();
        fp.clickFrontDeskModule();
        fp.clickLostAndFound();
        fp.clickAddNewButton();
        fp.selectProperty();
        fp.fillDateBox("");
        fp.fillReservationCodeBox("");
        fp.selectRoomNumber();
        fp.fillReportedByBox("");
        fp.fillItemNameBox("");
        fp.fillDescriptionBox("");
        fp.clickOnSubmitButton();
    }

}
