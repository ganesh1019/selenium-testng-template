package com.test.automation.helper;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public abstract class PageBase {

    /**
     * Driver
     */
    protected WebDriver driver = null;
    public Logger log = TestBase.log;


    public PageBase(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    /**
     * Wait
     */
    public static void wait(int timeInSeconds) {

        try {
            Thread.sleep(timeInSeconds * 1000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    /**
     * Click Action
     */
    public void clickButton(WebElement element) {
        element.click();
    }


    /**
     * Enter Text
     */
    public void typeText(WebElement element, String text) {
        element.sendKeys(text);
    }


    /**
     * Check if Element is Visible
     */
    public boolean isElementPresent(String selector) {

        try {
            driver.findElement(By.xpath(selector));
            return true;
        }
        catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

}

