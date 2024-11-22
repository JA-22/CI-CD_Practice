package com.example;

import io.cucumber.java.Before;
import io.cucumber.java.After;

public class BaseHooks {

    @Before
    public void setUp() {
        Base.initializeDriver();
    }

    @After
    public void tearDown() {
        Base.quitDriver();
    }
}
