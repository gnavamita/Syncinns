package TestClasses;

import PageObjects.DashboardPage;
import PageObjects.LoginPage;
import Utilities.BaseClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPageTests {

        BaseClass b = new BaseClass();
        LoginPage l = new LoginPage();
        DashboardPage d = new DashboardPage();
        String SyncinnsURL = "https://app.syncinns.com/login";

        @BeforeTest
        public void goToURL() {
            b.openBrowser();
            b.goToURL(this.SyncinnsURL);
        }

        @AfterTest
        public void closeBrowser() {
            b.closeBrowser();
        }

        @Test
        public void user_able_to_login_with_correct_credentials() {
            l.initialVerification();
            l.enterUserName("pmstest@yopmail.com");
            l.enterPassword("123456");
            l.clickOnLoginButton();
            d.verifyDashboardPageURL();
        }

        @Test
        public void user_is_unable_to_login_with_incorrect_credentials() {
            l.initialVerification();
            l.enterUserName("");
            l.enterPassword("");
            l.clickOnLoginButton();
            l.verifyErrorsOnLoginPage();
        }
    }


