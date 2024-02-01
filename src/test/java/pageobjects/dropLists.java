package pageobjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class dropLists {
    public static SelenideElement categoriesDropList = $("ul.nav-container>li:first-child>ul");
    public static SelenideElement allCoursesDropList = $("ul.nav-container>li:nth-child(3)>ul");
    public static SelenideElement booksDropList = $("ul.nav-container>li:nth-child(5)>ul");
}
