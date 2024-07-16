package br.com.project.awj.execute.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
		glue = "br.com.project.awj.execute",

		tags = { 
					""
				},
		
		plugin = { "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"json:src/test/resources/evidencias/json/report.json"},
		monochrome = true,
		snippets = SnippetType.CAMELCASE,
		dryRun = false, 
		strict = false
		)

public class RunnerTest {

}
