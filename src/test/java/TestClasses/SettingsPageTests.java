package TestClasses;

import PageObjects.SettingsPage;
import Utilities.BaseClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SettingsPageTests {

    BaseClass b = new BaseClass();
    SettingsPage s = new SettingsPage();
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
    public void fill_Email_Template_Form() {
        s.selectPropertyFromDropdown("");
        s.enterEmailId("");
        s.enterPhoneNumber("");
        s.enterWhatsappNumber("");
        s.enterEmailFooter("");
        s.enterPrivacyPolicyLink("");
        s.enterTermsAndConditionsLink("");
        s.enterFaceBookLink("");
        s.enterXLink("");
        s.enterInstagramLink("");
        s.enterYoutubeLink("");
        s.clickOnSaveTemplateButton();
        s.enterAboutUsLink("");
    }

    @Test
    public void fill_Invoice_Template(){
        s.selectPropertyFromDropdown("");
        s.enterEmailId("");
        s.enterPhoneNumber("");
        s.enterWhatsappNumber("");
        s.enterInvoiceTemplateBox("");
    }



}
