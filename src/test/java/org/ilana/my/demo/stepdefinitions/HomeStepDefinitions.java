package org.ilana.my.demo.stepdefinitions;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.ilana.my.demo.questions.LoginSuccess;
import org.ilana.my.demo.tasks.Home;
import org.ilana.my.demo.tasks.OpenBrowser;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class HomeStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^user enters the demo page$")
    public void thatTheUserEntersTheSalesforceSite() {
        theActorCalled("Bryan").wasAbleTo(OpenBrowser.openPage());
    }

    @When("^a user fills out the login form correctly$")
    public void a_user_fills_out_the_login_form_correctly() {
        theActorInTheSpotlight().attemptsTo(Home.home());
    }

    @Then("^the home successful$")
    public void the_login_is_successful() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(LoginSuccess.response()));
    }


}
