package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import support.Utils;

public class HomePage extends Utils {

    WebDriver driver;

    public HomePage(WebDriver driver) {
    this.driver = driver;

    }
    public void acessarAplicacao(){
        driver.manage().window().maximize();
         driver.get("https://www.qazando.com.br/curso.html");
        esperarElementoEstarPresente(By.id("btn-ver-cursos"),10);
        Assert.assertEquals(true, driver.findElement(By.id("btn-ver-cursos")).isDisplayed());
    }
    public void scrollDown() throws InterruptedException {
        //SCROLL NA TELA
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollTo(0, 20000)");
        Thread.sleep(2000);
    }
    public void preencherEmail() throws InterruptedException {
        driver.findElement(By.id("email")).sendKeys("teste@test.com");
    }
    public void clickGanharDesconto() throws InterruptedException {
        driver.findElement(By.id("email")).sendKeys(Keys.ENTER);
    }
    public void verificarCupomDesconto() throws InterruptedException{
        String texto_cupom = driver.findElement(By.cssSelector("#cupom > h2 > span")).getText();
        Assert.assertEquals("QAZANDO15OFF", texto_cupom);
    }
}
