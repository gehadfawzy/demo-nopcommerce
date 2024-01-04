package com.nopcommerce.pages;

import com.nopcommerce.config.BaseConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

public class P04_Wishlist extends BaseConfig {
    By elementLocator = By.cssSelector("div[data-productid=\"18\"]");
    By wishlistButtonLocator = By.id("add-to-wishlist-button-18");
    By closeButtonLocator = By.className("close");
    By addProductToWishlistLocator = By.cssSelector("div[class=\"bar-notification success\"]");
    By wishElementLocator = By.xpath("(//h2[@class=\"product-title\"] ) [3]");
    By wishlistIconLocator = By.className("ico-wishlist");
    By elementInWishlistLocator = By.cssSelector("td[class=\"product\"]");

    public void scrollToElement() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(elementLocator);
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public WebElement clickOnElement() {

        return driver.findElement(elementLocator);
    }

    public WebElement clickOnWishlistButton() {
        return driver.findElement(wishlistButtonLocator);
    }

    public String wishlistMessage() {
        return driver.findElement(addProductToWishlistLocator).getText().toLowerCase();
    }

    public String wishlistColorMessage() {
        String rgbColor = driver.findElement(addProductToWishlistLocator).getCssValue("background-color");
        return Color.fromString(rgbColor).asHex();
    }

    public WebElement closeMessage() {
        return driver.findElement(closeButtonLocator);
    }

    public String addedElement() {
        return driver.findElement(wishElementLocator).getText().toLowerCase();
    }

    public String wishElement() {
        return driver.findElement(wishlistIconLocator).getText().toLowerCase();
    }

    public WebElement clickOnWishlistIcon() {

     return driver.findElement(wishlistIconLocator);
}
    public String elementInWishlist() {
        return driver.findElement(elementInWishlistLocator).getText().toLowerCase();
    }
}

