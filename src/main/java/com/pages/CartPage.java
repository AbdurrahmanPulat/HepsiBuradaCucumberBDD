package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {

    private By goToCartLocator =By.xpath("//button[.='Sepete git']");

    private By  continueStepButton = By.cssSelector("#continue_step_btn");




    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void goToCart() throws InterruptedException {
        click(goToCartLocator);
        Thread.sleep(2000);
    }

    public void confirmsCart() {
        click(continueStepButton);

    }
}
