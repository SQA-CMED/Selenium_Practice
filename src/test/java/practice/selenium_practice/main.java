package practice.selenium_practice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class main {
    public static void main(String[] args) {
        //Creating webdriver
        //Setdriver path
//        System.setProperty("webdriver.chrome.driver", "F:\\Selenium Project\\Web Drivers\\chromedriver.exe");
//        WebDriver Cdriver =new ChromeDriver();
//        Cdriver.get("https://www.google.com/");
//        System.out.println(Cdriver.getTitle());

        System.setProperty("webdriver.gecko.driver", "F:\\Selenium Project\\Web Drivers\\geckodriver.exe");
        WebDriver Fdriver =new FirefoxDriver();
        Fdriver.get("https://www.google.com/");
        System.out.println(Fdriver.getTitle());
    }
}
