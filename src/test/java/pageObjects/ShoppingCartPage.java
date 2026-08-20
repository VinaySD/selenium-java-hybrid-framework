package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage{

	public ShoppingCartPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//div[@class='table-responsive']")
	WebElement productCartList;
	
	public boolean isProductPlaced() {
		try {
			return(productCartList.isDisplayed());
		}
		catch(Exception e) {
			return false;
		}
	}
}
