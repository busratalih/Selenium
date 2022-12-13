package Day1_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_BrowserCommands {
        /*
         Create main method
         Set Path
         Create chrome driver
         Open google home page: https://www.google.com
                     Get Title on page
         Get Current URL on page
         Close/Quit the browser

         */

    public static void main(String[] args) {

        // Driver objemizi olusturduk
        System.setProperty("webdriver.chrome.driver","Dependencies\\drivers\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        // https://www.google.com sitesini ziyaret ettik
        driver.get("https://www.google.com");

        // sayfa basligi (pageTitle) ve suanda bulunan url (currentUrl) degerini aldik.
        String pageTittle=driver.getTitle();
        String currentUrl=driver.getCurrentUrl();

        //Aldigimiz degerleri yazdirdik
        System.out.println("Page tittle =" + pageTittle);
        System.out.println("Current Url=" +currentUrl);

        // driver objemizi (browser) kapattik
        driver.quit();





    }
}
