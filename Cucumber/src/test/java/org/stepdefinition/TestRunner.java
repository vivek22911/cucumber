package org.stepdefinition;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.jvm.report.JVMReport;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources"
,glue="org.stepdefinition"
,monochrome=true,
dryRun=false,
strict=false
,snippets=SnippetType.CAMELCASE,
plugin= {"html:C:\\Users\\VIVEK\\eclipse-workspace\\Cucumber\\target",
		"json:C:\\Users\\VIVEK\\eclipse-workspace\\Cucumber\\jsonReport\\jsonrep.json",
		"junit:C:\\Users\\VIVEK\\eclipse-workspace\\Cucumber\\junitReport\\junitrep.xml",
		"rerun:C:\\Users\\VIVEK\\eclipse-workspace\\Cucumber\\Rerun\\failed.txt"}
)
public class TestRunner {
@AfterClass
public static void report() {
	JVMReport.generateJVMReport("C:\\Users\\VIVEK\\eclipse-workspace\\Cucumber\\jsonReport\\jsonrep.json");
}
}
