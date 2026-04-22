package PageObjects;

import ObjectRepository.RoomRateLocators;
import Utilities.CommonFunctions;

public class RoomRatePage {
    RoomRateLocators rl = new RoomRateLocators();
    CommonFunctions cf = new CommonFunctions();

    public void selectPropertyModule(){
        cf.xpathTypeTextClick(rl.propertyModule);
    }

    public void selectManageRoomRateTan(){
        cf.xpathTypeTextClick(rl.manageRoomRateTab);
    }

    public void selectPropertyName(){
        cf.xpathTypeTextClick(rl.propertyName);
    }

    public void selectRoomType(){
        cf.xpathTypeTextClick(rl.roomType);
    }

    public void enterDefaultRate( String defaultRate){
        cf.xpathTypeText(rl.defaultRate, defaultRate);
    }

    public void enterHalfMealRate(String halfMealRate){
        cf.xpathTypeText(rl.halfMealRate, halfMealRate);
    }

    public void enterFullMealRate(String fullMealRate){
        cf.xpathTypeText(rl.fullMealRate, fullMealRate);
    }
}
