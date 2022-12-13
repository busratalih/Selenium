package Day2_Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_ManageWindowCommands {
    public static void main(String[] args) throws InterruptedException {

        // Go to the Amazon URL : https://www.amazon.com/
        // Print the position and size of the page.
        // Adjust the position and size of the page as desired.
        // Test that the page is in the position and size you want.
        // Close the page.

        //  Driver imizin yolunu javaya tanittik.
        System.setProperty("webdriver.chrome.driver","Dependencies\\drivers\\chromedriver.exe");

        //Driver objemizi olusturuyoruz
        WebDriver driver = new ChromeDriver();

        // amazon sitesini ziyaret ettik
        driver.get("https://www.amazon.com/");


        // browser posizyon ve boyutunu yazdirdik
        System.out.println("Browser imizin pozisyonu = " + driver.manage().window().getPosition());
        System.out.println("Browser imizin boyutu = " + driver.manage().window().getSize());


        //browser imizin pozisyonunu (190, 70) olarak set ettik.
        driver.manage().window().setPosition(new Point(190,70));

        //browser imizin boyutunu (800, 1000) set ettik.
        driver.manage().window().setSize(new Dimension(800,1000));

        //browser imizin boyutunu dogruluyoruz

        int height = driver.manage().window().getSize().getHeight();
        int width = driver.manage().window().getSize().getWidth();


        System.out.println("Browser in boyutu test ediliyor....");

        if (width == 800 && height == 1000){
            System.out.println("Boyut testi PASSED");
        }else {
            System.out.println("Boyut testi FAILED");
        }

        //browser imizin pozisyonunu dogruluyoruz

        int X = driver.manage().window().getPosition().getX();
        int Y = driver.manage().window().getPosition().getY();

        System.out.println("Browser in pozisyonu test ediliyor....");

        if (X == 190 && Y == 70){
            System.out.println("Pozisyon testi PASSED");
        }else {
            System.out.println("Pozisyon testi FAILED");
        }


        // driver imizi kapatiyoruz
        driver.quit();












    }
}
