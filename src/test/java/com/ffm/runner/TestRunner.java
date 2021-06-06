package com.ffm.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/java/com/ffm/features/TechServe4U_FFM_01_ffmOTLogin.feature" ,
		glue = {"com.ffm.stepDefinitions"},
		monochrome = true, 
		//strict = true, 
		dryRun = false, 
		plugin = {"pretty","json:target/SimpleReporting/cucumber.json", 
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)

  public class TestRunner extends AbstractTestNGCucumberTests {

  }

