package tests.Ders10;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AloTechPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C05_SmokeNegatifTest {


    Actions actions = new Actions(Driver.getDriver());
    AloTechPage alotech = new AloTechPage();
    @Test
    public void test() {

        Driver.getDriver().get(ConfigReader.getProperty("aloTechURL"));
        alotech.email.sendKeys(ConfigReader.getProperty("wrongEmail"));
        alotech.password.sendKeys(ConfigReader.getProperty("password"));
        actions.doubleClick(alotech.submitButton).perform();
        Assert.assertTrue(alotech.verify.isDisplayed());


    }

    @Test
    public void test2() {

        Driver.getDriver().get(ConfigReader.getProperty("aloTechURL"));
        alotech.email.sendKeys(ConfigReader.getProperty("email"));
        alotech.password.sendKeys(ConfigReader.getProperty("wrongPassword"));
        actions.doubleClick(alotech.submitButton).perform();
        Assert.assertTrue(alotech.verify.isDisplayed());


    }

    @Test
    public void test3() {

        Driver.getDriver().get(ConfigReader.getProperty("aloTechURL"));
        alotech.email.sendKeys(ConfigReader.getProperty("wrongEmail"));
        alotech.password.sendKeys(ConfigReader.getProperty("wrongPassword"));
        actions.doubleClick(alotech.submitButton).perform();
        Assert.assertTrue(alotech.verify.isDisplayed());


    }

}
