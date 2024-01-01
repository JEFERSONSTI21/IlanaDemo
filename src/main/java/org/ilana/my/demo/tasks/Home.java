package org.ilana.my.demo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static org.ilana.my.demo.userinterfaces.pages.HomePage.*;


public class Home implements Task {



    public Home() {

    }

    public static Home home() {
        return Tasks.instrumented(Home.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(divCategoryCards, isClickable()),
                Scroll.to(divCategoryCards)
        );
    }
}
