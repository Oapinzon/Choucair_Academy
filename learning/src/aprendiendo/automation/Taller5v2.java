package aprendiendo.automation;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Taller5v2 {
    private WebDriver driver;

    @Before
    public void InicializarDriver(){
        String chromePath = System.setProperty("webdriver.chrome.driver", "C:/Users/oapin/Documents/Docs/DEV/windows/java/automation/chromedriver-84.0.4147.30/chromedriver.exe");
        System.getProperty("webdriver.chrome.driver", chromePath);
        driver = new ChromeDriver();
    }

    @Test
    public void test() throws InterruptedException {
        driver.get("https://simon.inder.gov.co/registro");
        driver.manage().window().maximize();


        //Tipo de persona
        driver.findElement(By.xpath("//*[@id=\"select2-chosen-15\"]")).click();
        Thread.sleep(1500);

        //Selecciona parsona natural
        driver.findElement(By.id("select2-result-label-29")).click();
        Thread.sleep(1500);

        //Tipo de documento
        driver.findElement(By.xpath("//*[@id=\"select2-chosen-16\"]")).click();
        Thread.sleep(1500);


        //Selecciona tipo de cedula
        driver.findElement(By.xpath("//*[@id=\"select2-result-label-31\"]")).click();
        Thread.sleep(1500);

        //Escribe numero de identificacion
        driver.findElement(By.xpath("//*[@id=\"numeroidentificacion\"]")).sendKeys("8902133");

        //Nombres
        driver.findElement(By.name("formulario_registro[firstname]")).sendKeys("Omar Alberto");

        //Apellidos
        driver.findElement(By.name("formulario_registro[lastname]")).sendKeys("Pinzon Arauz");

        //Sexo
        driver.findElement(By.xpath("//*[@id=\"select2-chosen-17\"]")).click();
        Thread.sleep(1500);

        //Seleciona masculino
        driver.findElement(By.xpath("//*[@id=\"select2-result-label-39\"]")).click();
        Thread.sleep(1500);

        //Introduce fecha de nacimiento
        driver.findElement(By.name("formulario_registro[dateOfBirth]")).sendKeys("05021996");
        Thread.sleep(1500);

        //Introduce clave1
        driver.findElement(By.name("formulario_registro[password][first]")).sendKeys("eArhUagU5XCmL.r");
        Thread.sleep(1500);

        //Introduce clave2
        driver.findElement(By.name("formulario_registro[password][second]")).sendKeys("eArhUagU5XCmL.r");
        Thread.sleep(1500);

        //Municipio
        driver.findElement(By.xpath("//*[@id=\"select2-chosen-19\"]")).click();
        Thread.sleep(1500);

        //Selecciona municipio "ABEJORRRAL"
        driver.findElement(By.xpath("//*[@id=\"select2-results-19\"]/li[1]")).click();
        Thread.sleep(2000);

        //---------------------------N/A----------------------------------
        //Barrio
        //driver.findElement(By.xpath("//*[@id=\"select2-chosen-20\"]")).click();
        //Escribe la direccion
        //driver.findElement(By.xpath("//*[@id=\"s2id_autogen20_search\"]")).sendKeys("Yeison's home");
        //---------------------------N/A----------------------------------


        //Direccion
        driver.findElement(By.xpath("//*[@id=\"s2id_formulario_registro_direccion_format_tipo_via\"]")).click();
        //Cooooooooooooooooooooooooooool

        //Selecciona direccion
        driver.findElement(By.xpath("//div[@class='select2-result-label']")).click();
        Thread.sleep(2000);


        //Escribiendo correo y telefono
        driver.findElement(By.id("correoelectronico")).sendKeys("hola3@hotmail.com");
        driver.findElement(By.id("telefonomovil")).sendKeys("66443377");

        //Dando check en la casilla
        driver.findElement(By.xpath("//*[@id=\"formatoAlto2\"]/div/div[7]/div/ins")).click();

        //Click en boton Guardar
        driver.findElement(By.id("registro_save")).click();
        Thread.sleep(6000);
    }

    @After
    public void cerrarDriver(){
        //driver.close();
    }
}
