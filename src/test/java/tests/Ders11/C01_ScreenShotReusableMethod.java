package tests.Ders11;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class C01_ScreenShotReusableMethod {

    @Test
    public void test() throws IOException {

        Driver.getDriver().get("https://www.hepsiburada.com/");

        ReusableMethods.getScreenshot("image");

        Driver.closeDriver();
    }

    @Test
    public void test2() throws IOException {

        Driver.getDriver().get(ConfigReader.getProperty("amazonURL"));
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.rejectAllCookies.click();
        ReusableMethods.waitFor(1);
        amazonPage.searchBox.sendKeys("Iphone", Keys.ENTER);
        ReusableMethods.waitFor(1);
        ReusableMethods.getScreenshotWebElement("image2",amazonPage.searchResult);

    }
}
