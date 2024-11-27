package com.example;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/features/example.feature", // Ruta del archivo .feature.
    glue = "com.example", // Paquete donde se encuentran las definiciones de pasos.
    plugin = {"pretty", "html:target/cucumber-reports/cucumber-test-result.html"} // Plugins para formatear y generar reportes.
)
public class RunCucumberTest extends AbstractTestNGCucumberTests {
    // Clase que ejecuta las pruebas Cucumber usando TestNG.
}
