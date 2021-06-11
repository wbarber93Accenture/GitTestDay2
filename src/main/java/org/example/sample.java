package org.example;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;

public class sample {

    @Given("^I am a user$")
    public void iAmAUser() throws Throwable {
        System.out.println("page Opened");
    }

    @When("^I am on Google page$")
    public void i_am_on_Google_page() throws Throwable {
        System.out.println("page reached");

    }

    @Then("^I see the element$")
    public void i_see_the_element() throws Throwable {
        System.out.println("page reached");

    }


}