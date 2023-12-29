package login;

import base.BaseTests;
import io.qameta.allure.Allure;
import jdk.jfr.Description;
import org.testng.annotations.Test;
import testAutomationui.Pages.LoginPage;
import testAutomationui.Pages.SecureAreaPage;

import static org.testng.Assert.*;

public class LoginTests extends BaseTests {
    @Test(priority = 0, description = "Login Test Validation", testName = "Login Validation")
    public void testSuccessfullLogin() {
        LoginPage loginPage = homePage.clickFormAuthenticationLink();
        loginPage.setUsernameField("tomsmith");
        loginPage.setPasswordField("SuperSecretPassword!");
        SecureAreaPage secureAreaPage= loginPage.clickLoginButton();
        secureAreaPage.getAlertText();
        assertTrue(secureAreaPage.getAlertText()
                        .contains("You logged into a secure area!"),
                "Alert is incorrect!");
        Allure.step("Login Successfully");
    }
}
