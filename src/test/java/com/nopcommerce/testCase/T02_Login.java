package com.nopcommerce.testCase;

import com.aventstack.extentreports.Status;
import com.nopcommerce.base.BaseTest;
import com.nopcommerce.pages.P02_Login;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class T02_Login extends BaseTest {
    P02_Login login = new P02_Login();
    @Test
    public void loginWithValidData (){
        String methodName = new Exception().getStackTrace()[0].getMethodName();
        test = extent.createTest(methodName, "Your Test Case");
        test.log(Status.INFO, "starting");
        test.assignCategory("Login");
        Assert.assertTrue(driver.getCurrentUrl().equals("https://demo.nopcommerce.com/"));
        login.clickOnLoginButton().click();
        login.writeEmail("gehadfawzi27@gmail.com");
        login.writePassword("gehad1234");
        login.loginButton().click();
        SoftAssert assertMyAccount = new SoftAssert();
        assertMyAccount.assertTrue(login.myAccountButton().equals("my account"));
        assertMyAccount.assertTrue(login.logOutButton().equals("log out"));
        assertMyAccount.assertAll();
    }
    @Test
    public void loginWithInValidData (){
        String methodName = new Exception().getStackTrace()[0].getMethodName();
        test = extent.createTest(methodName, "Your Test Case");
        test.log(Status.INFO, "starting");
        test.assignCategory("Invalid Login");
        Assert.assertTrue(driver.getCurrentUrl().equals("https://demo.nopcommerce.com/"));
        login.clickOnLoginButton().click();
        login.writeEmail("gehadfawzi@outlook.com");
        login.writePassword("gehad");
        login.loginButton().click();
        SoftAssert assertErrorMessage = new SoftAssert();
        assertErrorMessage.assertTrue(login.errorMessage().contains("login was unsuccessful"));
        assertErrorMessage.assertTrue(login.errorMessageColor().equals("#e4434b"));
        assertErrorMessage.assertAll();
    }
}
