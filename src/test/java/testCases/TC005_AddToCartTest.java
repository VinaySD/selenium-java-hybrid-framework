package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.SearchPage;
import pageObjects.ShoppingCartPage;
import testBase.BaseClass;

public class TC005_AddToCartTest extends BaseClass {

    @Test
    public void verify_productAddtoCartSuccessMsg() {

        logger.info("***** Starting TC005_AddToCart *****");

        try {

            HomePage hp = new HomePage(driver);
            LoginPage lp = new LoginPage(driver);
            SearchPage sp = new SearchPage(driver);

            hp.clickMyAccount();
            hp.clickLogin();

            lp.setEmail(p.getProperty("email"));
            lp.setPassword(p.getProperty("password"));

            hp.clickSearch(p.getProperty("product"));
            hp.clickSearchBtn();

            boolean noProduct = sp.isNoProductExit();
            Assert.assertFalse(noProduct, "Product does not exist");

            sp.clickAddToCart();

            Assert.assertTrue(
                    sp.isSucessAddToCartMsg(),
                    "Product was not added to cart"
            );

        } catch (Exception e) {
            Assert.fail("Test failed: " + e.getMessage(), e);
        }

        logger.info("***** Finished TC005_AddToCart *****");
    }


    @Test
    public void verify_productDisplayOnCart() {

        logger.info("***** Starting TC005_AddToCart *****");

        try {

            HomePage hp = new HomePage(driver);
            LoginPage lp = new LoginPage(driver);
            SearchPage sp = new SearchPage(driver);
            ShoppingCartPage sc = new ShoppingCartPage(driver);

            hp.clickMyAccount();
            hp.clickLogin();

            lp.setEmail(p.getProperty("email"));
            lp.setPassword(p.getProperty("password"));

            hp.clickSearch(p.getProperty("product"));
            hp.clickSearchBtn();

            boolean noProduct = sp.isNoProductExit();
            Assert.assertFalse(noProduct, "Product does not exist");

            sp.clickAddToCart();

            Assert.assertTrue(
                    sp.isSucessAddToCartMsg(),
                    "Product was not added to cart"
            );

            hp.clickShoppingCart();

            Assert.assertTrue(
                    sc.isProductPlaced(),
                    "Product was not displayed in shopping cart"
            );

        } catch (Exception e) {
            Assert.fail("Test failed: " + e.getMessage(), e);
        }

        logger.info("***** Finished TC005_AddToCart *****");
    }
}