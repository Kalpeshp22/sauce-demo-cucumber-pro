package com.saucedemo.steps;

import com.saucedemo.pages.CheckoutPage;
import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.ProductPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PurchaseSteps {
    @Given("^I am on saucedemo page$")
    public void iAmOnSaucedemoPage() {
    }

    @When("^I login with credential username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void iLoginWithCredentialUsernameAndPassword(String username, String password)  {
        new LoginPage().enterUserName(username);
        new LoginPage().enterPassword(password);
    }

    @And("^I click on Login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @And("^I filter the products by Price \"([^\"]*)\"$")
    public void iFilterTheProductsByPrice(String msg)  {
        new ProductPage().sortproductbyHighToLow(msg);

    }

    @And("^I select cheapest & costliest products and add to basket$")
    public void iSelectCheapestCostliestProductsAndAddToBasket() {
        new ProductPage().selectTheProductAndAddToCart();
    }

    @And("^I open shopping cart$")
    public void iOpenShoppingCart() {
        new ProductPage().openTheShoppingCart();
    }

    @And("^I go to checkout$")
    public void iGoToCheckout() {
        new CheckoutPage().goToCheckOutAndOpen();
    }
    @And("^I enter details firstname \"([^\"]*)\", lastName \"([^\"]*)\" and zipPostalCode \"([^\"]*)\"$")
    public void iEnterDetailsFirstnameLastNameAndZipPostalCode(String arg0, String arg1, String arg2)  {

    }
    @And("^I click on continue button$")
    public void iClickOnContinueButton() {
        new CheckoutPage().clickoncontinueButton();
    }

    @And("^I click on finish button$")
    public void iClickOnFinishButton() {
        new CheckoutPage().clickonFinishButton();
    }

    @Then("^I should be able to see message \"([^\"]*)\"$")
    public void iShouldBeAbleToSeeMessage(String msg)  {


    }
}
