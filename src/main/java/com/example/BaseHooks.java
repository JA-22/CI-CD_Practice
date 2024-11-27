package com.example;

import io.cucumber.java.Before;
import io.cucumber.java.After;

public class BaseHooks {

    /**
     * Configura el WebDriver antes de cada escenario.
     */
    @Before
    public void setUp() {
        Base.initializeDriver();
    }

    /**
     * Cierra el WebDriver después de cada escenario.
     */
    @After
    public void tearDown() {
        Base.quitDriver();
    }
}
