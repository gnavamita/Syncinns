package PageObjects;

import ObjectRepository.LostAndFoundLocators;
import Utilities.CommonFunctions;

public class LostAndFoundPage {
CommonFunctions cf = new CommonFunctions();
LostAndFoundLocators fl = new LostAndFoundLocators();

    public void clickFrontDeskModule(){
        cf.xpathTypeTextClick(fl.frontDeskModule);
    }

    public void clickLostAndFound(){
        cf.xpathTypeTextClick(fl.lostAndFoundTab);
    }

    public void clickAddNewButton(){
        cf.xpathTypeTextClick(fl.addNewButton);
    }

    public void selectProperty(){
        cf.xpathTypeTextClick(fl.selectProperty);
    }

    public void fillDateBox(String date){
        cf.xpathTypeText(fl.enterDate, date);
    }

    public void fillReservationCodeBox(String reservationCode){
        cf.xpathTypeText(fl.enterReservationCode, reservationCode);
    }

    public void selectRoomNumber(){
        cf.xpathTypeTextClick(fl.selectRoomNumber);
    }

    public void fillReportedByBox(String reportedBy ){
        cf.xpathTypeText(fl.enterReportedBy,reportedBy);
    }

    public void fillItemNameBox(String itemName){
        cf.xpathTypeText(fl.enterItemName, itemName);
    }

    public void fillDescriptionBox(String description){
        cf.xpathTypeText(fl.enterDescription, description);
    }

    public void clickOnSubmitButton(){
        cf.xpathTypeTextClick(fl.clickSubmitButton);
    }
}
