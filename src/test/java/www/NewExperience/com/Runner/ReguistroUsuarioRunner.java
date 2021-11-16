package www.NewExperience.com.Runner;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/NewExperience.feature",
        glue = "www.NewExperience.com.Stepdefinitions",
        tags =  {"@escenario1"},
        snippets = SnippetType.CAMELCASE
)
public class ReguistroUsuarioRunner {
}
