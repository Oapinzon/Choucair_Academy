package pa.com.demo.automationtesting.certificacion.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import pa.com.demo.automationtesting.certificacion.model.DemoAutomationData;
import pa.com.demo.automationtesting.certificacion.questions.Answer;
import pa.com.demo.automationtesting.certificacion.tasks.FormValidation;
import pa.com.demo.automationtesting.certificacion.tasks.OpenUp;
import java.util.List;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class DemoAutomationStepDefinitions {

    @Managed(driver="chrome") //añadiento al actor
    private WebDriver MyBrowser;
    private Actor Omar = Actor.named("Omar");

    @Before
    public void setStage() {
        Omar.can(BrowseTheWeb.with(MyBrowser));
    }


    @Given("^than jean wants to access the Web Demo Site$")
    public void thanJeanWantsToAccessTheWebDemoSite() {
        Omar.wasAbleTo(OpenUp.thePage());
    }

    @When("^He makes the register on the page$")
    public void heMakesTheRegisterOnThePage(List<DemoAutomationData> Data) {
        Omar.attemptsTo(FormValidation.fillData(Data));
    }

    @Then("^verifies that the screen in loaded with text Double Click on Edit Icon to \"([^\"]*)\" the Table row$")
    public void verifiesThatTheScreenInLoadedWithTextDoubleClickOnEditIconToTheTableRow(String question) {
        Omar.should(seeThat(Answer.toThe(question)));
    }
}
