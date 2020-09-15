package org.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources",glue= {"org.stepdefinitions"}
  ,plugin= {"pretty","html:src\\test\\resources\\Repoarts"
		  ,"junit:src\\test\\resources\\Repoarts\\cucumber.xml"
		  ,"json:src\\test\\resources\\Repoarts\\cucumber.json"})
public class TestRunner {
	

}
