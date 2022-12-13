package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage extends BasePage {
	
	private WebDriver driver;	
	
	//By locators
	
	private By loginPage = By.cssSelector("[title='Giriş Yap']");
	
	private By loginPageBtn = By.id("login");

	private By searchBox = By.cssSelector("[placeholder='Ürün, kategori veya marka ara']");


	private By searchBoxButton= By.cssSelector(".SearchBoxOld-cHxjyU99nxdIaAbGyX7F");

	private By acceptCookiesLocator = By.xpath("//button[@id=\"onetrust-accept-btn-handler\"]");
	
	//Constructor of the page class
	
	public HomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	//Page actions: faatures (behavior) of the page the form of the methods
	
	public void clickLoginPageActions() throws InterruptedException {
		click(loginPage);
		Thread.sleep(1000);
	}
	
	public void clickLoginPage(){
		click(loginPageBtn);
	}

	public void search(String word){
		type(searchBox,word);
	}

	
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	



	public void clickSearchButton() {
		click(searchBoxButton);
	}

	public HomePage acceptCookies(){
		if (isDisplayed(acceptCookiesLocator)){
			click(acceptCookiesLocator );
		}

		return this;
	}
}
