package Steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test2StepDef {
    @Given("^Login to project home page$")
    public void login_to_project_home_page()  {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        System.out.println("I am in GIVEN");
    }

    @When("^Enter the details of project home page$")
    public void enter_the_details_of_project_home_page()  {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        System.out.println("*****************");
        System.out.println("I am WHEN");
    }

    @Then("^Print the details of project home page$")
    public void print_the_details_of_project_home_page()  {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        System.out.println("I am in THEN");
    }


}
