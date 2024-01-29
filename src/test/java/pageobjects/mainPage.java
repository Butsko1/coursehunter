package pageobjects;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class mainPage {
    public SelenideElement categoriesLink = $("ul.nav-container>li:first-child");
    public SelenideElement sourceLink = $("ul.nav-container>li:nth-child(2)");
    public SelenideElement allCoursesLink = $("ul.nav-container>li:nth-child(3)");
    public SelenideElement topicsLink = $("ul.nav-container>li:nth-child(4)");
    public SelenideElement booksLink = $("ul.nav-container>li:nth-child(5)");

}
