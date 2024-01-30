package tests;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pageobjects.mainPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class mainPageTests extends baseTest {
    mainPage mainPage = new mainPage();
    @Feature("Главная страница")
    @Story("Проверка блока заголовков")
    @DisplayName("Проверка наименований ссылок")
    @Tag("main_page")
    @Tag("headers")
    @Test
    void checkHeaderContainer(){
        step("Открываем главную страницу", () -> {
            open(baseUrl);
        });
        step("Проверяем ссылку - Категории", () ->{
            mainPage.categoriesLink.shouldHave(text("Категории"));
        });
        step("Проверяем ссылку - Все курсы",() ->{
            mainPage.allCoursesLink.shouldHave(text("Все курсы"));
        });
        step("Проверяем ссылку - Источники",() ->{
            mainPage.sourceLink.shouldHave(text("Источники"));
        });
        step("Проверяем ссылку - Топики", () ->{
            mainPage.topicsLink.shouldHave(text("Топики"));
        });
        step("Проверяем ссылку - Книги",() -> {
            mainPage.booksLink.shouldHave(text("Книги"));
        });
    }
    @Feature("Главная страница")
    @Story("Проверка блока заголовков")
    @DisplayName("Проверка открытия/закрытия строки поиска")
    @Tag("main_page")
    @Tag("headers")
    @Test
    void checkInputSearch(){
        step("Открываем главную страницу", () -> {
            open(baseUrl);
        });
        step("Нажимаем на кнопку лупы, проверяем доступность строки поиска и плейсхолдер",() ->{
            mainPage.checkInputSearchAppear();
        });
        step("Наживаем на кнопку \"Esc\" в строке поиска и проверяем, что cтрока исчезла",() ->{
            mainPage.checkInputDisappear();
        });

    }
}
