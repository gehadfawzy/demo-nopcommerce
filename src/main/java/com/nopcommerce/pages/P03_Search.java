package com.nopcommerce.pages;

import com.nopcommerce.config.BaseConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class P03_Search extends BaseConfig {
    By searchLocator = By.name("q");
    By searchButtonLocator = By.cssSelector("button[type=\"submit\"]");
    By elementsLocator = By.cssSelector("h2[class=\"product-title\"]");

    public void search(String searchKey) {
        driver.findElement(searchLocator).sendKeys(searchKey);
    }

    public WebElement clickOnSearch() {
        return driver.findElement(searchButtonLocator);
    }

    public void waitTime() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(elementsLocator));
    }

    public List<WebElement> elements() {
        return driver.findElements(elementsLocator);
    }

}