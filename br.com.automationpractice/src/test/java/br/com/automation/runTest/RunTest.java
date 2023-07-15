package br.com.automation.runTest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true,
                snippets = CucumberOptions.SnippetType.CAMELCASE,
                plugin = {"pretty", "html:reports/report.html"},
                features = {"./src/test/resources/features"},
                glue = {"br.com.automation.steps", "br.com.automationpractice.configuration"},
                tags = "@opçoes_filtro")
public class RunTest {
}
