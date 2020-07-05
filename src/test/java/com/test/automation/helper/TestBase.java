package com.test.automation.helper;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.util.concurrent.TimeUnit;


public class TestBase {

    public  WebDriver driver = null;
    public  WebDriverWait wait = null;
    private static boolean isInitalized = false;
    public static Logger log = null;
    public static String baseUrl = null;
    public static String environment = null;

    protected TestBase() {

        if (!isInitalized) {
            defineEnvironment();
            initLogs();
            initDriver();
            setBaseUrl();
        }
    }

    /**
     * Define Environment
     */
    private static void defineEnvironment() throws java.lang.NullPointerException{
        try {
            if(!System.getProperty("env").isEmpty())
                environment = System.getProperty("env");
            else
                environment = "staging";
        }
        catch (Exception e) {
            environment = "staging";
        }
    }

    /**
     * Initialize Logger.
     */
    private static void initLogs() {

        DOMConfigurator.configure(System.getProperty("user.dir") + "/log/log4j.xml");
        log = Logger.getLogger("MyLogger");
        log.info("Logger is initialized..");
    }


    /**
     * Initialize Driver.
     */
    private void initDriver() {

        log.info("in Init Driver");
        System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir") + File.separator + "drivers" + File.separator + "chromedriver");

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        String waitTime = "15";

        // Setting WaitTime to max 15 secs

        driver.manage().timeouts().implicitlyWait(Long.parseLong(waitTime), TimeUnit.SECONDS);
        driver.manage().window().setPosition(new Point(0, 0));
        driver.manage().window().maximize();

        //Explicit Wait + Expected Conditions
        wait = new WebDriverWait(driver, 10);
        log.info("Driver initialized - Browser set to Chrome");
        isInitalized = true;
    }

    /**
     *  Set Base URL
     */
    private static void setBaseUrl() {
        if (environment.equals("staging")) {
            baseUrl = "https://www.google.com";
            log.info("Base URL set to - " + baseUrl + "\n");
        }
    }

    /**
     * Quit Driver
     */
    public void quitDriver() {
        driver.manage().deleteAllCookies();
        driver.quit();
        log.info("Closing Browser..");

    }

}
