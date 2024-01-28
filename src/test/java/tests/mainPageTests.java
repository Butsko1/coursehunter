package tests;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pageobjects.mainPage;

import static com.codeborne.selenide.Selenide.open;

public class mainPageTests extends baseTest {
    mainPage mainPage = new mainPage();
    @Feature("Главная страница")
    @Story("Проверка блока заголовков")
    @DisplayName("Проверка наименований ссылок")
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
