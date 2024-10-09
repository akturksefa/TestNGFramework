package tests.Ders11;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

public class C02_WindowHandlesReusableMethod {

    @Test
    public void windowHandlesReusableMethod() {

        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
        ReusableMethods.waitFor(2);
        Driver.getDriver().findElement(By.xpath("//*[text()='Click Here']")).click();
        ReusableMethods.switchToWindow("New Window");
        String expectedResult = "New Window";
        String actualResult = Driver.getDriver().getTitle();
        Assert.assertEquals(actualResult, expectedResult);
        ReusableMethods.waitFor(2);
        Driver.quitDriver();
    }
}
