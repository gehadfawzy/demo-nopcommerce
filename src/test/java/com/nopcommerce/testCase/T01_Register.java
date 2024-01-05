package com.nopcommerce.testCase;

import com.aventstack.extentreports.Status;
import com.nopcommerce.base.BaseTest;
import com.nopcommerce.pages.P01_Register;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
    public class T01_Register extends BaseTest {
        P01_Register register = new P01_Register();

        @Test
        public void registerWithValidData (){
            String methodName = new Exception().getStackTrace()[0].getMethodName();
            test = extent.createTest(methodName, "Your Test Case");
            test.log(Status.INFO, "starting");
            test.assignCategory("Register");
            Assert.assertTrue(driver.getCurrentUrl().equals("https://demo.nopcommerce.com/"));
            register.registerButton().click();
            register.genderSelect().click();
            register.setFirstName("Gehad");
            register.setLastName("Fawzy");
            register.setDateOfBirth();
            register.setEmail("gehadfawzi27@gmail.com");
            register.setPassword("gehad1234");
            register.setConfirmPassword("gehad1234");
            register.clickOnRegister().click();
            SoftAssert assertRegisterMessage = new SoftAssert();
            assertRegisterMessage.assertTrue(register.registrationMessage().equals("your registration completed"));
            assertRegisterMessage.assertTrue(register.registrationMessageColor().equals("#4cb17c"));
            assertRegisterMessage.assertAll();
        }


}
