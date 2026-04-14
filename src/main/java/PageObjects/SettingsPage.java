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
        cf.assertion("Booking",actualTextOfBooking);

        String actualTextOfRoomManagement = cf.fetchText(sl.roomManagementText);
        cf.assertion("Room Management", actualTextOfRoomManagement);

        String actualTextOfHotelFacilities = cf.fetchText(sl.hotelFacilitiesText);
        cf.assertion("Hotel Facilities", actualTextOfHotelFacilities);

        String actualTextOfOperations = cf.fetchText(sl.operationsText);
        cf.assertion("Operations", actualTextOfOperations);


    }


}
