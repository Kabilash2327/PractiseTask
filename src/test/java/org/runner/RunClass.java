package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(glue="org.stepsfile", features="src\\test\\resources", monochrome = true, dryRun = false, stepNotifications = true, tags= "@positive")
public class RunClass {

	
	
	
}
