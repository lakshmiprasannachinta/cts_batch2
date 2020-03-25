package com.cts.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@CucumberOptions(features = { "src/main/resources/FEATURES/project.feature" },
glue = {
		"com/cts/Stepdefinition" },dryRun =false,plugin = {"html:reports/"})
@RunWith(Cucumber.class)

public class RunnerTest{

}
