package pageobjects;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.url;
import static io.qameta.allure.Allure.step;

public class mainPage {
    public String baseUrl = "https://coursehunter.net/";
    public String pricingUrl = baseUrl + "pricing";
    public String signUpUrl = baseUrl + "sign-up";
    public String signInUrl = baseUrl + "sign-in";
    public String categoriesUrl = baseUrl + "category";
    public SelenideElement categoriesLink = $("ul.nav-container>li:first-child");
    public SelenideElement categoriesDropList = $("ul.nav-container>li:first-child>ul");
    public SelenideElement sourceLink = $("ul.nav-container>li:nth-child(2)");
    public SelenideElement allCoursesLink = $("ul.nav-container>li:nth-child(3)");
    public SelenideElement topicsLink = $("ul.nav-container>li:nth-child(4)");
    public SelenideElement booksLink = $("ul.nav-container>li:nth-child(5)");
    public SelenideElement searchButton = $("button.main-header-search");
    public SelenideElement searchInput = $("#mainSearch");
    public SelenideElement closeSearchButton = $("button.main-search-close");
    public SelenideElement basketLink = $("a.main-header-basket");
    public SelenideElement signUpLink = $("a.main-header-donate");
    public SelenideElement signInLink = $("a.main-header-link");
    public void checkInputSearchAppear(){
        step("Проверяем видимость кнопки",() ->{
            searchButton.shouldBe(visible);
        });
        step("Кликаем на кнопку",() ->{
            searchButton.click();
        });
        step("Проверяем появление строки поиска и плейсхолдер", () ->{
            searchInput.shouldBe(visible);
            searchInput.shouldHave(attribute("placeholder", "Кто ищет, тот всегда найдет! \uD83D\uDC1E"));
        });
    }
    public void checkInputDisappear(){
        step("Кликаем на кнопку Esc",() ->{
            closeSearchButton.click();
        });
        step("Проверяем, что строка поиска исчезла",() ->{
            searchInput.shouldNotBe(visible);
        });
    }

    public void checkBasketLink(){
        step("Проверяем видимость ссылки",() ->{
            basketLink.shouldBe(visible);
        });
        step("Кликаем на ссылку и проверяем URL",() ->{
            basketLink.click();
            Assertions.assertEquals(pricingUrl,url());
        });
    }
    public void checkSignUpLink(){
        step("Проверяем видимость ссылки",() ->{
            signUpLink.shouldBe(visible);
        });
        step("Кликаем на ссылку и проверяем URL",() ->{
            signUpLink.click();
            Assertions.assertEquals(signUpUrl,url());
        });
    }
    public void checkSignInLink(){
        step("Проверяем видимость ссылки",() ->{
            signInLink.shouldBe(visible);
        });
        step("Кликаем на ссылку и проверяем URL",() ->{
            signInLink.click();
            Assertions.assertEquals(signInUrl,url());
        });
    }
    public void checkCategoriesLink(){
        step("Проверяем видимость ссылки и текст",() ->{
            categoriesLink.shouldBe(visible);
            categoriesLink.shouldHave(text("Категории"));
        });
        step("Наводим мышку и проверяем наличие выпадающего списка",() ->{
            categoriesLink.hover();
            categoriesDropList.shouldBe(visible);
        });
        step("Кликаем на ссылку и проверяем URL", () ->{
            categoriesLink.click();
            Assertions.assertEquals(categoriesUrl,url());
        });

    }
}
