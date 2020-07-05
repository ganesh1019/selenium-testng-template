package com.test.automation.pages;

import com.test.automation.helper.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends PageBase {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    /*******************************************************************************************
     * All WebElements are identified by @FindBy annotation
     *******************************************************************************************/

    @FindBy(tagName = "header")
    WebElement header;

    WebElement profileButton = header.findElement(By.tagName("button"));

    @FindBy(xpath = "//ul[@role='menu']/li")
    List<WebElement> menuOptions;


    /*******************************************************************************************
     * All Page Methods
     *******************************************************************************************/


    public void userLogout() {
        profileButton.click();
        wait(2);
        menuOptions.get(0).click();
    }
}
