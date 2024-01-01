package org.ilana.my.demo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.questions.Enabled;

import static org.ilana.my.demo.userinterfaces.pages.HomePage.divCategoryCards;

//import static org.salesforce.my.sandbox.sitmotos.userinterfaces.pages.HomePage.salesforceBan;

public class LoginSuccess implements Question<Boolean> {

    public static LoginSuccess response() {
        return new LoginSuccess();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        System.out.println(Enabled.of(divCategoryCards).viewedBy(actor).asBoolean());
        return Enabled.of(divCategoryCards).viewedBy(actor).asBoolean();
    }
}

