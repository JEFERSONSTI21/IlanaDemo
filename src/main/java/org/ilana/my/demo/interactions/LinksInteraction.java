package org.ilana.my.demo.interactions;

import java.util.Collections;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.targets.Target;
import org.ilana.my.demo.userinterfaces.pages.LinksPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class LinksInteraction implements Interaction {

    private Target target;

    public LinksInteraction(Target target) {
        this.target = target;
    }

    public static LinksInteraction linksInteraction(Target target) {
        return new LinksInteraction(target);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            //lista de links
            List<WebElement> listLinks = target.resolveFor(actor).findElements(By.tagName("a"));
            List<String> listaTitulos = new ArrayList<>();

            for (int i = 0; i < listLinks.size(); i++) {
                listaTitulos.add(listLinks.get(i).getText());
                listLinks.get(i).click();
                if (listLinks.get(i).getText().contains("Home")) {

                    Thread.sleep(2000);
                    actor.attemptsTo(
                            SwitchTo.switchToNewTab(),
                            WaitForElement.withElement(LinksPage.divElements),
                            Scroll.to(LinksPage.divElements),
                            Click.on(LinksPage.divElements)
                    );
                    getDriver().close();
                    Thread.sleep(2000);
                    Set<String> allWindows = getDriver().getWindowHandles();
                    List<String> handlesList = new ArrayList<>(allWindows);
                    System.out.println(handlesList.size());
                    getDriver().switchTo().window(handlesList.get(0));
                } else {
                    actor.attemptsTo(
                            WaitForElement.withElement(LinksPage.linkResponse),
                            Scroll.to(LinksPage.linkResponse),
                            Click.on(LinksPage.linkResponse)
                    );
                }
            }

            Collections.sort(listaTitulos);
            Target linkPrimario = Target.the("link alfabetico")
                    .located(By.xpath("//a[contains(text(),'"+listaTitulos.get(0).trim()+"')]"));
            actor.attemptsTo(
                    WaitForElement.withElement(linkPrimario),
                    Scroll.to(linkPrimario),
                    Click.on(linkPrimario)
            );



        } catch (Exception e) {
            e.getMessage();
        }

    }
}