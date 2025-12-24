package org.tag;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\user\\eclipse-workspace\\DemoTry\\src\\test\\resources\\featurefile\\re.feature",
                 glue = "org.def",
                 snippets = SnippetType.CAMELCASE,
                 dryRun = false
                       )
public class WebTable {

}
