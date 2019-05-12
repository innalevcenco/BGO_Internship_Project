package cucumber_runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        tags = {"@functional",
                "@aciuvaga"},
        plugin = {"pretty",
                "html:target/selenium-reports",
                "json:target/json/output.json"},
//        "testing:target/tn"
//        "pretty:target/pretty"
        glue = {"hooks", "steps"}
        )

public class TestRunner {
}