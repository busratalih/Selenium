package Day2_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_FacebookUrlTest {
    public static void main(String[] args) {


        // Invoke Chrome Driver
        // Navigate to Facebook homepage URL: https://www.facebook.com/
        // Verify expected equals actual URL.
        // Verify expected contains Facebook Word.

        // Driver ın yolunu javaya tanıttık
        System.setProperty("webdriver.chrome.driver","Dependencies\\drivers\\chromedriver.exe");

        //Driver objemizi olusturyoruz
        WebDriver driver= new ChromeDriver();

        driver.get("https://www.facebook.com/");

        //url testimizi yaptık
        System.out.println("url testi yapılıyor");

        String expectedUrl="https://www.facebook.com/";
        String actualUrl=driver.getCurrentUrl();

        if (expectedUrl.equals(actualUrl)){
            System.out.println("url testi PASSED");
        }else {
            System.out.println("url test FAILED");
        }

        //TİTTLE TESTİNİ yaptık

        String actualtittle=driver.getTitle();

        if (actualtittle.contains("Facebook")){
            System.out.println("tittle testi PASSED");
        }else {
            System.out.println("tittle testi FAILED");
        }






    }
}
