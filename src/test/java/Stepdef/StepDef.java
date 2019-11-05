package Stepdef;

import cucumber.api.PendingException;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

    @RunWith(Cucumber.class)
    public class StepDef {

            @Given("^User will navigate to the website$")
            public void user_will_navigate_to_the_website() throws Throwable {
                System.out.println("User will navigate to the website");
            }

            @When("^User login into application with username and password$")
            public void user_login_into_application_with_username_and_password() throws Throwable {
                System.out.println("User login into application with username and password");
            }

            @Then("^DashBoard will appear$")
            public void dashboard_will_appear() throws Throwable {
                System.out.println("DashBoard will appear");
            }

        }

