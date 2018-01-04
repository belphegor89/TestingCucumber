import Pages.BasePage;
import Utils.DriverManager;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

/**
 * Created by yzosin on 15-Nov-17.
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = "stepDefinitions",
        tags = "@violity",
        dryRun = false,
        strict = false,
        snippets = SnippetType.CAMELCASE
)
public class SmokeTest {

}
