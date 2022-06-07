package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

    WebDriver driver;

    @FindBy(xpath = "//input[@type=\\\"number\\\" and @class=\\\"input-text qty text\\\"]") WebElement qtyProduct;
    @FindBy(xpath = "//button[text()='Add to cart']") WebElement btnAddToCart;
    @FindBy(className = "icon-shopping-basket" ) WebElement btnShoppingCart;

    public ProductPage (WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public void fillQtyProduct(String dataQty){
        qtyProduct.sendKeys(dataQty);
    }

    public void clickOnBtnAddToCart(){
        btnAddToCart.click();
    }

    public void clickOnBtnShoppingCart(){
        btnShoppingCart.click();
    }
}
