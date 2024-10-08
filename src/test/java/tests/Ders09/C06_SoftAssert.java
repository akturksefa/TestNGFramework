package tests.Ders09;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C06_SoftAssert extends TestBaseBeforeMethodAfterMethod {

    @Test
    public void testSoftAssert() {
        SoftAssert softAssert = new SoftAssert();
        driver.get("https://www.amazon.com.tr");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='sp-cc-rejectall-link']")).click();
        //2-title in Amazon içerdigini test edin
        softAssert.assertTrue(driver.getTitle().contains("Amazon"),"Girdiginiz kelimeyi icermemektedir");
        //3-arama kutusnun erişilebilir oldugunu test edin
        WebElement aramakutusu= driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
        softAssert.assertTrue(aramakutusu.isEnabled(),"aradiginiz web elemente erisilememektedir");
        //4-arama kutusuna Iphone yazıp aratın
        aramakutusu.sendKeys("Iphone"+ Keys.ENTER);
        //5-arama yapıldıgını test edin
        WebElement sonuc=driver.findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']"));
        softAssert.assertTrue(sonuc.isDisplayed(),"arama yapilamadi");
        //6-arama sonucunun Iphone içerdigini test
        softAssert.assertTrue(sonuc.getText().contains("Iphone"),"Iphone icermemektedir");
        softAssert.assertAll();
        System.out.println("Eger sistemde hata varsa bu yazi okunmayacak");
    }
}
