package practice.selenium_practice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class main {
    public static void main(String[] args) throws InterruptedException {
        //Creating webdriver
        //Set driver path


        //        System.setProperty("webdriver.gecko.driver", "F:\\Selenium Project\\Web Drivers\\geckodriver.exe");
//        WebDriver Fdriver =new FirefoxDriver();
//        Fdriver.get("https://www.google.com/");
//        System.out.println(Fdriver.getTitle());


        System.setProperty("webdriver.chrome.driver", "F:\\Selenium Project\\Web Drivers\\chromedriver.exe");
        WebDriver Cdriver =new ChromeDriver();
        Cdriver.get("https://www.google.com/");
        System.out.println(Cdriver.getTitle());
        System.out.println(Cdriver.getCurrentUrl());
        //System.out.println(Cdriver.getPageSource());

        Cdriver.get("https://urban-cic-stag.firebaseapp.com/login");
        Cdriver.navigate().back();
        Cdriver.navigate().forward();
        Cdriver.close(); //Closes current browser
        //Cdriver.quit(); //Closes all browser
    }
}
