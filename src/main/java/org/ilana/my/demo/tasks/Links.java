package org.ilana.my.demo.tasks;

import cucumber.api.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import org.ilana.my.demo.interactions.ForceInteraction;
import org.ilana.my.demo.interactions.LinksInteraction;
import org.ilana.my.demo.interactions.WaitForElement;
import org.ilana.my.demo.userinterfaces.pages.FormsPage;
import org.ilana.my.demo.userinterfaces.pages.HomePage;
import org.ilana.my.demo.userinterfaces.pages.LinksPage;

import java.util.List;
import java.util.Map;


public class Links implements Task {


    public Links() {

    }

    public static Links links() {
        return Tasks.instrumented(Links.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitForElement.withElement(LinksPage.divElements),
                Click.on(LinksPage.divElements),
                WaitForElement.withElement(LinksPage.spanLinks),
                Scroll.to(LinksPage.spanLinks),
                Click.on(LinksPage.spanLinks),
                WaitForElement.withElement(LinksPage.divLinks),
                Scroll.to(LinksPage.divLinks),
                LinksInteraction.linksInteraction(LinksPage.divLinks)
        );


        //WaitForElement.withElement(FormsPage.spanForms),
        //Click.on(FormsPage.spanForms),

    }
}
