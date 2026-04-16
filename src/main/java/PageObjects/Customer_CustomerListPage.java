package PageObjects;

import ObjectRepository.CustomerPageLocators;
import Utilities.CommonFunctions;

public class Customer_CustomerListPage {
    CommonFunctions cf = new CommonFunctions();
    CustomerPageLocators cl = new CustomerPageLocators();

    String customerListURL = "https://app.syncinns.com/syncinns-pms/customer";

    public void verifyCustomerListPageURL() {
        String actualURL = cf.getCurrentURL();
        cf.assertion(this.customerListURL, actualURL);
    }

    public void clickOnCustomer() {
        cf.xpathTypeTextClick(cl.customer_Module);
    }

    public void clickOnCustomerList() {
        cf.xpathTypeTextClick(cl.customer_List);
    }

    public void clickOnAddNewCustomer() {
        cf.xpathTypeTextClick(cl.add_CustomerButton);
    }

    public void clickOnCustomerType(String value) {
        cf.xpathTypeTextClick(cl.customerType);
        cf.selectDropdown(cl.customerType, value);
    }

    public void enterFirstName(String firstName) {
        cf.xpathTypeText(cl.first_Name, firstName);
    }

    public void enterLastName(String lastName) {
        cf.xpathTypeText(cl.last_Name, lastName);
    }

    public void enterEmailAddress(String emailAddress) {
        cf.xpathTypeText(cl.email_Address, emailAddress);
    }

    public void enterContactNumber(String contactNumber) {
        cf.xpathTypeText(cl.contact_Number, contactNumber);
    }

    public void enterAddress(String address) {
        cf.xpathTypeText(cl.enter_Address, address);
    }

    public void clickAddButton() {
        cf.xpathTypeTextClick(cl.add_Button);
    }


}
