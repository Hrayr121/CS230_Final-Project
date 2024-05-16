package org.example.pages;

import org.example.infra.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class LoginPage extends BasePage {
    private By usernameInputLocator = By.id("email");
    private By passwordInputLocator = By.id("password");
    private By loginButtonLocator = By.id("div.container div.row div.col-sm-4.col-sm-offset-1:nth-child(1) div.login-form form:nth-child(2) > button.btn.btn-default:nth-child(4)");


    public void setUsername(String username) {
        WebElement usernameInput = WebDriverManager.getDriver().findElement(usernameInputLocator);
        usernameInput.sendKeys(username);
    }

    public void setPassword(String password) {
        WebElement passwordInput =  WebDriverManager.getDriver().findElement(passwordInputLocator);
        passwordInput.sendKeys(password);
    }

    public void clickLogin() {
        WebElement loginButton =  WebDriverManager.getDriver().findElement(loginButtonLocator);
        loginButton.click();
    }
}

