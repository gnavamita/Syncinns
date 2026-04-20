package PageObjects;

import ObjectRepository.NewReservationsLocators;
import Utilities.CommonFunctions;

public class NewReservationPage {
    NewReservationsLocators rl = new NewReservationsLocators();
    CommonFunctions cf = new CommonFunctions();

    public void clickOnReservationModule(){
        cf.xpathTypeTextClick(rl.reservationModule);
    }

    public void clickOnNewReservationTab(){
        cf.xpathTypeTextClick(rl.newReservation);
    }

    public void selectCustomerType(String customer){
        cf.xpathTypeTextClick(rl.selectCustomerType);
        cf.selectDropdown(rl.selectCustomerType, customer);
    }

    public void enterCustomerName(String customerName){
        cf.xpathTypeText(rl.enterCustomerName, customerName);
    }

    public void enterPhoneNumber(String phoneNumber){
        cf.xpathTypeText(rl.enterPhoneNumber, phoneNumber);
    }

    public void enterEmailAddress(String emailAddress){
        cf.xpathTypeText(rl.enterEmailAddress, emailAddress);
    }

    public void selectCustomerType2(){
        cf.xpathTypeTextClick(rl.selectCustomerType2);
        cf.xpathTypeTextClick(rl.selectCustomerType2);
    }

    public void selectGender(){
        cf.xpathTypeTextClick(rl.selectGender);
    }

    public void selectNationality(){
        cf.xpathTypeTextClick(rl.selectNationality);
    }

    public void selectPurposeOfVisit(){
        cf.xpathTypeTextClick(rl.selectPurposeOfVisit);
    }



}
