package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.SearchPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC004_SearchTest extends BaseClass {

    @Test(
        dataProvider = "SearchProductData",
        dataProviderClass = DataProviders.class,
        groups = "DataDriven"
    )
    public void searchExistingProductWithoutLogin(String product) {

        logger.info("***** Starting TC004_SearchTestWithoutLogin *****");

        try {
            HomePage hp = new HomePage(driver);
            SearchPage sp = new SearchPage(driver);

            hp.clickSearch(product);
            hp.clickSearchBtn();

            Assert.assertFalse(
                    sp.isNoProductExit(),
                    "No product found in search results."
            );

        } catch (Exception e) {
            Assert.fail(
                    "Test failed due to exception: " + e.getMessage(),
                    e
            );
        }

        logger.info("***** Finished TC004_SearchTestWithoutLogin *****");
    }

    @Test(
        dataProvider = "SearchProductData",
        dataProviderClass = DataProviders.class,
        groups = "DataDriven"
    )
    public void searchExistingProductWithLogin(String product) {

        logger.info("***** Starting TC004_SearchTestWithLogin *****");

        try {
            HomePage hp = new HomePage(driver);
            LoginPage lp = new LoginPage(driver);
            SearchPage sp = new SearchPage(driver);

            hp.clickMyAccount();
            hp.clickLogin();

            lp.setEmail(p.getProperty("email"));
            lp.setPassword(p.getProperty("password"));

            hp.clickSearch(product);
            hp.clickSearchBtn();

            Assert.assertFalse(
                    sp.isNoProductExit(),
                    "No product found in search results."
            );

        } catch (Exception e) {
            Assert.fail(
                    "Test failed due to exception: " + e.getMessage(),
                    e
            );
        }

        logger.info("***** Finished TC004_SearchTestWithLogin *****");
    }
}