package com.katalon.steps;


import com.katalon.pages.CartPage;
import com.katalon.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyStepdefs {
    @Given("^I add four random items to my cart$")
    public void iAddFourRandomItemsToMyCart() {
        new HomePage().clickOnproduct1();
        new HomePage().clickOnproduct2();
        new HomePage().clickOnproduct3();
        new HomePage().clickOnproduct4();
    }

    @When("^I view my cart$")
    public void iViewMyCart() {
        new HomePage().clickOnCart();
    }

    @Then("^I find total four items listed in my cart$")
    public void iFindTotalFourItemsListedInMyCart() {
        int noOfItems=new CartPage().getNumberOfItemsFromCart();
        Assert.assertEquals("Not displyed selected four items",4,noOfItems);
        System.out.println(noOfItems);
    }

    @When("^I search for lowest price item$")
    public void iSearchForLowestPriceItem() {
        new CartPage().selectandRemoveLowPriceProduct();

    }

    @And("^I am able to remove the lowest price item from my cart$")
    public void iAmAbleToRemoveTheLowestPriceItemFromMyCart() {
    }

    @Then("^I am able to verify three items in my cart$")
    public void iAmAbleToVerifyThreeItemsInMyCart() throws InterruptedException {
        Thread.sleep(3000);
        int noOfItems=new CartPage().getNumberOfItemsFromCart();
        Assert.assertEquals("Not displyed selected three items",3,noOfItems);
        System.out.println(noOfItems);
    }
}
