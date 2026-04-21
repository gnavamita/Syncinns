package TestClasses;

import PageObjects.AddRoomPage;
import PageObjects.LoginPage;
import Utilities.BaseClass;

public class AddRoomTests {
    BaseClass b = new BaseClass();
    LoginPage l = new LoginPage();
    AddRoomPage rp = new AddRoomPage();

    public String syncinnsURL = "https://app.syncinns.com/";


    public void goToURL() {
        b.openBrowser();
        b.goToURL(this.syncinnsURL);
    }

    public void closeBrowser() {
        b.closeBrowser();
    }

    public void create_Room_With_valid_Details() {
        l.enterUserName("");
        l.enterPassword("");
        l.enterPassword("");
        rp.clickOnPropertyModule();
        rp.clickOnAddRoomTab();
        rp.selectTower("");
        rp.selectFloor("");
        rp.enterRoomNumber("");
        rp.selectTRoomType();
        rp.selectRoomView();
        rp.enterSize("");
        rp.selectAmenities("");
        rp.clickSaveButton();
    }
}
