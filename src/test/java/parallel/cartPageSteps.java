package parallel;

import com.pages.CartPage;
import com.pages.HomePage;
import com.pages.ProductDetailPage;
import com.pages.ProductPage;
import com.qa.factory.DriverFactory;
import io.cucumber.java.en.*;


public class cartPageSteps {
    private HomePage homePage = new HomePage(DriverFactory.getDriver());

    private  ProductPage productPage = new ProductPage(DriverFactory.getDriver());
    private  ProductDetailPage productDetailPage= new ProductDetailPage(DriverFactory.getDriver());

    private CartPage cartPage = new CartPage(DriverFactory.getDriver());

    @Given("user types {string} in the search box")
    public void user_types_in_the_search_box(String word) {
        homePage.search(word);
    }

    @When("user click submit button")
    public void user_click_submit_button() {
        homePage.clickSearchButton();

    }

    @When("user selects product")
    public void user_selects_product() throws InterruptedException {
        productPage.selectProduct(2);
    }
    @When("user switch tab")
    public void user_switch_tabs()  {
        productPage.switchTab();
    }

    @When("user adds product to cart")
    public void user_adds_product_to_cart() throws InterruptedException {
        productDetailPage.addProductToCart();
    }

    @When("user checks the cart")
    public void user_checks_the_cart() {
        productDetailPage.checksCart();

    }

    @Then("user goes to cart")
    public void user_goes_to_cart() throws InterruptedException {
        cartPage.goToCart();

    }

    @Then("user confirms cart")
    public void user_confirms_cart() {
        cartPage.confirmsCart();

    }



}
