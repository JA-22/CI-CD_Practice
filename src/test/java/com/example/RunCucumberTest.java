package com.example;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//prueba
@CucumberOptions(
    features = "src/test/resources/features/example.feature",
    glue = "com.example",
    plugin = {"pretty", "html:target/cucumber-reports/cucumber-test-result.html"}
    )
public class RunCucumberTest extends AbstractTestNGCucumberTests { 
}
