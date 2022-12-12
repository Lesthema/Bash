package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginPage {

    WebDriver driver = null;


    @FindBy(xpath = "//input[@name='username']")
    WebElement Username_xpath;

    @FindBy(xpath = "//input[@name='password']")
    WebElement Password_xpath;

    @FindBy(xpath = "//button[@id='login-button']")
    WebElement LoginButton_xpath;

    @FindBy(xpath = "//span[contains(@class,'vtex-login-2-x-profile truncate t-action--small " +
            "order-1 pl4 tfg-label-class dn db-l')]")
    WebElement LoggedinProfile_xpath;
    @FindBy(xpath = "//button[contains(.,'Log Out')]")
    WebElement LogOut_xpath;


    public LoginPage(WebDriver driver){
        this.driver = driver;

    }

    public LoginPage enterUsername(String username){
        new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(Username_xpath));
        Username_xpath.sendKeys(username);
        return this;
    }

    public  LoginPage enterPassword(String password){
        Password_xpath.sendKeys(password);
        return this;
    }

    public LoginPage loginButton(){
        LoginButton_xpath.click();
        return this;
    }

    public LoginPage verifyProfile(){
        LoggedinProfile_xpath.click();
        return this;

    }
    public LoginPage validateLoggedin(){
        Assert.assertEquals(LogOut_xpath.getText(),"Log Out");
        return this;
    }
    public  LoginPage LogOut(){
        LogOut_xpath.click();
        return this;
    }

}
