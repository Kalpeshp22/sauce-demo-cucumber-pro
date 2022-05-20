package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage extends Utility {

    private static final Logger log = LogManager.getLogger(CheckoutPage.class.getName());

    public CheckoutPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement selectCheckOut;

    @CacheLookup
    @FindBy(xpath = "//input[@id='first-name']")
    WebElement firstNameField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='last-name']")
    WebElement lastNameField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='postal-code']")
    WebElement zipPostalCode;

    @CacheLookup
    @FindBy(xpath = "//input[@id='continue']")
    WebElement continueButton;

    @CacheLookup
    @FindBy(xpath = "//button[@id='finish']")
    WebElement finishButton;
    @CacheLookup
    @FindBy(xpath = "//div[@id='checkout_complete_container']")
    WebElement thankYouText;


    public void goToCheckOutAndOpen() {
        clickOnElement(selectCheckOut);
        log.info("go to check out and open " + selectCheckOut.getText());
    }

    public void enterFirsatName(String name) {
        sendTextToElement(firstNameField, name);
        log.info("enter first name" + firstNameField.getText());
    }

    public void enterLastName(String surname) {
        sendTextToElement(lastNameField, surname);
        log.info("enter first name" + lastNameField.getText());
    }

    public void enterZipPostalCode(String postalCode) {
        sendTextToElement(zipPostalCode, postalCode);
        log.info("enter zipCode " + zipPostalCode.getText());
    }

    public void clickoncontinueButton() {
        clickOnElement(continueButton);
        log.info("click on continue Button" + continueButton);
    }

    public void clickonFinishButton() {
        clickOnElement(finishButton);
        log.info(("click on finish Button  " + finishButton));
    }
    public String getThankYouText(){
        log.info("Getting thank you text "+thankYouText.toString());
        return getTextFromElement(thankYouText);
    }
}
