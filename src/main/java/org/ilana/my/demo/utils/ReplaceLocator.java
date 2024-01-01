package org.ilana.my.demo.utils;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ReplaceLocator {

    public static By replaceBy(String string, String replace, String option) {
        By xpath = By.xpath(string.replace(replace, option));
        return xpath;
    }

    public static Target convertByToTarget(By by, String description) {
        return Target.the(description).located(by);
    }



}
