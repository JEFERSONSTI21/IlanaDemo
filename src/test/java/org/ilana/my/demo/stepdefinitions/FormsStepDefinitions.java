package org.ilana.my.demo.stepdefinitions;


import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.ilana.my.demo.tasks.Forms;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FormsStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }
    @When("^Registration of the form is carried out$")
    public void registrationOfTheFormIsCarriedOut(DataTable table) {
        System.out.println(table);
        theActorInTheSpotlight().attemptsTo(Forms.forms(table));
    }



}
