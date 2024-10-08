package tests.Ders09;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C03_Priority extends TestBaseBeforeMethodAfterMethod {

    @Test(priority = 1)
    public void testBeforeMethod() {
        driver.get("https://www.amazon.com.tr");
    }

    @Test(priority = 2)
    public void testAfterMethod() {
        driver.get("https://www.bestbuy.com");
    }

    @Test(priority = 3)
    public void testBeforeAfterMethod() {
        driver.get("https://www.facebook.com");
    }
}
