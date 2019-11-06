package Stepdef;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import java.util.List;

@RunWith(Cucumber.class)
    public class StepDef {


    @Given("^User will navigate to the website$")
            public void user_will_navigate_to_the_website() throws Throwable {
                System.out.println("User will navigate to the website");
            }

        @When("^User login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
        public void user_login_into_application_with_and(String arg1, String arg2) throws Throwable {
            // Write code here that turns the phrase above into concrete actions
            System.out.println(arg1);
            System.out.println(arg2);
        }



        @Then("^DashBoard will appear with \"([^\"]*)\"$")
        public void dashboard_will_appear_with_something(String strArg1) throws Throwable {
        }



        @And("^user will see something$")
        public void user_will_see_something() throws Throwable {
            System.out.println("user will see something");
        }
        @When("^User sign into application with following information$")
        public void user_sign_into_application_with_following_information(DataTable data) throws Throwable {

            List<List<String>> obj=data.raw();
            System.out.println(obj.get(0).get(0));
            System.out.println(obj.get(0).get(1));
            System.out.println(obj.get(0).get(2));
            System.out.println(obj.get(0).get(3));
            System.out.println(obj.get(0).get(4));
            System.out.println(obj.get(0).get(5));
            System.out.println(obj.get(0).get(6));


        }
    @When("^User login into  with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_login_into_with_and(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }
    @Then("^DashBoard will appear with$")
    public void dashboard_will_appear_with() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }


}





