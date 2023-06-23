package CrisVargas.utilidades;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.PublicKey;
import java.util.List;

public class baseTest { //Aislar los métodos y acciones con selenium

    //Atributos

    private WebDriver  driver;

    private WebDriverWait espera; //Me permite manejar las esperas







    //metodos


    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriverWait getEspera() {
        return espera;
    }

    public void setEspera(WebDriverWait espera) {
        this.espera = espera;
    }

    //GENERAR EL WRAPPER DE LOS COMANDOS DE SELENIUM
    //

    public void clicks(By localizador){
        this.driver.findElement(localizador).click();
    }

    public void clicks(WebElement elemento){
        elemento.click();
    }

    public WebElement buscarElemento(By localizador){
       return this.driver.findElement(localizador);
    }

    public List<WebElement> buscarelementos(By localizador){
        return this.driver.findElements(localizador);
    }

    public WebElement esperarPorVentana(By localizador){
        espera = new WebDriverWait(this.driver,20);
        return espera.until(ExpectedConditions.presenceOfElementLocated(localizador));
    }

    public void esperarXsegundos (int miliseg){

        try {
            Thread.sleep(miliseg);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //public String obtenerTexto(By localizador){
    //    return this.driver.findElements(localizador).getText();
    //}

    public String obtenerTexto(WebElement elemento){
        return elemento.getText();
    }

   // public void agregarTexto(By localizador , String texto){
    //    this.driver.findElements(localizador).sendKeys(texto);
    //}

    public void agregarTexto (WebElement elemento , String texto){
        elemento.sendKeys(texto);
    }

    //public boolean estaDesplegado(By localizador){

    //    try {

    //    }catch (Exception e){
    //        System.out.println("No se localizo el elemento");
    //    }

    //}

    public baseTest(WebDriver driver, WebDriverWait espera) {
        this.driver = driver;
        this.espera = espera;
    }
}
