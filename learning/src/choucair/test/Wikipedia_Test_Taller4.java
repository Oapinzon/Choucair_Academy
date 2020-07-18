package choucair.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static junit.framework.Assert.assertEquals;

public class Wikipedia_Test_Taller4 {

    private WebDriver driver;

    @Before
    public void InicializarDriver() {
        String chromePath = System.setProperty("webdriver.chrome.driver", "C:/Users/oapin/Documents/Docs/DEV/windows/java/automation/chromedriver-84.0.4147.30/chromedriver.exe");
        System.getProperty("webdriver.chrome.driver", chromePath);
        driver = new ChromeDriver();
    }

    @Test
    public void test() {
        String palabra = "Colombia";
        driver.get("https://es.wikipedia.org/wiki/Wikipedia:Portada");        WebElement campoSearch = driver.findElement(By.id("searchInput"));
        WebElement botonSearch = driver.findElement(By.id("searchButton"));

        campoSearch.sendKeys(palabra);
        botonSearch.click();
        WebElement titulo = driver.findElement(By.id("firstHeading"));

        assertEquals(palabra,titulo.getText());
    }

    @After
    public void cerrarDriver() {
        driver.close();
    }
}