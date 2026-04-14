package PageObjects;

import ObjectRepository.SettingsPageLocators;
import Utilities.CommonFunctions;

public class SettingsPage {

    CommonFunctions cf = new CommonFunctions();
    SettingsPageLocators sl = new SettingsPageLocators();

    public void initialVerifications() {
        String actualTextOfLoginHeader = cf.fetchText(sl.settingsHeaderText);
        cf.assertion("Settings", actualTextOfLoginHeader);

        String actualTextOfGeneralSettings = cf.fetchText(sl.generalSettingsText);
        cf.assertion("General Settings", actualTextOfGeneralSettings);

        String actualTextOfBookingSettings = cf.fetchText(sl.bookingSettingsText);
        cf.assertion("Booking Settings", actualTextOfBookingSettings);

        String actualTextOfHotelSettings = cf.fetchText(sl.hotelSettingsText);
        cf.assertion("Hotel Settings", actualTextOfHotelSettings);

        String actualTextOfAccountsSettings = cf.fetchText(sl.accountSettingsText);
        cf.assertion("Account Settings", actualTextOfAccountsSettings);

        String actualTextOfCompanyManagement = cf.fetchText(sl.companyManagementText);
        cf.assertion("Company Management", actualTextOfCompanyManagement);

        String actualTextOfBooking = cf.fetchText(sl.BookingText);
        cf.assertion("Booking", actualTextOfBooking);

        String actualTextOfRoomManagement = cf.fetchText(sl.roomManagementText);
        cf.assertion("Room Management", actualTextOfRoomManagement);

        String actualTextOfHotelFacilities = cf.fetchText(sl.hotelFacilitiesText);
        cf.assertion("Hotel Facilities", actualTextOfHotelFacilities);

        String actualTextOfOperations = cf.fetchText(sl.operationsText);
        cf.assertion("Operations", actualTextOfOperations);

    }

    public void selectPropertyFromDropdown(String property) {
        try {
            cf.xpathTypeTextClick(property);
            Thread.sleep(3000);
            cf.selectDropdown(sl.selectProperty, "");
        } catch (Exception e) {
            System.out.println("error occurred " + e.getMessage());
        }
    }

    public void enterEmailId(String email) {
        cf.xpathTypeText(sl.emailBox, email);
    }

    public void enterPhoneNumber(String phoneNumber) {
        cf.xpathTypeText(sl.phoneNumberBox, phoneNumber);
    }

    public void enterWhatsappNumber(String whatsappNumber){
        cf.xpathTypeText(sl.whatsappBox,whatsappNumber);
    }


    public void enterEmailFooter(String email){
        cf.xpathTypeText(sl.emailFooterBox,email);
    }

    public void enterAboutUsLink(String link){
        cf.xpathTypeText(sl.aboutUsLinkBox,link);
    }

    public void enterPrivacyPolicyLink(String link){
        cf.xpathTypeText(sl.privacyPolicyLink,link);
    }
    public void enterTermsAndConditionsLink(String link){
        cf.xpathTypeText(sl.termsAndConditionLinkBox,link);
    }
    public void enterFaceBookLink(String link){
        cf.xpathTypeText(sl.facebookLinkBox, link );
    }
    public void enterXLink(String link){
        cf.xpathTypeText(sl.xLinkBox, link );
    }
    public void enterInstagramLink(String link){
        cf.xpathTypeText(sl.instagramLinkBox, link );
    }
    public void enterYoutubeLink(String link){
        cf.xpathTypeText(sl.youtubeLinkBox, link );
    }
    public void clickOnSaveTemplateButton(){
        cf.xpathTypeTextClick(sl.saveTemplateButton);
    }


}
