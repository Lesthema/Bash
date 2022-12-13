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

    @FindBy(xpath = "(//span[contains(.,'Hello, 10-4d750c253d9d48e5bc493f2de2853d8e@customer.bash.com')])[2]")
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

    public LoginPage loginButton() throws InterruptedException {
        LoginButton_xpath.click();
        Thread.sleep(9000);
        return this;

    }

    public LoginPage verifyProfile(){
        WebElement until = new WebDriverWait(driver, 40).until(ExpectedConditions.visibilityOf
                (LoggedinProfile_xpath));
        LoggedinProfile_xpath.click();
        return this;

    }
      public  LoginPage LogOut(){
        LogOut_xpath.click();
        return this;
    }

}
