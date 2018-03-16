import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * Created by yzosin on 15-Nov-17.
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        format = {"pretty", "html:target/cucumber.html", "junit:target/junit-report.xml"},
        glue = "stepDefinitions",
        tags = {},
        dryRun = false,
        strict = false,
        snippets = SnippetType.CAMELCASE
)
public class SmokeTest {

}
