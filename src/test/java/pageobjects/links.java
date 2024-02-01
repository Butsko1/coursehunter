package pageobjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class links {
    public static SelenideElement categoriesLink = $("ul.nav-container>li:first-child");
    public static SelenideElement sourceLink = $("ul.nav-container>li:nth-child(2)");
    public static SelenideElement allCoursesLink = $("ul.nav-container>li:nth-child(3)");
    public static SelenideElement topicsLink = $("ul.nav-container>li:nth-child(4)");
    public static SelenideElement booksLink = $("ul.nav-container>li:nth-child(5)");
    public static SelenideElement basketLink = $("a.main-header-basket");
    public static SelenideElement signUpLink = $("a.main-header-donate");
    public static SelenideElement signInLink = $("a.main-header-link");
}
