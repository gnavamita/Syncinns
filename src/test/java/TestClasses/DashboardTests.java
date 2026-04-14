package TestClasses;

import PageObjects.DashboardPage;
import Utilities.BaseClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class DashboardTests {
    BaseClass b = new BaseClass();
    DashboardPage d = new DashboardPage();

    String SyncinssURL = "https://app.syncinns.com/login";

    @BeforeTest
    public void goToURL() {
        b.openBrowser();
        b.goToURL(this.SyncinssURL);
    }

    @AfterTest
    public void closeBrowser(){
        b.closeBrowser();
    }

    public void User_a_able_to_View_correct_Headings(){
        d.initialVerifications();
    }



}
