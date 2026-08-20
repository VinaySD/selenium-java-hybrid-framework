package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath="//span[normalize-space()='My Account']")
    WebElement lnkMyaccount;

    @FindBy(xpath = "//a[normalize-space()='Register']")
    WebElement lnkRegister;
    
    @FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Login']")
    WebElement lnklogin;
    
    @FindBy(xpath="//input[@placeholder='Search']") 
    WebElement Search;
    
    @FindBy(xpath="//button[@class='btn btn-default btn-lg']") 
    WebElement btnSearch;
    
    @FindBy(xpath="//span[normalize-space()='Shopping Cart']")
    WebElement btnShoppingCart;
    
    public void clickMyAccount(){
        lnkMyaccount.click();
    }

    public void clickRegister(){
        lnkRegister.click();
    }
    
    public void clickLogin(){
    	lnklogin.click();
    }
    
    public void clickSearch(String product) {
    	Search.clear();
    	Search.sendKeys(product);
 
    }
    
    public void clickShoppingCart() {
    	btnShoppingCart.click();
    }
    
    public void clickSearchBtn() {
    	btnSearch.click();
    }
   
}
