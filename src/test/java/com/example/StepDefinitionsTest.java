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
        this.baseUrl = System.getenv("BASE_URL");  // Usar variable de entorno directamente
        this.environment = System.getenv("ENVIRONMENT");  // Usar variable de entorno directamente
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
        Base.getDriver().get(baseUrl);
    }

    @AfterClass
    public void tearDown() {
        // Cerrar el WebDriver
        Base.quitDriver();
    }
}
