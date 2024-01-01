package org.ilana.my.demo.userinterfaces.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

public class FormsPage extends PageObject {


    public static final Target spanForms = Target.the("span Forms")
            .located(By.xpath("//span[@class='group-header']//div[contains(text(),'Forms')]"));

    public static final Target spanPracticeForm = Target.the("span Practice Form")
            .located(By.xpath("//span[contains(text(),'Practice Form')]"));

    public static final Target inputFirstName = Target.the("input First Name")
            .located(By.xpath("//input[@id='firstName']"));

    public static final Target inputLastName = Target.the("input Last Name")
            .located(By.xpath("//input[@id='lastName']"));

    public static final Target inputEmail = Target.the("input Email")
            .located(By.xpath("//input[@id='userEmail']"));

    public static final Target checkMale = Target.the("check Male")
            .located(By.xpath("//input[@value='Male']"));

    public static final Target inputMobile = Target.the("input Mobile")
            .located(By.xpath("//input[@placeholder='Mobile Number']"));


    public static final Target inputDateBirth = Target.the("input Date Birth")
            .located(By.xpath("//input[@id='dateOfBirthInput']"));

    public static final Target selectMonth = Target.the("select Month")
            .located(By.xpath("//select[@class='react-datepicker__month-select']"));

    public static final Target optionMonth = Target.the("option Month")
            .located(By.xpath("//option[contains(text(),'January')]"));

    public static final Target selectYear = Target.the("select year")
            .located(By.xpath("//select[@class='react-datepicker__year-select']"));

    public static final Target optionYear = Target.the("option year")
            .located(By.xpath("//option[contains(text(),'1997')]"));

    public static final Target divDay = Target.the("divDay")
            .located(By.xpath("//div[contains(text(),'14')]"));
    public static final Target buttonSubmit = Target.the("button Submit")
            .located(By.xpath("//button[@id='submit']"));

}
