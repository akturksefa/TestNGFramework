package tests.Ders10;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_FacebookPageClass {

    FacebookPage facebookPage = new FacebookPage();
    Faker faker = new Faker();
    @Test
    public void test()
    {
        Driver.getDriver().get(ConfigReader.getProperty("facebookURL"));
        facebookPage.email.sendKeys(faker.internet().emailAddress());
        facebookPage.password.sendKeys(faker.internet().password());
        facebookPage.loginButton.click();
        Assert.assertTrue(facebookPage.trueFalse.isDisplayed());


    }
}
