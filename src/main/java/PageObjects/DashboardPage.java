package PageObjects;

import ObjectRepository.DashboardPageLocators;
import Utilities.CommonFunctions;

public class DashboardPage {
    CommonFunctions cf = new CommonFunctions();
    DashboardPageLocators dl = new DashboardPageLocators();

    String dashboardPageURL = "https://app.syncinns.com/syncinns-pms/dashboard";

    public void verifyDashboardPageURL() {
        String actualURL = cf.getCurrentURL();
        cf.assertion(this.dashboardPageURL, actualURL);

    }

    public void initialVerifications() {
        String actualTextOfLoginHeader = cf.fetchText(dl.loginHeader);
        String actualTextOfOverviewHeader = cf.fetchText(dl.overviewText);
        String actualTextOfCheckInCheckOutText = cf.fetchText(dl.checkInAndCheckOutText);
        String actualTextOfFrontOfficeAndReservationText = cf.fetchText(dl.Front_Office_And_Reservation_Desk);
        String actualTextOfFrontOfficeText = cf.fetchText(dl.Front_OfficeText);
        String actualTextOfHouseKeepingText = cf.fetchText(dl.House_KeepingText);
        String actualTextOfAccountsText = cf.fetchText(dl.AccountsText);
        String actualTextOfHRDashboardText = cf.fetchText(dl.HR_DashboardText);
        String actualTextOfRestaurantText = cf.fetchText(dl.RestaurantText);

    }
}
