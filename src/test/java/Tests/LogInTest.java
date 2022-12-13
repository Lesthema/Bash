package Tests;

import PageObjects.LoginPage;
import Utils.BrowserSetup;
import Utils.TakeScreenShot;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.io.IOException;

@Test
public class LogInTest extends BaseTests {

    public void HomeScreen() throws IOException {
                homePage
                .verifyHomePage();
        TakeScreenShot.takeSnapShot(driver,"HomePage");
        homePage
                .profileIcon();
    }
    @Test(dependsOnMethods = "HomeScreen")
    public void LoginSuccess() throws IOException, InterruptedException {
        loginPage
                .enterUsername(readTestData.username)
                .enterPassword(readTestData.password);
        TakeScreenShot.takeSnapShot(driver,"Log In details");
        loginPage
                .loginButton()
                .verifyProfile();
        TakeScreenShot.takeSnapShot(driver, "Log Out");
        loginPage
                .LogOut();
    }
    @AfterTest
    public void closeBrowser(){BrowserSetup.teardown();}
}
