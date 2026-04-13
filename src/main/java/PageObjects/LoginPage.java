package PageObjects;


import ObjectRepository.LoginPageLocators;
import Utilities.CommonFunctions;

public class LoginPage {

    CommonFunctions cf = new CommonFunctions();
    LoginPageLocators ll = new LoginPageLocators();

    public void initialVerification() {
        String actualTextOfLoginHeader = cf.fetchText(ll.loginHeader);
        cf.assertion("LOGIN", actualTextOfLoginHeader);

        String actualTextOfLoginToContinue = cf.fetchText(ll.loginToContinueText);
        cf.assertion("Log in with email to continue", actualTextOfLoginHeader);

        String actualTextOfLoginButton = cf.fetchText(ll.loginButton);
        cf.assertion("Login Now", actualTextOfLoginHeader);
        cf.assertion("Login Now", actualTextOfLoginHeader);
    }

    public void enterUserName(String username){
        cf.typeText(ll.usernameTextBox, username);
    }

    public void enterPassword(String password){
        cf.typeText(ll.passwordTextBox, password);
    }

    public void clickOnLoginButton() {
        try {
            cf.clickOnButton(ll.loginButton);
            Thread.sleep(3000);
        }
        catch (Exception e){
            System.out.println("exception occurred "+e.getMessage());
        }
    }

    public void verifyErrorsOnLoginPage(){
        cf.assertion("Email is required","");
        cf.assertion("Password is required","");
    }
}
