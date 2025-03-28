package com.eal.runners;

import org.junit.After;
import org.junit.runner.RunWith;
import com.vimalselvam.cucumber.listener.Reporter;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//import cucumber.api.CucumberOptions;
//import oracle.jdbc.driver.OracleDriver;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { 
		"pretty", 
		"html:target/default-cucumber-reports/htmlReport.html",
//		"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:output/reports/SmokeTest.html",
		"json:target/cucumber.json",
		"junit:target/cucumber.xml", 
		"rerun:target/cucumber.txt",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"com.pdl.hooks.StepNameListener"}, // here "com.pdl.hooks" this is package and stepname is insider class

		features = "src/test/resources/features", 
		glue = {"com.pdl.step_definitions","com.pdl.hooks"},

		dryRun=false,

		tags="@Tc_36 or @Tc_37 or @Tc_38 or @Tc_39 or @Tc_40 or @Tc_41 or @Tc_42 or @Tc_43 or @Tc_44 or @Tc_45 or @Tc_46"

		

		


		
//		monochrome=false
)

public class EALRunner {
	
	@After
	public static void teardown() {
		Reporter.setSystemInfo("user", System.getProperty("user.name"));
		Reporter.setSystemInfo("os", "Windows");
		Reporter.setTestRunnerOutput("Sample test runner output message");
	
}
	}
