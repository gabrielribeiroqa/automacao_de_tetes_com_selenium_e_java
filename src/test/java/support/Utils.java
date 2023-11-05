package support;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.runnerCucumberTest;

// ESSE MÉTODO VAI ESPERAR ATÉ QUE O ELEMENTO SEJA CLICÁVEL
public class Utils extends runnerCucumberTest {
    public void esperarElementoEstarPresente(By element, int tempo){
        WebDriverWait wait = new WebDriverWait(driver, tempo);
        wait.until(ExpectedConditions.elementToBeClickable(element));

    }
}
