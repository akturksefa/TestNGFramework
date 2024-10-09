package tests.Ders11;

import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C04_DataProvider {


    @DataProvider
    public static Object[][] aranacakKelimeler() {
        return new Object[][]{{"java"},{"samsung"},{"iphone"},{"selenium"}};
    }

    @Test(dataProvider = "aranacakKelimeler")
    public void test(String kelimeler) {

        AmazonPage amazonPage = new AmazonPage();
        Driver.getDriver().get(ConfigReader.getProperty("amazonURL"));
        //amazonPage.rejectAllCookies.click();
        ReusableMethods.waitFor(1);
        amazonPage.searchBox.sendKeys(kelimeler, Keys.ENTER);
        Driver.closeDriver();

    }
}
