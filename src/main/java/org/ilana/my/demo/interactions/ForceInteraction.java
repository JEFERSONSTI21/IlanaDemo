package org.ilana.my.demo.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.interactions.Actions;

public class ForceInteraction implements Interaction {

    private Target target;

    public ForceInteraction(Target target) {
        this.target = target;
    }

    public static ForceInteraction click(Target target) {
        return new ForceInteraction(target);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Actions action = new Actions(actor.usingAbilityTo(BrowseTheWeb.class).getDriver());
        action.click(target.resolveFor(actor)).perform();
    }
}