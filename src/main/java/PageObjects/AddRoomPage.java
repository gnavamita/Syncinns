package PageObjects;

import ObjectRepository.AddRoomLocators;
import Utilities.CommonFunctions;

public class AddRoomPage {
    AddRoomLocators rl = new AddRoomLocators();
    CommonFunctions cf = new CommonFunctions();

    public void clickOnPropertyModule() {
        cf.xpathTypeTextClick(rl.propertyModule);
    }

    public void clickOnAddRoomTab() {
        cf.xpathTypeTextClick(rl.AddRoomTab);
    }

    public void selectTower(String tower) {
        cf.xpathTypeTextClick(rl.selectTower);
        cf.selectDropdown(rl.selectTower, tower);
    }

    public void selectFloor(String floor) {
        cf.xpathTypeTextClick(rl.selectFloor);
        cf.selectDropdown(rl.selectFloor, floor);
    }

    public void enterRoomNumber(String roomNumber) {
        cf.xpathTypeText(rl.enterRoomNumber, roomNumber);
    }

    public void selectTRoomType() {
        cf.xpathTypeTextClick(rl.selectRoomType);
    }

    public void selectRoomView() {
        cf.xpathTypeTextClick(rl.selectRoomView);
    }

    public void enterSize(String size) {
        cf.xpathTypeText(rl.sizeBox, size);
    }

    public void selectAmenities(String amenities) {
        cf.xpathTypeTextClick(rl.selectAmenities);
        cf.xpathTypeText(rl.selectAmenities, amenities);
    }

    public void clickSaveButton(){
        cf.xpathTypeTextClick(rl.clickSaveButton);
    }

}
