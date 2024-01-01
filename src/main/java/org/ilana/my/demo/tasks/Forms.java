package org.ilana.my.demo.tasks;

import cucumber.api.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.selectactions.SelectByIndexFromBy;
import net.serenitybdd.screenplay.actions.selectactions.SelectByIndexFromElement;
import net.serenitybdd.screenplay.actions.selectactions.SelectByValueFromBy;
import org.ilana.my.demo.interactions.ForceInteraction;
import org.ilana.my.demo.interactions.WaitForElement;
import org.ilana.my.demo.userinterfaces.pages.FormsPage;
import org.ilana.my.demo.userinterfaces.pages.HomePage;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Map;


public class Forms implements Task {

    DataTable table;

    public Forms(DataTable dataTable) {
        this.table = dataTable;
    }

    public static Forms forms(DataTable dataTable) {
        return Tasks.instrumented(Forms.class, dataTable);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<Map<String, String>> data = table.asMaps(String.class, String.class);

        String firstName = data.get(0).get("firstName").trim();
        String lastName = data.get(0).get("lastName").trim();
        String email = data.get(0).get("email").trim();
        String mobile = data.get(0).get("mobile").trim();
        actor.attemptsTo(
                WaitForElement.withElement(HomePage.divForms),
                Click.on(HomePage.divForms),
                //WaitForElement.withElement(FormsPage.spanForms),
                //Click.on(FormsPage.spanForms),
                WaitForElement.withElement(FormsPage.spanPracticeForm),
                Scroll.to(FormsPage.spanPracticeForm),
                ForceInteraction.click(FormsPage.spanPracticeForm),
                WaitForElement.withElement(FormsPage.inputFirstName),
                Enter.theValue(firstName).into(FormsPage.inputFirstName),
                WaitForElement.withElement(FormsPage.inputLastName),
                Enter.theValue(lastName).into(FormsPage.inputLastName),
                WaitForElement.withElement(FormsPage.inputEmail),
                Scroll.to(FormsPage.inputEmail),
                Enter.theValue(email).into(FormsPage.inputEmail),
                Scroll.to(FormsPage.checkMale),
                ForceInteraction.click(FormsPage.checkMale),
                WaitForElement.withElement(FormsPage.inputMobile),
                Scroll.to(FormsPage.inputMobile),
                Enter.theValue(mobile).into(FormsPage.inputMobile),
                WaitForElement.withElement(FormsPage.inputDateBirth),
                Scroll.to(FormsPage.inputDateBirth),
                ForceInteraction.click(FormsPage.inputDateBirth),
                WaitForElement.withElement(FormsPage.selectMonth),
                Click.on(FormsPage.selectMonth),
                WaitForElement.withElement(FormsPage.optionMonth),
                Click.on(FormsPage.optionMonth),
                WaitForElement.withElement(FormsPage.selectYear),
                Click.on(FormsPage.selectYear),
                WaitForElement.withElement(FormsPage.selectYear),
                Scroll.to(FormsPage.optionYear),
                Click.on(FormsPage.optionYear),
                WaitForElement.withElement(FormsPage.divDay),
                Click.on(FormsPage.divDay)
        );

        System.out.println("proceso");
        actor.attemptsTo(
                WaitForElement.withElement(FormsPage.buttonSubmit),
                Scroll.to(FormsPage.buttonSubmit),
                Click.on(FormsPage.buttonSubmit));
    }
}
