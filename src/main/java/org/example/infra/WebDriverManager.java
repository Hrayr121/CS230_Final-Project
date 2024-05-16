package org.example.infra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {
    private static WebDriver driver;

    public static void createDriver() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\hrayr\\IdeaProjects\\chromedriver-win64\\chromedriver-win64");
            driver = new ChromeDriver();
        }

    }

    public static WebDriver getDriver(){
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}

