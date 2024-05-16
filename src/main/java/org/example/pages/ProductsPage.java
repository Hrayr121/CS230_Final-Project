package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductsPage extends BasePage {
    private By productsSaleImage = By.id("sale_image");
    private By inputBoxLocator = By.id("search_product");



    public boolean isProductsPageVisible() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement saleImageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(productsSaleImage));
        //WebElement searchBoxElement = driver.findElement(inputBoxLocator);

        return saleImageElement.isDisplayed() && searchBoxElement.isDisplayed();
    }

    public boolean isProperURL(){
        return driver.getCurrentUrl().equals("https://automationexercise.com/products");
        //or in the test method  Assert.assertEquals(currentUrl, "url" );????
    }
}

