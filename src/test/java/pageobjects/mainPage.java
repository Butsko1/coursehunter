package pageobjects;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.url;
import static io.qameta.allure.Allure.step;

public class mainPage {

    public void checkInputSearchAppear() {
        step("Проверяем видимость кнопки", () -> {
            buttons.searchButton.shouldBe(visible);
        });
        step("Кликаем на кнопку", () -> {
            buttons.searchButton.click();
        });
        step("Проверяем появление строки поиска и плейсхолдер", () -> {
            inputs.searchInput.shouldBe(visible);
            inputs.searchInput.shouldHave(attribute("placeholder", "Кто ищет, тот всегда найдет! \uD83D\uDC1E"));
        });
    }

    public void checkInputDisappear() {
        step("Кликаем на кнопку Esc", () -> {
            buttons.closeSearchButton.click();
        });
        step("Проверяем, что строка поиска исчезла", () -> {
            inputs.searchInput.shouldNotBe(visible);
        });
    }

    public void checkBasketLink() {
        step("Проверяем видимость ссылки", () -> {
            links.basketLink.shouldBe(visible);
        });
        step("Кликаем на ссылку и проверяем URL", () -> {
            links.basketLink.click();
            Assertions.assertEquals(urls.pricingUrl, url());
        });
    }

    public void checkSignUpLink() {
        step("Проверяем видимость ссылки", () -> {
            links.signUpLink.shouldBe(visible);
        });
        step("Кликаем на ссылку и проверяем URL", () -> {
            links.signUpLink.click();
            Assertions.assertEquals(urls.signUpUrl, url());
        });
    }

    public void checkSignInLink() {
        step("Проверяем видимость ссылки", () -> {
            links.signInLink.shouldBe(visible);
        });
        step("Кликаем на ссылку и проверяем URL", () -> {
            links.signInLink.click();
            Assertions.assertEquals(urls.signInUrl, url());
        });
    }

    public void checkCategoriesLink() {
        step("Проверяем видимость ссылки и текст", () -> {
            links.categoriesLink.shouldBe(visible);
            links.categoriesLink.shouldHave(text("Категории"));
        });
        step("Наводим мышку и проверяем наличие выпадающего списка", () -> {
            links.categoriesLink.hover();
            dropLists.categoriesDropList.shouldBe(visible);
        });
        step("Кликаем на ссылку и проверяем URL", () -> {
            links.categoriesLink.click();
            Assertions.assertEquals(urls.categoriesUrl, url());
        });
    }

    public void checkSourceLink() {
        step("Проверяем видимость ссылки и текст", () -> {
            links.sourceLink.shouldBe(visible);
            links.sourceLink.shouldHave(text("Источники"));
        });
        step("Кликаем на ссылку и проверяем URL", () -> {
            links.sourceLink.click();
            Assertions.assertEquals(urls.sourseUrl, url());
        });
    }

    public void checkAllCoursesLink() {
        step("Проверяем видимость ссылки и текст", () -> {
            links.allCoursesLink.shouldBe(visible);
            links.allCoursesLink.shouldHave(text("Все курсы"));
        });
        step("Наводим мышку и проверяем наличие выпадающего списка", () -> {
            links.allCoursesLink.hover();
            dropLists.allCoursesDropList.shouldBe(visible);
        });
        step("Кликаем на ссылку и проверяем URL", () -> {
            links.allCoursesLink.click();
            Assertions.assertEquals(urls.allCoursesUrl, url());
        });
    }

    public void checkTopicsLink() {
        step("Проверяем видимость ссылки и текст", () -> {
            links.topicsLink.shouldBe(visible);
            links.topicsLink.shouldHave(text("Топики"));
        });
        step("Кликаем на ссылку и проверяем URL", () -> {
            links.topicsLink.click();
            Assertions.assertEquals(urls.topicsUrl, url());
        });
    }

    public void checkBooksLink() {
        step("Проверяем видимость ссылки и текст", () -> {
            links.booksLink.shouldBe(visible);
            links.booksLink.shouldHave(text("Книги"));
        });
        step("Наводим мышку и проверяем наличие выпадающего списка", () -> {
            links.booksLink.hover();
            dropLists.booksDropList.shouldBe(visible);
        });
        step("Кликаем на ссылку и проверяем URL", () -> {
            links.booksLink.click();
            Assertions.assertEquals(urls.booksUrl, url());
        });
    }

    public void checkLinksFromDesc(String title) {
        step("Проверяем видимость ссылки " + title + " напанели предложенных категорий и кликаем на неё", () -> {
            $("a.it-item[title = '" + title + "']").shouldBe(visible);
            $("a.it-item[title = '" + title + "']").click();
        });
        step("Проверяем заголовки блоков", () -> {
            $(".breadcrumbs__a.breadcrumbs__a_active").shouldHave(text(title));
            $(".category-description-title").shouldHave(text(title + " - Видеоуроки, курсы, туториалы"));
            $(".topnews-head").shouldHave(text("Популярное в " + title.toLowerCase()));
            $("div.standard>div.container>.mb-15").shouldHave(text("Источники о " + title.toLowerCase()));
            $("section.standard>div.container>h2.mb-15").shouldHave(text(title + " в топиках"));
            $("#main h2").shouldHave(text("Курсы по " + title.toLowerCase()));
        });
    }
}
