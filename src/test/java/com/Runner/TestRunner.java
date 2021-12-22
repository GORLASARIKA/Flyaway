package com.Runner;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/test/resources/Features",
glue = "stepdefininations",
tags = "@tag1" )
public class TestRunner extends AbstractTestNGCucumberTests {
	
  @Override
  @DataProvider(parallel = false)
  public Object[][] scenarios() {
	  return super.scenarios();
  }
}
