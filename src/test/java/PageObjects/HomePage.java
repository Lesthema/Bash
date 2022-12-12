package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage {
    WebDriver driver;

    @FindBy(xpath = "//h3[contains(.,'Welcome to Bash')]")
    WebElement welcomeLabel_xpath;

    @FindBy(xpath = "(//span[contains(.,'Profile')])[2]")
    WebElement profileIcon_xpath;

    public HomePage(WebDriver driver){
        this.driver=driver;
    }
    public void verifyHomePage(){
        Assert.assertEquals(welcomeLabel_xpath.getText(),"Welcome to Bash");
    }
    public void profileIcon(){
        profileIcon_xpath.click();
    }
}
