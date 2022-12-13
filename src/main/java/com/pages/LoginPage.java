package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {


    private By helpButton = By.xpath("//div//span[@class=\"_17OD2T5uhxYRT6atZy_yA7 hpa5gnmuOMPuH0E31USHp false\"]");


   

    public LoginPage (WebDriver driver){
        super(driver);
    }

    public boolean ishelpinkExist() throws InterruptedException {
        Thread.sleep(3000);
        return isDisplayed(helpButton);
    }
}
