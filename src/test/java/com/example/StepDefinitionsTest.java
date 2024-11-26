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

        // Verificar que la URL base no esté vacía o mal formada
        if (baseUrl == null || baseUrl.isEmpty()) {
            throw new IllegalArgumentException("La URL base no puede estar vacía");
        }
    }

    @Test
    @Given("I open the Google homepage")
    public void iOpenTheGoogleHomepage() {
        // Uso de la URL base
        Base.getDriver().get(baseUrl);
    }

    @AfterClass
    public void tearDown() {
        // Cerrar el WebDriver
        Base.quitDriver();
    }
}
