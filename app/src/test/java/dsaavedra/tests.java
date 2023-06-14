package dsaavedra;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class tests {


    @Test
    void levantarBrowser() throws InterruptedException{
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://selenium.dev");

        Thread.sleep(5000);

        driver.close();

    }

    @Test
    void levantarBrowserChrome() throws InterruptedException{
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://selenium.dev");

        Thread.sleep(5000);

        driver.close();

    }
}
