package com.example;

import io.cucumber.java.en.Given;

public class StepDefinitions {

    @Given("I open the Google homepage")
    public void iOpenTheGoogleHomepage() {
        Base.getDriver().get("https://www.google.com");
    }
}
