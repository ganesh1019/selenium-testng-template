package com.test.automation.pages;

import com.test.automation.helper.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends PageBase {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    /*******************************************************************************************
     * All WebElements are identified by @FindBy annotation
     *******************************************************************************************/

    @FindBy(id = "email-text-field")
    WebElement emailTextBox;

    @FindBy(id = "password-text-field")
    WebElement passwordfTextField;

    @FindBy(id = "signin-button")
    WebElement signInButton;


    @FindBy(id = "signin-button")
    WebElement nextButton;

    @FindBy(id = "app")
    WebElement loginPageDiv;


    /*******************************************************************************************
     * All Page Methods
     *******************************************************************************************/


    public void clickSignInButton() {

        log.info("Clicking Sign In button..\n");
        clickButton(signInButton);
    }

    public void clickNextButton() {

        log.info("Clicking Next button..\n");
        clickButton(nextButton);
    }

    public void enterEmailAddress(String username) {
        log.info("Entering Username:" + username);
        typeText(emailTextBox, username);
    }

    public void enterPassword(String password) {
        log.info("Entering Password:" + password);
        typeText(passwordfTextField, password);
    }

}

