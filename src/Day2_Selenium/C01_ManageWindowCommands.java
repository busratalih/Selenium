package Day2_Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_ManageWindowCommands {
    public static void main(String[] args) throws InterruptedException {

        //        Invoke Chrome Browser
        //        Open URL: https://www.google.com/
        //        Maximize the window.
        //        Print the position and size of the page.
        //        Minimize the page.
        //        Wait 5 seconds in the icon state and maximize the page.
        //        Print the position and dimensions of the page in maximized state.
        //        Make the page fullscreen.
        //        Close the Browser.

        // Driver ın yolunu javaya tanıttık
        System.setProperty("webdriver.chrome.driver","Dependencies\\drivers\\chromedriver.exe");

        //Driver objemizi olusturyoruz
        WebDriver driver= new ChromeDriver();

        //Google sayfamıza gidiyoruz
        driver.get("https://www.google.com/");

        //sayfamızı maximize etmiş olduk
        driver.manage().window().maximize();

        //browserın su anki pozisyonunu verir
        Point point=driver.manage().window().getPosition();

        //pozisyonumuzun koordinat degerlerini degiskenlerimize atadık
        int posX=point.getX();
        int posY=point.getY();

        System.out.println("sayfamızın x koordinatı= " + posX);
        System.out.println("sayfamızın y koordinatı= " + posY);

        //Browser ımızın size ını boyutunu verir
        Dimension dimension=driver.manage().window().getSize();

        //Browserımızın genislik ve yukseklik degerlerini degiskenlerde tutacagız
        int h=driver.manage().window().getSize().getHeight();
        int w=driver.manage().window().getSize().getWidth();

        System.out.println("Browserımızın yuksekligi=" + h);
        System.out.println("Browserımızın genisligi=" + w);

        //browserımızı minimalize ediıyoruz
        driver.manage().window().minimize();

        //5sn bekliyoruz 1s=1000ms
        Thread.sleep(5000);

        //sayfamızı maximize ediyoruz
        driver.manage().window().maximize();


        // Browser imizin suanki pozisyonunu verir.
        Point point1 = driver.manage().window().getPosition();

        // Pozisyonumuzun koordinat degerlerini degiskenlerimize atadik
        int posX1 = point1.getX();
        int posY1 = point1.getY();

        System.out.println("Sayfamizin x koordinati = " + posX1);
        System.out.println("Sayfamizin y koordinati = " + posY1);

        // Browser imizin size ini (boyutunu) verir
        Dimension dimension1 = driver.manage().window().getSize();

        //Browserimizin genislik ve yukseklik degerlerini degiskenlerde tutacagiz
        int h1 = dimension1.getHeight();
        int w1 = dimension1.getWidth();

        System.out.println("Browser imizin yuksekligi = " + h1);
        System.out.println("Browser imizin genisligi = " + w1);



        //browserımızı fulscreen yaptık
        driver.manage().window().fullscreen();

        //driverımızı kapattık
        driver.quit();





    }
}
