package PageObjects;

import Utilities.CommonFunctions;

public class DashboardPage {
    CommonFunctions cf = new CommonFunctions();

    String dashboardPageURL = "https://app.syncinns.com/syncinns-pms/dashboard";

    public void verifyDashboardPageURL() {
        String actualURL = cf.getCurrentURL();
        cf.assertion(this.dashboardPageURL, actualURL);

    }

    public void initialVerifications() {

    }
}
