package pa.com.demo.automationtesting.certificacion.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/demo_automationtesting.feature",
        tags = "@stories",
        glue = "pa.com.demo.automationtesting.certificacion.stepdefinitions",
        snippets = SnippetType.CAMELCASE )

public class RunnerTags {
}