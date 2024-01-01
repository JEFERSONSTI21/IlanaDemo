package org.ilana.my.demo.runners;



import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty", "json:target/cucumber-json-report.json"},
        features = "src/test/resources/features",
        tags = "@demo",
        glue = "org/ilana/my/demo/stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class Runner {


}
