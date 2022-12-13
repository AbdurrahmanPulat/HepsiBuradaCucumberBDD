package stepdefinitions;

import com.pages.HomePage;
import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.*;

public class loginPageSteps {
	
	private static String title;
	
	private HomePage homePage = new HomePage(DriverFactory.getDriver());

	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());



	@Given("user is on Home Page")
	public void user_is_on_home_page(){
		
		DriverFactory.getDriver().get("https://www.hepsiburada.com");
		homePage.acceptCookies();
	    
	}

	@Given("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
		homePage.clickLoginPageActions();

		homePage.clickLoginPage();
	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
		
		title= homePage.getLoginPageTitle();
		System.out.println(" Page title is:"+ title);
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitleName) {
		
		Assert.assertTrue(title.contains(expectedTitleName));
	}

	@Then("forgot your password link should be displayed")
	public void forgot_your_password_link_should_be_displayed() throws InterruptedException {
		
		Assert.assertTrue(loginPage.ishelpinkExist());
	       
	}

	

}
