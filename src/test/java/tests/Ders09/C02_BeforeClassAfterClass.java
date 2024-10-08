package tests.Ders09;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeClassAfterClass;

public class C02_BeforeClassAfterClass extends TestBaseBeforeClassAfterClass {

    @Test
    public void testBeforeMethod() {
        driver.get("https://www.amazon.com.tr");
    }

    @Test
    public void testAfterMethod() {
        driver.get("https://www.bestbuy.com");
    }

    @Test
    public void testBeforeAfterMethod() {
        driver.get("https://www.facebook.com");
    }
}
