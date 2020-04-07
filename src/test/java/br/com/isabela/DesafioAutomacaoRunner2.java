package br.com.isabela;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/resources/features/DesafioAutomacaoHistoria.feature", 
                 glue = "br.com.isabela.steps", 
                 plugin = {"pretty", "html:target/report-html","json:target/report.json" },
                 monochrome = true, 
                 tags = "~@ignore",
                 snippets = SnippetType.CAMELCASE,
                 dryRun = false, 
                 strict = false
                 )

public class DesafioAutomacaoRunner2 {

}
