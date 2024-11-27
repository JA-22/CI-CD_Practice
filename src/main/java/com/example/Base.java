package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
    // Instancia estática para mantener un único WebDriver.
    private static WebDriver driver;

    /**
     * Inicializa el WebDriver con opciones predeterminadas si no está configurado.
     */
    public static void initializeDriver() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup(); // Configuración automática de ChromeDriver.
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless"); // Ejecuta en modo sin interfaz gráfica.
            options.addArguments("--no-sandbox", "--disable-dev-shm-usage");
            driver = new ChromeDriver(options);
        }
    }

    /**
     * Devuelve la instancia actual de WebDriver.
     */
    public static WebDriver getDriver() {
        return driver;
    }

    /**
     * Cierra el navegador y libera la instancia de WebDriver.
     */
    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
