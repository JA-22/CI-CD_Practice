package com.example;

import io.cucumber.java.en.Given;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class StepDefinitionsTest {
    private String baseUrl;
    private String environment;

    @BeforeClass
    public void setUp() {
        // Inicializar el WebDriver
        Base.initializeDriver();
        this.baseUrl = System.getProperty("baseUrl", "https://www.google.com");
        this.environment = System.getProperty("env", "QA");
        System.out.println("Running tests in environment: " + environment);
        System.out.println("Base URL is: " + baseUrl);
    }

    @Test
    @Given("I open the Google homepage")
    public void iOpenTheGoogleHomepage() {
        Base.getDriver().get(baseUrl);
    }

    @AfterClass
    public void tearDown() {
        // Cerrar el WebDriver
        Base.quitDriver();
    }
}
