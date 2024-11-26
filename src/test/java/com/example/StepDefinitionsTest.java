package com.example;

import io.cucumber.java.en.Given;

/*public class StepDefinitions {

    @Given("I open the Google homepage")
    public void iOpenTheGoogleHomepage() {
        Base.getDriver().get("https://www.google.com");
    }
}
    */
    
    public class StepDefinitionsTest {
        private String baseUrl;
        private String environment;
    
        public StepDefinitionsTest() {
            // Recuperar las variables de entorno configuradas
            this.baseUrl = System.getProperty("baseUrl", "https://www.google.com");
            this.environment = System.getProperty("env", "QA");
            System.out.println("Running tests in environment: " + environment);
            System.out.println("Base URL is: " + baseUrl);
        }
    
        @Given("I open the Google homepage")
        public void iOpenTheGoogleHomepage() {
            Base.getDriver().get(baseUrl);
        }
    }
    