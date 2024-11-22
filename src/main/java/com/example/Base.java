package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {
    protected static WebDriver driver;

    public static void initializeDriver() {
        if (driver == null) {
            ChromeOptions options = new ChromeOptions();
            options.setBinary(System.getenv("CHROME_BIN")); // Usar la ruta del binario de Chrome
            options.addArguments("--headless"); // Ejecuta Chrome en modo headless (sin interfaz gráfica)
            options.addArguments("--no-sandbox"); // Necesario para entornos de CI/CD como GitHub Actions
            options.addArguments("--disable-dev-shm-usage"); // Necesario para entornos de CI/CD como GitHub Actions

            System.setProperty("webdriver.chrome.driver", System.getenv("CHROME_DRIVER")); // Usar la ruta del binario de ChromeDriver
            driver = new ChromeDriver(options); // Crea el `ChromeDriver` con las opciones especificadas
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null; // Evitar problemas de reutilización
        }
    }
}
