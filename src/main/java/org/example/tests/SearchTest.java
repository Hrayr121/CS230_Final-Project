package org.example.tests;

import org.example.pages.SearchPage;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SearchTest extends BaseTest {
    private SearchPage searchPage;

    @Test
    public void testSearchFunctionality() {
        searchPage = new SearchPage();    //pass in driver???
        navigateToWebsite("https://automationexercise.com/");
        String keyword = "Men Tshirt";
        searchPage.search(keyword);
        int searchResultsCount = searchPage.getSearchResultsCount();
        // Example assertion, replace with your actual validation
        assertEquals(1, searchResultsCount);

        //assertion for checking if the SEARCHED PRODUCTS is visible and displayed(class = title text-center)

        //tanem arandzin tegh????
        boolean isSearchedDisplayed = searchPage.isSearchedProductsDisplayed();
        Assert.assertTrue(isSearchedDisplayed);
    }



}
