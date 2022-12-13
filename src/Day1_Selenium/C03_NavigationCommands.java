package Day1_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_NavigationCommands {

    /*
    Invoke Chrome Browser
    Navigate to URL: https://clarusway.com/
    Navigate to URL: http://amazon.com/
    Come back to the Clarusway using the back command.
    Again go back to the amazon website using forward command
    Refresh the Browser using refresh command.
    Close the Browser.
     */


    public static void main(String[] args) {

        //chrome driver ı uyandırdık
        System.setProperty("webdriver.chrome.driver","Dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        //clarusway sitesine gittik
        driver.navigate().to("https://clarusway.com/");

        //amazon sitesine gittik
        driver.navigate().to("http://amazon.com/");

        //geri tusuyla claruswaya geri donduk
        driver.navigate().back();

        //ileri tusuyla amazon a gerı donduk
        driver.navigate().forward();

        //sayfamızı yeniledik
        driver.navigate().refresh();

        //browserımızı kapattık
        //driver.close();
        driver.quit();









    }
}
