package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;
    @FindBy(id = "username") WebElement fieldEmail;
    @FindBy(id = "password") WebElement fieldPassword;
    @FindBy(name = "login") WebElement btnLogin;

    public LoginPage (WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public void fillEmail(String strEmail){
        fieldEmail.sendKeys(strEmail);
    }

    public void fillPassword(String strPassword){
        fieldPassword.sendKeys(strPassword);
    }

    public void clickOnBtnLogin(){
        btnLogin.click();
    }

}
