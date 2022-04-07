package starter.test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.stepdefinitions.NavigateSteps;
import starter.utils.NavigationUtils;


public class Navigate {
    @Steps
    NavigationUtils navigationUtils;

    @Steps
    NavigateSteps navigate;

    @Given("user navigates to the website")
    public void userNavigatesToTheWebsite() {
        navigate.userNavigatesToRequestedUrl();

    }

    @When("user arrived successfully to the site")
    public void userArrivedSuccessfullyToTheSite() {
        navigate.verifyPageTitle();
    }

    @Then("user will see a cucumber")
    public void userWillSeeACucumber() throws InterruptedException {
        navigate.userSearchForText();
    }
}
