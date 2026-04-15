package TestClasses;

import PageObjects.HRM_ManageEmployeePage;
import Utilities.BaseClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class HRM_manageEmployeeTests {
    HRM_ManageEmployeePage m = new HRM_ManageEmployeePage();
    BaseClass b = new BaseClass();

    String ManageEmployeeURL = "https://app.syncinns.com/login";

    @BeforeTest
    public void goToURL(){
        b.openBrowser();
        b.goToURL(this.ManageEmployeeURL);
    }

    @AfterTest
    public void closeBrowser(){
        b.closeBrowser();
    }

    public void Add_Employee_with_correct_credentials(){
        m.enterFirstName("");
        m.enterLastName("");
        m.enterPhoneNumber("");
        m.enterEmailField("");
        m.selectGenderFromDropdown("");
        m.enterDateOfBirth("");
        m.enterEmploymentType("");
        m.enterAddress("");
        m.selectProperty("");


    }


}
