package com.example;

import io.cucumber.java.en.Given;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class StepDefinitionsTest {
    private String baseUrl;
    private String environment;

    /**
     * Configuración inicial antes de ejecutar los tests.
     * Inicializa el WebDriver, establece la URL base y verifica su validez.
     */
    @BeforeClass
    public void setUp() {
        Base.initializeDriver(); // Inicializa el WebDriver.
        this.baseUrl = System.getenv("BASE_URL"); // Obtiene la URL base desde variables de entorno.
        this.environment = System.getenv("ENVIRONMENT"); // Obtiene el entorno desde variables de entorno.

        System.out.println("Running tests in environment: " + environment);
        System.out.println("Base URL is: " + baseUrl);

        // Valida que la URL base no esté vacía.
        if (baseUrl == null || baseUrl.isEmpty()) {
            throw new IllegalArgumentException("La URL base no puede estar vacía");
        }
    }

    /**
     * Test que abre la página principal de Google.
     * Este paso se vincula a un escenario de Cucumber.
     */
    @Test
    @Given("I open the Google homepage")
    public void iOpenTheGoogleHomepage() {
        Base.getDriver().get(baseUrl); // Navega a la URL base.
    }

    /**
     * Limpieza después de la ejecución de los tests.
     * Cierra el navegador y libera los recursos del WebDriver.
     */
    @AfterClass
    public void tearDown() {
        Base.quitDriver();
    }
}
