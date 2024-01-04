package com.nopcommerce.testCase;

import com.aventstack.extentreports.Status;
import com.nopcommerce.base.BaseTest;
import com.nopcommerce.pages.P03_Search;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class T03_Search extends BaseTest {
P03_Search search = new P03_Search();
    By elementsLocator = By.cssSelector("h2[class=\"product-title\"]");
    @Test
    public void tc03Search1 (){
        String methodName = new Exception().getStackTrace()[0].getMethodName();
        test = extent.createTest(methodName, "Your Test Case");
        test.log(Status.INFO, "starting");
        test.assignCategory("Search");
        Assert.assertTrue(driver.getCurrentUrl().equals("https://demo.nopcommerce.com/"));
        search.search("Apple");
        search.clickOnSearch().click();
        int numberOfAppleElements = search.elements().size();

        for (int i = 0 ; i< numberOfAppleElements ; i++){
            String appleElementName = search.elements().get(i).getText().toLowerCase();
            if (appleElementName.contains("Apple")){
                Assert.assertTrue(appleElementName.contains("Apple"));
            }
        }
        search.search("Card");
        search.clickOnSearch().click();
        int numberOfCardElements = search.elements().size();
        for (int i = 0 ; i< numberOfCardElements ; i++) {
            String cardElementName = search.elements().get(i).getText().toLowerCase();
            Assert.assertFalse(cardElementName.contains("apple"));
            Assert.assertTrue(cardElementName.contains("card"));
        }
    }
    @Test
    public void tc03Search2 (){
        String methodName = new Exception().getStackTrace()[0].getMethodName();
        test = extent.createTest(methodName, "Your Test Case");
        test.log(Status.INFO, "starting");
        test.assignCategory("Search1");
        Assert.assertTrue(driver.getCurrentUrl().equals("https://demo.nopcommerce.com/"));
        search.search("Apple");
        search.clickOnSearch().click();
        search.waitTime();
        int numberOfCardElements = search.elements().size();
        for (int i = 0 ; i< numberOfCardElements ; i++) {
            String appleElementName1 = search.elements().get(i).getText().toLowerCase();
            SoftAssert softAssert = new SoftAssert();
            softAssert.assertTrue(appleElementName1.contains("apple"));
            softAssert.assertAll();
        }

    }
}
