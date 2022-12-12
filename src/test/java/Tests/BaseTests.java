package Tests;

import PageObjects.*;
import Utils.BrowserSetup;
import Utils.ReadTestData;
import Utils.TakeScreenShot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class BaseTests {

    BrowserSetup StartBrowser = new BrowserSetup();

    final WebDriver driver = StartBrowser.startBrowser("chrome", "https://bash.com/");
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

    TakeScreenShot takeSnapshot = new TakeScreenShot();

    ReadTestData readTestData;
    {
        try {
            readTestData = new ReadTestData();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}



