package org.ilana.my.demo.userinterfaces.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://demoqa.com/")
public class HomePage extends PageObject {

    public static final Target divCategoryCards = Target.the("div Category Cards")
            .located(By.xpath("//div[@class='category-cards']"));

    public static final Target divForms = Target.the("div Forms")
            .located(By.xpath("//h5[text()='Forms']"));
}
