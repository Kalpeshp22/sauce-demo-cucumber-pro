package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='user-name']")
    WebElement userNameField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='password']")
    WebElement passWordField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='login-button']")
    WebElement loginButton;

    public void enterUserName(String username){
        sendTextToElement(userNameField,username);
        log.info("enter username " + userNameField.getText());
    }
    public void enterPassword(String password){
        sendTextToElement(passWordField,password);
        log.info("enter password " + passWordField.getText());
    }
    public void clickOnLoginButton() {
        clickOnElement(loginButton);
        log.info("click on login button " + loginButton.getText());
    }
    public void loginApplication(String username,String password){
        enterUserName(username);
        enterPassword(password);
    }
}