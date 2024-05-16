package org.example.tests;

import org.example.infra.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.createDriver();
        driver = WebDriverManager.getDriver();
    }

    @After
    public void tearDown() {
        WebDriverManager.quitDriver();
    }

    protected void navigateToWebsite(String url) {
        driver.get(url);
    }
}

