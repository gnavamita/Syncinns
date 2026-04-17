package PageObjects;

import ObjectRepository.MaintenanceListLocators;
import Utilities.CommonFunctions;

public class MaintenanceListPage {
    MaintenanceListLocators ml = new MaintenanceListLocators();
    CommonFunctions cf = new CommonFunctions();


    public void verifyMaintenanceListURL(){
        cf.assertion("", ml.actualMaintenanceListURL);
    }

    public void clickOnHouseKeepingTab(){
        cf.xpathTypeTextClick(ml.houseKeepingTab);
    }

    public void clickOnMaintenanceTab(){
        cf.xpathTypeTextClick(ml.maintenanceListTab);
    }

    public void clickOnAddNewButton(){
        cf.xpathTypeTextClick(ml.addNewButton);
    }

    public void selectPropertyType(String PropertyType) {
        cf.xpathTypeTextClick(ml.selectProperty);
        cf.selectDropdown(ml.selectProperty, PropertyType);
    }

    public void selectTypeOfRequest(String TypeOfRequest) {
        cf.xpathTypeTextClick(ml.selectTypeOfRequest);
        cf.selectDropdown(ml.selectTypeOfRequest, TypeOfRequest);
    }

    public void selectAssignedToType(String AssignedToType) {
        cf.xpathTypeTextClick(ml.selectAssignedToTab);
        cf.selectDropdown(ml.selectAssignedToTab, AssignedToType);
    }

    public void selectEmployeeToType(String employeeType) {
        cf.xpathTypeTextClick(ml.selectEmployeeType);
        cf.selectDropdown(ml.selectEmployeeType, employeeType);
    }

    public void RoomOrAreaNumber(String roomNumber) {
        cf.xpathTypeTextClick(ml.selectRoomOrAreaNumber);
        cf.selectDropdown(ml.selectRoomOrAreaNumber, roomNumber);
    }

    public void enterExpectedDuration(String Duration) {
        cf.xpathTypeText(ml.expectedDurationBox, Duration);
    }

    public void enterEmail(String Email) {
        cf.xpathTypeText(ml.emailBox, Email);
    }

    public void enterWhatsappNumber(String WhatsappNumber) {
        cf.xpathTypeText(ml.whatsappNumberBox, WhatsappNumber);
    }

    public void enterDescription(String notes) {
        cf.xpathTypeText(ml.descriptionBox, notes);
    }

    public void clickOnSubmitButton(){
        cf.xpathTypeTextClick(ml.submitButton);
    }


}
