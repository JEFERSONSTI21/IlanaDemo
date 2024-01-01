package org.ilana.my.demo.userinterfaces.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


public class LinksPage extends PageObject {

    public static final Target divElements = Target.the("div Elements")
            .located(By.xpath("//h5[text()='Elements']"));

    public static final Target spanLinks = Target.the("span Links")
            .located(By.xpath("//span[text()='Links']"));

    public static final Target divLinks = Target.the("div Links")
            .located(By.xpath("//div[@id='linkWrapper']"));

    public static final Target linkResponse = Target.the("link Response")
            .located(By.xpath("//p[@id='linkResponse']"));


}
