package tests.Ders11;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C03_RaporluTest extends TestBaseRapor {

    @Test
    public void RaporluTest() {

        BrcPage brcPage = new BrcPage();

        extentTest = extentReports.createTest("Login Test","Login Page Verify");
        Driver.getDriver().get(ConfigReader.getProperty("brcURL"));
        extentTest.info("Siteye Giriş Yapildi");
        brcPage.loginButton.click();
        extentTest.info("Login butonuna basildi");
        brcPage.email.sendKeys(ConfigReader.getProperty("brcUser"));
        extentTest.info("Email adresi girildi");
        brcPage.password.sendKeys(ConfigReader.getProperty("brcPass"));
        extentTest.info("Password adresi girildi");
        brcPage.login.click();
        extentTest.info("Login butonuna basildi");
        Assert.assertTrue(brcPage.loginButton.isDisplayed());
        extentTest.pass("Sayfaya basarili bir sekilde giris yapildi.");

    }
}
