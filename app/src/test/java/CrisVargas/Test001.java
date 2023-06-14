package CrisVargas;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Test001 {

    private String titulo;

    private WebDriver driver;   //Lo necesitamos para WD

    @BeforeEach
    void TestPreparacion(){
        //Preparamos el webdriver

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver(); //Aqui elegimos el navegador (Browse), que deseamos ejecutar

        //Administramo los tiempos de respuestas de cargar de la pagina

        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);   //tiempo que tarda para cargar la pagina principal
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //Tiempo que tarda entre paginas

    }

    @AfterEach
    void TestPosEjec(){


        //driver.close();
    }

    @Test
    void TestPaginaOn(){
        //Elegimos la pagina a ejecutar

        driver.get("https://open.spotify.com/");

        //Para colocar la pantalla completa de la pagina
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies(); //Borrar las cookies

        By locatorBtnIniciarSesion = By.xpath("//*[@id=main]/div/div[2]/div[1]/header/div[5]/button[1]");

        WebElement btnIniciarSesion = driver.findElement(locatorBtnIniciarSesion);
        btnIniciarSesion.click();





        //button[@data-encore-id="buttonTertiary"]

    }


}
