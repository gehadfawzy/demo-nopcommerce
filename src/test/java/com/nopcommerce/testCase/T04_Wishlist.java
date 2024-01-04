package com.nopcommerce.testCase;

import com.aventstack.extentreports.Status;
import com.nopcommerce.base.BaseTest;
import com.nopcommerce.pages.P04_Wishlist;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T04_Wishlist extends BaseTest {
  P04_Wishlist wishlist = new P04_Wishlist();
    @Test
    public void tc04wishlist1 (){
        String methodName = new Exception().getStackTrace()[0].getMethodName();
        test = extent.createTest(methodName, "Your Test Case");
        test.log(Status.INFO, "starting");
        test.assignCategory("Wishlist");
        Assert.assertTrue(driver.getCurrentUrl().equals("https://demo.nopcommerce.com/"));
        wishlist.scrollToElement();
        String element = wishlist.addedElement();
        wishlist.clickOnElement().click();
        wishlist.clickOnWishlistButton().click();
        Assert.assertTrue(wishlist.wishlistMessage().contains("the product has been added to your"));
        Assert.assertTrue(wishlist.wishlistColorMessage().equals("#4bb07a"));
        wishlist.closeMessage().click();
        Assert.assertTrue(wishlist.wishElement().contains("1"));
        wishlist.clickOnWishlistIcon().click();
        Assert.assertTrue(wishlist.elementInWishlist().equals(element));

    }
}
