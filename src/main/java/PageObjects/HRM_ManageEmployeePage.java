package PageObjects;

import ObjectRepository.HRM_manageEmployeeLocators;
import Utilities.CommonFunctions;

public class HRM_ManageEmployeePage {
    HRM_manageEmployeeLocators ml = new HRM_manageEmployeeLocators();
    CommonFunctions cf = new CommonFunctions();

    public void enterFirstName(String firstname) {
        cf.xpathTypeText(ml.firstNameBox, firstname);
    }

    public void enterLastName(String lastname) {
        cf.xpathTypeText(ml.lastNameBox, lastname);
    }

    public void enterPhoneNumber(String phoneNumber) {
        cf.xpathTypeText(ml.phoneNumberBox, phoneNumber);
    }

    public void enterEmailField(String emailId) {
        cf.xpathTypeText(ml.emailIdBox, emailId);
    }

    public void selectGenderFromDropdown(String Gender) {
        cf.idTypeTextClick(Gender);
        cf.selectDropdown(ml.propertyDropdown, "");
    }

    public void enterDateOfBirth(String DOB) {
        cf.xpathTypeText(ml.dateOfBirthBox, DOB);
    }

    public void enterEmploymentType(String value) {
        try {
            cf.xpathTypeTextClick(ml.employmentTypeBox);
            Thread.sleep(3000);
            cf.selectDropdown(ml.employmentTypeBox, "");
        } catch (Exception e) {
            System.out.println("error occured" + e.getMessage());
        }
    }

    public void enterAddress(String address) {
        cf.xpathTypeText(ml.streetBox, address);
    }

    public void selectProperty(String property) {
        try {

            cf.xpathTypeTextClick(ml.propertyDropdown);
            Thread.sleep(3000);
            cf.selectDropdown(ml.propertyDropdown, property);
        } catch (Exception e) {
            System.out.println("error occurred " + e.getMessage());
        }
    }

            public void selectDepartment(String dept){
        try {
            cf.xpathTypeTextClick(ml.departmentDropdown);
            Thread.sleep(3000);
            cf.selectDropdown(ml.departmentDropdown, dept);
        }
        catch (Exception e){
            System.out.println("error occurred "+ e.getMessage());
        }
            }
}
