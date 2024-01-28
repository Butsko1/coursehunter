package tests;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pageobjects.mainPage;

import static com.codeborne.selenide.Selenide.open;

public class mainPageTests extends baseTest {
    mainPage mainPage = new mainPage();
    @Feature("Главная страница")
    @Story("Проверка блока заголовков")
    @DisplayName("Проверка наименований ссылок")
    @Tag("main")
    @Test
    void checkHeaderContainer(){
        open(baseUrl);
        mainPage.checkCategoriesLink();
        mainPage.checkSourceLink();
        mainPage.checkAllCoursesLink();
        mainPage.checkTopicsLink();
        mainPage.checkBooksLink();

    }
}
