package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductPage extends BasePage{


   private By productName = By.xpath("//div//h3[@type=\"comfort\"]");


    public ProductPage(WebDriver driver) {
        super(driver);
    }
    public void selectProduct(int i) throws InterruptedException {
        Thread.sleep(5000);

        getAllProducts().get(i).click();
    }

    private List<WebElement> getAllProducts(){
        return findAll(productName);
    }

    public void switchTab(){
        driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
    }
}
