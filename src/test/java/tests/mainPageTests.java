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
    void headerContainerTest(){
        step("Открываем главную страницу", () -> {
            open(mainPage.baseUrl);
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
    void inputSearchTest(){
        step("Открываем главную страницу", () -> {
            open(mainPage.baseUrl);
        });
        step("Нажимаем на кнопку лупы, проверяем доступность строки поиска и плейсхолдер",() ->{
            mainPage.checkInputSearchAppear();
        });
        step("Наживаем на кнопку \"Esc\" в строке поиска и проверяем, что cтрока исчезла",() ->{
            mainPage.checkInputDisappear();
        });

    }
    @Feature("Главная страница")
    @Story("Проверка блока заголовков")
    @DisplayName("Проверка работы корзины")
    @Tag("main_page")
    @Tag("headers")
    @Test
    void basketLinkTest(){
        step("Открываем главную страницу", () -> {
            open(mainPage.baseUrl);
        });
        step("Проверяем наличие ссылки-корзины, кликаем и проверяем урл", () -> {
            mainPage.checkBasketLink();
        });
    }
    @Feature("Главная страница")
    @Story("Проверка блока заголовков")
    @DisplayName("Проверка работы ссылки Sign Up")
    @Tag("main_page")
    @Tag("headers")
    @Test
    void signUpLinkTest(){
        step("Открываем главную страницу", () -> {
            open(mainPage.baseUrl);
        });
        step("Проверяем наличие ссылки Sign Up, кликаем и проверяем урл",() ->{
            mainPage.checkSignUpLink();
        });
    }

    @Feature("Главная страница")
    @Story("Проверка блока заголовков")
    @DisplayName("Проверка работы ссылки Sign In")
    @Tag("main_page")
    @Tag("headers")
    @Test
    void signInLinkTest(){
        step("Открываем главную страницу", () -> {
            open(mainPage.baseUrl);
        });
        step("Проверяем наличие ссылки Sign In, кликаем и проверяем урл",() ->{
            mainPage.checkSignInLink();
        });
    }

    @Feature("Главная страница")
    @Story("Проверка блока заголовков")
    @DisplayName("Проверка работы ссылки Категории")
    @Tag("main_page")
    @Tag("headers")
    @Test
    void categoriesLinkTest(){
        step("Открываем главную страницу", () -> {
            open(mainPage.baseUrl);
        });
        step("Проверяем работу ссылки Категории",() ->{
            mainPage.checkCategoriesLink();
        });
    }

}
