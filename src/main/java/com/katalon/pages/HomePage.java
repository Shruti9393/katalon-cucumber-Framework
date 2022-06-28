package com.katalon.pages;


import com.katalon.utility.Utility;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Shruti
 */
public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='site-viewport']/div[@id='page']/div[@id='content']/div[@id='primary']/main[@id='main']/div[2]/ul[1]/li[1]/div[1]/a[2]")
    WebElement flyingninja;

    @CacheLookup
    @FindBy(xpath = "//a[@data-product_id='22']")
    WebElement premiumquality;


    @CacheLookup
    @FindBy(xpath = "//a[@data-product_id='66']")
    WebElement patientNinja;

    @CacheLookup
    @FindBy(xpath = "//a[@data-product_id='57']")
    WebElement shipyourIdea;


    @CacheLookup
    @FindBy(xpath = "//li[@class='page_item page-item-8']")
    WebElement cartClick;


    public void clickOnproduct1() {
        clickOnElement(flyingninja);
        log.info("Clicking on flyingninja : " + flyingninja.toString());
    }

    public void clickOnproduct2() {
        clickOnElement(premiumquality);
        log.info("Clicking on premium quality : " + premiumquality.toString());
    }

    public void clickOnproduct3() {
        clickOnElement(patientNinja);
        log.info("Clicking on patient Ninja : " + patientNinja.toString());
    }

    public void clickOnproduct4() {
        clickOnElement(shipyourIdea);
        log.info("Clicking on shipyourIdea: " + shipyourIdea.toString());
    }

    public void clickOnCart() {
        clickOnElement(cartClick);
        log.info("Clicking on cart : " + cartClick.toString());
    }


}
