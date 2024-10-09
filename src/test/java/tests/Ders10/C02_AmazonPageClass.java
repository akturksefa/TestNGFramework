package tests.Ders10;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_AmazonPageClass {

    AmazonPage amazonPage = new AmazonPage();

    @Test
    public void test() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("amazonURL"));
        Thread.sleep(1000);
        amazonPage.rejectAllCookies.click();
        Thread.sleep(1000);
        amazonPage.searchBox.sendKeys("Selenium", Keys.ENTER);
        Thread.sleep(1000);
        String actualResult = amazonPage.searchResult.getText();
        Assert.assertTrue(actualResult.contains("Selenium"));
        Driver.closeDriver();
    }
}
