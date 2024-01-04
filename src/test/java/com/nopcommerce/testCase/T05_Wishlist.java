package com.nopcommerce.testCase;

import com.aventstack.extentreports.Status;
import com.nopcommerce.base.BaseTest;
import com.nopcommerce.pages.P04_Wishlist;
import com.nopcommerce.pages.P05_Wishlist;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T05_Wishlist extends BaseTest {

P05_Wishlist wishlist2 = new P05_Wishlist();
    @Test
    public void tc05wishlist1 () {
        String methodName = new Exception().getStackTrace()[0].getMethodName();
        test = extent.createTest(methodName, "Your Test Case");
        test.log(Status.INFO, "starting");
        test.assignCategory("Wishlist2");
        Assert.assertTrue(driver.getCurrentUrl().equals("https://demo.nopcommerce.com/"));
        wishlist2.scrollToElement();
        wishlist2.clickOnAddToCartButton().click();
        wishlist2.clickOnAddToCartIcon().click();
        Assert.assertTrue(wishlist2.addToCartSuccessMessage().contains("the product has been added to your"));
        Assert.assertTrue(wishlist2.wishlistColorMessage().equals("#4bb07a"));
        wishlist2.closeIcon().click();
        Assert.assertTrue(wishlist2.shoppingCartIcon().contains("2"));
        wishlist2.mouseHover();
        wishlist2.clickOnShoppingCartIcon().click();
        wishlist2.termsMessageIcon().click();
        wishlist2.clickOnCheckoutButton().click();
        wishlist2.clickOnCheckoutAsGuestButton().click();
        wishlist2.setFirstName("Gehad");
        wishlist2.setLastName("Fawzy");
        wishlist2.setEmail("gehadfawzi622@gmail.com");
        wishlist2.selectCountry();
        wishlist2.selectCity("Giza");
        wishlist2.address("32 second gate - pyramids gardens");
        wishlist2.setPostalCode("11111");
        wishlist2.setPhoneNumber("01284293347");
        wishlist2.clickOnContinueButton().click();
        wishlist2.shippingMethodButton().click();
        wishlist2.clickOnContinueIcon().click();
        wishlist2.clickOnCreditCardButton().click();
        wishlist2.clickOnContinueIcon2().click();
        wishlist2.selectCreditCardType();
        wishlist2.cardHolderName("Gehad Fawzy");
        wishlist2.cardNumber("4475270076939252");
        wishlist2.expirationDate();
        wishlist2.cardCode("035");
        wishlist2.clickOnContinueIcon3().click();
        wishlist2.clickOnConfirmIcon().click();
        System.out.println(wishlist2.confirmationMessage());
        Assert.assertTrue(wishlist2.confirmationMessage().contains("your order has been successfully processed!"));

    }
}
