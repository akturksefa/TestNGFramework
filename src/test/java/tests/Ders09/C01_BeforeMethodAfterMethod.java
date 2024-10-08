package tests.Ders09;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeClassAfterClass;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C01_BeforeMethodAfterMethod extends TestBaseBeforeMethodAfterMethod {

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
