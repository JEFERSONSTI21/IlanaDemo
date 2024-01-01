package org.ilana.my.demo.stepdefinitions;


import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.ilana.my.demo.tasks.Forms;
import org.ilana.my.demo.tasks.Links;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LinksStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }
    @When("^link verification process$")
    public void linkVerificationProcess() {
        theActorInTheSpotlight().attemptsTo(Links.links());
    }



}
