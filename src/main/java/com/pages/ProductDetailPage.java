package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage {


    private   By cartButton = By.cssSelector("#addToCart");
    private By check =By.cssSelector(".checkoutui-ProductOnBasketHeader-nOvp_U8bHbLzgKbSUFaz\n");


    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public void addProductToCart() throws InterruptedException {
        click(cartButton);
        Thread.sleep(5000);
    }

    public void checksCart() {

        isDisplayed(check);

    }
}
