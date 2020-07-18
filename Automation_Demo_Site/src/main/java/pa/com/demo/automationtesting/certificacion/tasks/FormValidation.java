package pa.com.demo.automationtesting.certificacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.conditions.Check;
import pa.com.demo.automationtesting.certificacion.model.DemoAutomationData;
import pa.com.demo.automationtesting.certificacion.userinteface.FormValidationPage;
import java.util.List;
import static pa.com.demo.automationtesting.certificacion.userinteface.FormValidationPage.*;

public class FormValidation implements Task {
    private List<DemoAutomationData> Datos;

    public FormValidation(List<DemoAutomationData> datos) {
        this.Datos = datos;
    }

    public static FormValidation fillData(List<DemoAutomationData> Datos) {
        return Tasks.instrumented(FormValidation.class, Datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(Datos.get(0).getFirstName()).into(FormValidationPage.FIRST_NAME),
                Enter.theValue(Datos.get(0).getLastName()).into(FormValidationPage.LAST_NAME),
                Enter.theValue(Datos.get(0).getAddress()).into(FormValidationPage.ADDRESS),
                Enter.theValue(Datos.get(0).getEmail()).into(FormValidationPage.MAIL),
                Enter.theValue(Datos.get(0).getPhone()).into(FormValidationPage.PHONE),
                Check.whether(Datos.get(0).getGender().toString().trim().equals("Male"))
                        .andIfSo(Click.on(FormValidationPage.RADIO_MALE))
                        .otherwise(Click.on(FormValidationPage.RADIO_FEMALE)),
                Check.whether(Datos.get(0).getHobbies1().toString().trim().equals("Cricket"))
                        .andIfSo(Click.on(FormValidationPage.CHECK_BUTTON1)),
                //Check.whether(Datos.get(0).getHobbies2().toString().trim().equals("Movies"))
                  //      .andIfSo(Click.on(FormValidationPage.CHECK_BUTTON2)),
                Check.whether(Datos.get(0).getHobbies3().toString().trim().equals("Hockey"))
                        .andIfSo(Click.on(FormValidationPage.CHECK_BUTTON3)),
                Click.on(DISPLAY_LENGUAGES),
                Check.whether(Datos.get(0).getLanguages1().trim().equals("Spanish"))
                        .andIfSo(Click.on(FormValidationPage.SELECT_LENGUAGES1)),
                Check.whether(Datos.get(0).getLanguages2().trim().equals("English"))
                        .andIfSo(Click.on(FormValidationPage.SELECT_LENGUAGES2)),
                SelectFromOptions.byVisibleText(Datos.get(0).getSkills()).from(FormValidationPage.SKILLS),
                SelectFromOptions.byVisibleText(Datos.get(0).getCountry()).from(FormValidationPage.COUNTRY),
                SelectFromOptions.byVisibleText(Datos.get(0).getSelectCountry()).from(FormValidationPage.SELECT_COUNTRY),
                SelectFromOptions.byVisibleText(Datos.get(0).getYear()).from(FormValidationPage.YEAR),
                SelectFromOptions.byVisibleText(Datos.get(0).getMonth()).from(FormValidationPage.MONTHS),
                SelectFromOptions.byVisibleText(Datos.get(0).getDay()).from(FormValidationPage.DAY),
                Enter.theValue(Datos.get(0).getPassword()).into(FormValidationPage.PASSWORD1),
                Enter.theValue(Datos.get(0).getConfirmPassword()).into(FormValidationPage.PASSWORD2),
                Click.on(FormValidationPage.ENTER_BUTTON));
    }
}
