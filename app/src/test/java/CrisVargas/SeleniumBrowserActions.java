package CrisVargas;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumBrowserActions {

    private String titulo;

    private WebDriver driver;


    @BeforeEach
    public void preparacionTest(){
        //preparar el webdriver
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver(); //instanciar un objeto WebDriver (browser)

        //administrar los tiempos de respuetas de la carga de la pagina

        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

    }



    @Test
    void browserActions(){


        //cargar una pagina
        driver.get("https://www.google.com");

        titulo = driver.getTitle();
        System.out.println("El titulo del sitio es: " + titulo);

        //maximizar browser
        driver.manage().window().maximize();

        //redireccionar a otra pagina
        driver.navigate().to("https://www.selenium.dev");

        titulo = driver.getTitle();
        System.out.println("El titulo del sitio es: " + titulo);


        //refresh
        driver.navigate().refresh();

        //volver a google
        driver.navigate().back();

        driver.close();
    }



