package org.ilana.my.demo.interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class WaitForElement implements Interaction {

    private final Target element;

    public WaitForElement(Target element){
        this.element = element;
    }



    @Override
    public <T extends Actor> void performAs(T actor) {

            actor.attemptsTo(
                    WaitUntil.the(element, WebElementStateMatchers.isVisible()).forNoMoreThan(30).seconds(),
                    WaitUntil.the(element, WebElementStateMatchers.isClickable()).forNoMoreThan(30).seconds()
            );

    }

    public static Performable withElement(Target element) {
        return Instrumented.instanceOf(WaitForElement.class).withProperties(element);
    }

    public static Performable withWaitTime(Target element, int timeout) {
        return Instrumented.instanceOf(WaitForElement.class).withProperties(element, timeout);
    }
}
