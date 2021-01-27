package com.cybertek.library.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin="html:target/cucumber-report.html",
        features="src/test/resources/features",             // from content root
        glue= "com/cybertek/library/step_definitions",      // from source root
        dryRun = false,
        tags="@AddUser"


)
public class CucumberRunner {
}
