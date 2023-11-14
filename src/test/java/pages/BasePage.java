package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BasePage {
    public static WebDriver driver;

    public void open_chrome_browser(){

        String url="https://abc9262.sg-host.com/";
        System.setProperty(
                "webdriver.chrome.driver",
                "C:\\workspace\\MyDemoProject\\chromedriver_119.exe");
        // Instantiate a ChromeDriver class.driver = new ChromeDriver();
        driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
    }


}
