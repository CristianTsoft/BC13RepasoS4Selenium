package CrisVargas;


import bc13repasos4selenium.App;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.*;

class Prueba {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
    @Test
    void levantarBrowser() throws InterruptedException{
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://selenium.dev");

        Thread.sleep(5000);

        driver.close();
    }
    @Test
    void browserActions(){
//preparar el webdriver
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver(); //instanciar un objeto WebDriver (browser)

//cargar una pagina
        driver.get("https://www.google.cl");

//maximizar browser
        driver.manage().window().maximize();

//redireccionar a otra pagina
        driver.navigate().to("https://www.selenium.dev");

//refresh
        driver.navigate().refresh();

//volver a google
        driver.navigate().forward();
    }
}