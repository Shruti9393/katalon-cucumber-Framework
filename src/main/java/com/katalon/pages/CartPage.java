package com.katalon.pages;

import com.katalon.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CartPage extends Utility {

    private static final Logger log = LogManager.getLogger(CartPage.class.getName());

    public CartPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//tr[@class=\"woocommerce-cart-form__cart-item cart_item\"]")// xpath for all 4 items
    List<WebElement> cartlist;

    @CacheLookup
    @FindBy(xpath = "//td[@class=\"product-subtotal\"]/child::*")// xpath for all 4 items price
    List<WebElement> priceList;

    @CacheLookup
    @FindBy(xpath = "//a[@data-product_id='66']")
    WebElement clickonremovecross;

    public int getNumberOfItemsFromCart() {
        return driver.findElements(By.xpath("//tr[@class=\"woocommerce-cart-form__cart-item cart_item\"]")).size();
    }

    public void selectandRemoveLowPriceProduct() {

        DecimalFormat decimalFormat = new DecimalFormat("####0.00");
        ArrayList<Double> amounts = new ArrayList<>();
        for (WebElement ele : priceList) {
            amounts.add(Double.valueOf(ele.getText().replace("$", "")));
        }
        Collections.sort(amounts);
        System.out.println(amounts);


        String lowPriceProduct = driver.findElement(By.xpath("//span[contains(text(),'" + decimalFormat.format(amounts.get(0)) + "')]/parent::td/preceding-sibling::td[@class='product-name']")).getText();
        driver.findElement(By.xpath("//span[contains(text(),'" + decimalFormat.format(amounts.get(0)) + "')]/parent::td/preceding-sibling::td[@class='product-remove']/a")).click();
        System.out.println("Removing the lowest price product :" + lowPriceProduct);
    }


}
