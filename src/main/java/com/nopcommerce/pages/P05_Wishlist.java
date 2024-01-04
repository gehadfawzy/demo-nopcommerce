package com.nopcommerce.pages;

import com.nopcommerce.config.BaseConfig;
import org.bouncycastle.jcajce.provider.symmetric.SEED;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;

public class P05_Wishlist extends BaseConfig {
    By macElementLocator = By.cssSelector("div[data-productid=\"4\"]");
    By addToCartButtonLocator = By.xpath("(//button[@class=\"button-2 product-box-add-to-cart-button\"])[2]");
    By addToCartIconLocator = By.cssSelector("button[class=\"button-1 add-to-cart-button\"]");
    By successMessageLocator = By.cssSelector("div[class=\"bar-notification success\"]");

    By closeIconLocator = By.cssSelector("span[class=\"close\"]");
    By shoppingCartIconLocator = By.className("ico-cart");

    By rulesButtonLocator = By.cssSelector("input[id=\"termsofservice\"]");

    By checkoutButtonLocator = By.id("checkout");

    By checkoutAsGuestButtonLocator = By.cssSelector("button[class=\"button-1 checkout-as-guest-button\"]");
    By firstNameLocator = By.id("BillingNewAddress_FirstName");
    By lastNameLocator = By.id("BillingNewAddress_LastName");
    By emailLocator = By.id("BillingNewAddress_Email");
    By countryLocator = By.cssSelector("select[data-trigger=\"country-select\"]");
    By cityLocator = By.id("BillingNewAddress_City");
    By addressLocator = By.id("BillingNewAddress_Address1");

    By postalCodeLocator = By.id("BillingNewAddress_ZipPostalCode");
    By phoneLocator = By.id("BillingNewAddress_PhoneNumber");

    By continueButtonLocator = By.xpath("(//button[@type=\"button\"]) [5]");
   By shippingMethodLocator = By.id("shippingoption_0");

   By continueButtonLocator2 = By.cssSelector("button[class=\"button-1 shipping-method-next-step-button\"]");
By continueButtonLocator3 = By.cssSelector("button[class=\"button-1 payment-method-next-step-button\"]");
   By creditCardIconLocator = By.id("paymentmethod_1");
   By creditCardTypeButtonLocator = By.id("CreditCardType");
   By cardHolderNameLocator = By.id("CardholderName");
   By cardNumberLocator = By.id("CardNumber");

   By expireMonthLocator = By.id("ExpireMonth");
   By expireYearLocator = By.id("ExpireYear");
   By cardCodeLocator = By.id("CardCode");
   By continueButtonLocator4 = By.cssSelector("button[class=\"button-1 payment-info-next-step-button\"]");
  By confirmButtonLocator = By.cssSelector("button[class=\"button-1 confirm-order-next-step-button\"]");
By confirmationMessageLocator = By.cssSelector("div[class=\"section order-completed\"] div[class=\"title\"]");
    public void scrollToElement() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(macElementLocator);
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public WebElement clickOnAddToCartButton(){
        return driver.findElement(addToCartButtonLocator);
    }

    public WebElement clickOnAddToCartIcon(){
        return driver.findElement(addToCartIconLocator);
    }

    public String addToCartSuccessMessage(){
        return driver.findElement(successMessageLocator).getText().toLowerCase();
    }
    public String wishlistColorMessage() {
        String rgbColor = driver.findElement(successMessageLocator).getCssValue("background-color");
        return Color.fromString(rgbColor).asHex();
    }

    public WebElement closeIcon(){
        return driver.findElement(closeIconLocator);
    }

    public String shoppingCartIcon(){
        return driver.findElement(shoppingCartIconLocator).getText().toLowerCase();
    }

    public WebElement clickOnShoppingCartIcon(){
        return driver.findElement(shoppingCartIconLocator);
    }
    public void mouseHover(){
        Actions actions = new Actions(driver);
        WebElement imgNumber01 = driver.findElement(shoppingCartIconLocator);
        actions.moveToElement(imgNumber01).perform();
    }

    public WebElement termsMessageIcon(){
        return driver.findElement(rulesButtonLocator);
    }
    public WebElement clickOnCheckoutButton(){
        return driver.findElement(checkoutButtonLocator);
    }
    public WebElement clickOnCheckoutAsGuestButton(){
        return driver.findElement(checkoutAsGuestButtonLocator);
    }
    public void setFirstName(String firstName){
       driver.findElement(firstNameLocator).sendKeys(firstName);
    }
    public void setLastName(String lastName){
        driver.findElement(lastNameLocator).sendKeys(lastName);
    }
    public void setEmail(String email){
        driver.findElement(emailLocator).sendKeys(email);
    }
    public void selectCountry(){
        Select selectCountryFromDropDownMenu = new Select(driver.findElement(countryLocator));
        selectCountryFromDropDownMenu.selectByValue("123");
    }
public void selectCity(String city){
  driver.findElement(cityLocator).sendKeys(city);
}
    public void address(String address){
        driver.findElement(addressLocator).sendKeys(address);
    }

    public void setPostalCode(String postalCode){
        driver.findElement(postalCodeLocator).sendKeys(postalCode);
    }

    public void setPhoneNumber(String phoneNumber){
        driver.findElement(phoneLocator).sendKeys(phoneNumber);
    }
    public WebElement clickOnContinueButton(){
        return driver.findElement(continueButtonLocator);
    }
    public WebElement shippingMethodButton(){
        return driver.findElement(shippingMethodLocator);
    }
    public WebElement clickOnContinueIcon(){
        return driver.findElement(continueButtonLocator2);
    }
    public WebElement clickOnCreditCardButton(){
        return driver.findElement(creditCardIconLocator);
    }
    public WebElement clickOnContinueIcon2(){
        return driver.findElement(continueButtonLocator3);
    }
    public void selectCreditCardType() {
        Select selectcreditcardtypefromdropdownmenu = new Select(driver.findElement(creditCardTypeButtonLocator));
        selectcreditcardtypefromdropdownmenu.selectByValue("visa");
    }
     public void cardHolderName(String name){
        driver.findElement(cardHolderNameLocator).sendKeys(name);
     }
    public void cardNumber(String number){
        driver.findElement(cardNumberLocator).sendKeys(number);
    }

    public void expirationDate(){
        Select selectexpiremonthfromdropdownmenu = new Select(driver.findElement(expireMonthLocator));
        selectexpiremonthfromdropdownmenu.selectByValue("6");
        Select selectexpireyearfromdropdownmenu = new Select(driver.findElement(expireYearLocator));
        selectexpireyearfromdropdownmenu.selectByValue("2026");
    }
    public void cardCode(String code){
        driver.findElement(cardCodeLocator).sendKeys(code);
    }
    public WebElement clickOnContinueIcon3(){
        return driver.findElement(continueButtonLocator4);
    }
    public WebElement clickOnConfirmIcon(){
        return driver.findElement(confirmButtonLocator);
    }
public String confirmationMessage(){
        return driver.findElement(confirmationMessageLocator).getText().toLowerCase();
}
}
