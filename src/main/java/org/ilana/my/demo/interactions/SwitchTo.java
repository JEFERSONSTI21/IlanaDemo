package org.ilana.my.demo.interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.Step;
import net.serenitybdd.screenplay.Interaction;
import org.ilana.my.demo.utils.InterruptExcecution;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class SwitchTo implements Interaction {

    public static SwitchTo switchToNewTab() {
        return Instrumented.instanceOf(SwitchTo.class).withProperties();
    }

    @Step("{0} Switching to new Window")
    public <T extends Actor> void performAs(T actor) {
        InterruptExcecution.stop();
        Set<String> allWindows = getDriver().getWindowHandles();
        List<String> handlesList = new ArrayList<>(allWindows);
        System.out.println(handlesList.size());
        getDriver().switchTo().window(handlesList.get(handlesList.size() - 1));

    }
}


