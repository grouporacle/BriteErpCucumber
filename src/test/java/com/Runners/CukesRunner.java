package com.Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/default-cucumber-reports",
                "json:target/cucumber.json"
        },
        features = "src/test/resource/features",
        glue = "com/cybertek/step_definitions"
        , dryRun = false
        , tags = "@wip"
)
public class CukesRunner {


}
