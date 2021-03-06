package com.linkedin.cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = { "src/test/java/com/linkedin/cucumber/features" },
        tags =  "@SmokeTest or @RegularTest",
        plugin = { "pretty" })
public class MenuManagementTest {
}
