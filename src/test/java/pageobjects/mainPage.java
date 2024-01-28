package pageobjects;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class mainPage {
    SelenideElement categoriesLink = $("ul.nav-container>li:first-child");
    SelenideElement sourceLink = $("ul.nav-container>li:nth-child(2)");
    SelenideElement allCoursesLink = $("ul.nav-container>li:nth-child(3)");
    SelenideElement topicsLink = $("ul.nav-container>li:nth-child(4)");
    SelenideElement booksLink = $("ul.nav-container>li:nth-child(5)");
    @Step("Проверяем ссылку - Категории")
    public void checkCategoriesLink(){
        categoriesLink.shouldHave(text("Категории"));
    }
    @Step("Проверяем ссылку - Все курсы")
    public void checkAllCoursesLink(){
        allCoursesLink.shouldHave(text("Все курсы"));
    }
    @Step("Проверяем ссылку - Источники")
    public void checkSourceLink(){
        sourceLink.shouldHave(text("Источники"));
    }
    @Step("Проверяем ссылку - Топики")
    public void checkTopicsLink(){
        topicsLink.shouldHave(text("Топики"));
    }
    @Step("Проверяем ссылку - Книги")
    public void checkBooksLink(){
        booksLink.shouldHave(text("Книги"));
    }
}
