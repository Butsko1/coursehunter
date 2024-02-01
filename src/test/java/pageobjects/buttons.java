package pageobjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class buttons {
    public static SelenideElement searchButton = $("button.main-header-search");
    public static SelenideElement closeSearchButton = $("button.main-search-close");
}
