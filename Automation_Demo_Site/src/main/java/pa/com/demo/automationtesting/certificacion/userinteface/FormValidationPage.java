package pa.com.demo.automationtesting.certificacion.userinteface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class FormValidationPage extends PageObject {
    public static final Target  FIRST_NAME= Target.the("field for the first name")
            .located(By.xpath("//input[contains(@placeholder,'First Name')]"));
    public static final Target  LAST_NAME= Target.the("field for the last name")
            .located(By.xpath("//input[contains(@placeholder,'Last Name')]"));
    public static final Target ADDRESS = Target.the("field to the adress")
            .located(By.xpath("//textarea[contains(@ng-model,'Adress')]"));
    public static final Target MAIL= Target.the("field to the email")
            .located(By.xpath("//input[@type='email']"));
    public static final Target PHONE= Target.the("field to the phone")
            .located(By.xpath("//input[@type='tel']"));
    public static final Target RADIO_MALE = Target.the("radio button to choose male gender")
            .located(By.xpath("//input[@value='Male']"));
    public static final Target RADIO_FEMALE = Target.the("radio button to choose female gender")
            .located(By.xpath("//input[@value='FeMale']"));
    public static final Target CHECK_BUTTON1= Target.the("checkbox cricket")
            .located(By.id("checkbox1"));
    public static final Target CHECK_BUTTON2= Target.the("checkbox Movies")
            .located(By.id("checkbox2"));
    public static final Target CHECK_BUTTON3= Target.the("checkbox hockey")
            .located(By.id("checkbox3"));
    public static final Target DISPLAY_LENGUAGES = Target.the("display language")
            .located(By.xpath("//div[@class='col-md-4 col-xs-4 col-sm-4']//multi-select//div[@id='msdd']"));
    public static final Target SELECT_LENGUAGES1 = Target.the("select first lenguage")
            .located(By.xpath("//a[contains(text(),'Spanish')]"));
    public static final Target SELECT_LENGUAGES2 = Target.the("select second lenguage")
            .located(By.xpath("//a[contains(text(),'English')]"));
    public static final Target SKILLS= Target.the("select skills")
            .located(By.id("Skills"));
    public static final Target COUNTRY= Target.the("display country")
            .located(By.id("countries"));
    public static final Target SELECT_COUNTRY= Target.the("select country")
            .located(By.id("country"));
    public static final Target YEAR = Target.the("choose year of birth")
            .located(By.id("yearbox"));
    public static final Target MONTHS = Target.the("choose month of birth")
            .located(By.xpath("//select[contains(@placeholder,'Month')]"));
    public static final Target DAY= Target.the("choose day of birth")
            .located(By.id("daybox"));
    public static final Target PASSWORD1 = Target.the("enter your Password")
            .located(By.id("firstpassword"));
    public static final Target PASSWORD2 = Target.the("confirm the Password")
            .located(By.id("secondpassword"));
    public static final Target ENTER_BUTTON= Target.the("click in submit button")
            .located(By.id("submitbtn"));
    public static final Target OUTPUT_TEXT = Target.the("text expected")
            .located(By.xpath("//b[contains(@text,EDIT)]"));
}
