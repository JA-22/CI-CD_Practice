package com.example;

import io.cucumber.java.en.Given;

/*public class StepDefinitions {

    @Given("I open the Google homepage")
    public void iOpenTheGoogleHomepage() {
        Base.getDriver().get("https://www.google.com");
    }
}
    */

import org.openqa.selenium.WebDriver;

public class StepDefinitions {
    private WebDriver driver;
    private String environment;
    private String testSuite;

    public StepDefinitions() {
        this.environment = System.getProperty("env", "QA");
        this.testSuite = System.getProperty("testSuite", "allTests");
        System.out.println("Running tests in environment: " + environment);
        System.out.println("Test suite selected: " + testSuite);
        this.driver = Base.getDriver();
    }

    @Given("I open the Google homepage")
    public void iOpenTheGoogleHomepage() {
        driver.get("https://www.google.com");
    }
}

