package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SearchPage extends BasePage {
    private By searchBoxLocator = By.id("search_product");
    private By searchButtonLocator = By.id("submit_search");
    private By searchResultsLocator = By.cssSelector(".productinfo.text-center");// check this??????

    private By searchedProductsLocator = By.cssSelector(".title.text-center");

   // public SearchPage(WebDriver driver) {
//        super(driver);
//    }

    public void search(String keyword) {
        WebElement searchBox = driver.findElement(searchBoxLocator); //stegh mna te tanem dus???
        searchBox.sendKeys(keyword);

        WebElement searchButton = driver.findElement(searchButtonLocator);
        searchButton.click();
    }

    public int getSearchResultsCount() {
        List<WebElement> searchResults = driver.findElements(searchResultsLocator);
        return searchResults.size();
    }

    public boolean isSearchedProductsDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement searchedProducts = wait.until(ExpectedConditions.visibilityOfElementLocated(searchedProductsLocator));

        return searchedProducts.isDisplayed();
    }
}

