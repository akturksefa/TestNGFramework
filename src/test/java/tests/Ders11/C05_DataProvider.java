package tests.Ders11;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C05_DataProvider {

    @DataProvider
    public static Object[][] loginTest() {
        return new Object[][]{{"user@gmail.com","12345"},{"user1@gmail.com","12345"},{"user2@gmail.com","12345"}};
    }

    @Test(dataProvider = "loginTest")
    public void dataProvider(String email, String password) {

        BrcPage brcPage = new BrcPage();
        Driver.getDriver().get(ConfigReader.getProperty("brcURL"));
        brcPage.loginButton.click();
        brcPage.email.sendKeys(email);
        brcPage.password.sendKeys(password);
        brcPage.login.click();
        Assert.assertTrue(brcPage.login.isDisplayed());

    }
}
