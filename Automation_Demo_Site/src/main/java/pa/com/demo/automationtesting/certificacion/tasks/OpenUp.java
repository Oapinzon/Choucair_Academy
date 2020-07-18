package pa.com.demo.automationtesting.certificacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import pa.com.demo.automationtesting.certificacion.userinteface.DemoAutomationPage;

public class OpenUp implements Task {
    private DemoAutomationPage demoAutomationPage;
    public static OpenUp thePage() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(demoAutomationPage));
    }
}
