package CrisVargas.ejemplos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;
import java.util.concurrent.TimeUnit;

public class  Test001 {

    private WebDriver driver;
    private JavascriptExecutor js = (JavascriptExecutor) driver;


    @BeforeAll
    static void preparacionClas(){
        WebDriverManager.chromedriver().setup();
    }
    @BeforeEach
    void preTest(){
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;


        driver.get("https://www.mercadolibre.com.ar/"); //levantar sitio Spotify
        driver.manage().window().maximize(); //Maximizar la pantalla
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }




    @Test
    void abrirNavegador() throws InterruptedException{

        //Click en el codigo postal, selecciona la opcion "Mas tarde"
        By locatorBtnCodigoPostal = By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div[2]/button[2]/span");
        WebElement btnCodigoPostal = driver.findElement(locatorBtnCodigoPostal);
        btnCodigoPostal.click();

        //Aceptar las cookies
        driver.findElement(By.xpath("//button[contains(text(),'Aceptar cookies')]")).click();


        //Escribe en el buscador "x producto"
        driver.findElement(By.xpath("//input[@id='cb1-edit']")).sendKeys("monitores");

        Thread.sleep(2000); //Espera 2s

        //Hace click en buscar
        WebElement buscarBtn = driver.findElement(By.cssSelector("header.nav-header.nav-header-plus.ui-navigation-v2:nth-child(1) div.nav-bounds.nav-bounds-with-cart.nav-bounds-with-cp div.nav-area.nav-top-area.nav-center-area:nth-child(2) form.nav-search > button.nav-search-btn"));
        buscarBtn.click();

        //Hacer click en la opcion "Samsung"

        WebElement marcasBtn = driver.findElement(By.xpath("//body/main[@id='root-app']/div[1]/div[2]/section[1]/div[8]/section[1]/div[2]/div[1]/div[1]/div[1]/a[1]/div[1]/div[1]/img[1]"));
        Thread.sleep(1000);
        marcasBtn.click();

        //Elige el producto
        WebElement elementProd = driver.findElement(By.cssSelector("div.ui-search.shops__ui-main div.ui-search-main.ui-search-main--only-products.ui-search-main--with-topkeywords.shops__search-main:nth-child(4) section.ui-search-results.ui-search-results--without-disclaimer.shops__search-results ol.ui-search-layout.ui-search-layout--grid:nth-child(8) li.ui-search-layout__item:nth-child(1) div.ui-search-result__wrapper.shops__result-wrapper div.andes-card.andes-card--flat.andes-card--default.ui-search-result.shops__cardStyles.ui-search-result--core.andes-card--padding-default.andes-card--animated div.ui-search-result__image.shops__picturesStyles section.andes-carousel-snapped__container.andes-carousel-snapped__container--full.andes-carousel-snapped__container--with-controls.andes-carousel-snapped__container--arrows-visible div.andes-carousel-snapped__controls-wrapper div.andes-carousel-snapped.ui-search-result__card.andes-carousel-snapped--scroll-hidden:nth-child(2) div.andes-carousel-snapped__wrapper div.andes-carousel-snapped__slide.andes-carousel-snapped__slide--active:nth-child(1) a.ui-search-link > img.ui-search-result-image__element.shops__image-element"));
        elementProd.click();

        Thread.sleep(1000);

        js.executeScript("window.scrollBy(0,300)"); //Scroll

        Thread.sleep(1000);

        WebElement btnComprar = driver.findElement(By.xpath("//span[contains(text(),'Comprar ahora')]"));
        btnComprar.click();

        //WebElement comprarBtn = driver.findElement(By.cssSelector("div.ui-pdp:nth-child(2) div.ui-pdp-container.ui-pdp-container--pdp:nth-child(3) div.ui-pdp-container__row.ui-pdp--relative.ui-pdp-with--separator--fluid.pb-40:nth-child(1) div.ui-pdp-container__col.col-1.ui-pdp-container--column-right.mt-16.pr-16:nth-child(2) div.ui-pdp--sticky-wrapper.ui-pdp--sticky-wrapper-right div.ui-pdp-container__row:nth-child(1) form.ui-pdp-buybox div.ui-pdp-actions:nth-child(6) div.ui-pdp-actions__container.ui-pdp-actions__container--one-element button.andes-button.andes-spinner__icon-base.andes-button--loud:nth-child(1) > span.andes-button__content"));
        //comprarBtn.click();



        //Busca el intervalo de rangos de precios y coloca "3000" en la opc minimo
        //WebElement inputPrecio = driver.findElement(By.xpath("//body/main[@id='root-app']/div[1]/div[2]/aside[1]/section[1]/div[10]/ul[1]/li[4]/form[1]/div[1]/div[1]/label[1]/div[1]/input[1]"));
        //inputPrecio.sendKeys("3000");

        //Thread.sleep(3000);

        //WebElement buscarPrecioBtn = driver.findElement(By.xpath("//body/main[@id='root-app']/div[1]/div[2]/aside[1]/section[1]/div[10]/ul[1]/li[4]/form[1]/div[3]"));
        //buscarPrecioBtn.click();


        //WebElement locatorInputCP = driver.findElement(locatorInputCP);
        //locatorInputCP.sendKeys("12345");


    }

    @AfterEach
    void postTests(){

        driver.close();

    }

}
