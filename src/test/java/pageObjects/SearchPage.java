package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {
	
    public SearchPage(WebDriver driver){
        super(driver);
    }
    
    @FindBy(xpath="//p[contains(text(),'There is no product that matches the search criter')]")
    WebElement txtnoproduct;
    
    @FindBy(xpath="//div[@class='product-layout product-grid col-lg-3 col-md-3 col-sm-6 col-xs-12']//button[1]")
    WebElement btnaddtocart;
    
    @FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
    WebElement txtsucessaddtocart;
    
    public boolean isNoProductExit() {
    	
    	try {
        	return(txtnoproduct.isDisplayed());
    	}
    	catch(Exception e) {
    		return false;
    	}
    }
    
    public void clickAddToCart() {
    	btnaddtocart.click();
    }
    
    public boolean isSucessAddToCartMsg() {
        	
        	try {
        		return(txtsucessaddtocart.isDisplayed());
        	}
        	catch(Exception e) {
        		return false;
        	}
    } 
    
}
