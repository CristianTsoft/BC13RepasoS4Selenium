package CrisVargas.page;

import CrisVargas.utilidades.baseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InicioPagina extends baseTest {

    public InicioPagina(WebDriver driver, WebDriverWait espera) {
        super(driver, espera);
    }

    //Centralizar los localizadores

    By locatorRegistrar;


    //acciones del sitio

    public void irAregistrarse(){
        clicks(esperarPorVentana(locatorRegistrar));
    }

}
