package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class HomePage {

    WebDriver driver;
    @FindBy(className = "icon-user") WebElement getModalLogin;
    @FindBy(css = ".hide-for-medium > span") WebElement btnAllProduct;


    public HomePage (WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public void clickModalLogin(){
        getModalLogin.click();
    }

    public void clickBtnAllProduct(){
        btnAllProduct.click();
    }
}
