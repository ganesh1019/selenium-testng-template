package com.test.automation.tests;

import com.test.automation.helper.TestBase;
import com.test.automation.pages.LoginPage;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class Testset extends TestBase {

    LoginPage loginPage;

    @Test
    public void testCase() {
        loginPage = new LoginPage(driver);
        driver.navigate().to(TestBase.baseUrl);
    }

    @AfterTest
    public void tearDown() {
        quitDriver();
    }

}
