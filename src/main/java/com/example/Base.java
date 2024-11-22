package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {
    protected static WebDriver driver;

    public static void initializeDriver() {
        if (driver == null) {
            ChromeOptions options = new ChromeOptions();
            options.setBinary("/usr/bin/google-chrome");
            options.addArguments("--headless"); // Opcional, ejecuta Chrome en modo headless
            options.addArguments("--no-sandbox"); // Necesario para entornos de CI/CD como GitHub Actions
            options.addArguments("--disable-dev-shm-usage"); // Necesario para entornos de CI/CD como GitHub Actions

            driver = new ChromeDriver(options);
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
