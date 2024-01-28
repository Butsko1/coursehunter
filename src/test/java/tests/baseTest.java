package tests;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide.*;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class baseTest {
    static String baseUrl = "https://coursehunter.net/";

    @BeforeAll
    static void setUp(){
        Configuration.browserSize = "1920x1080";
    }
    @BeforeEach
    void setUpBeforeEach(){
        SelenideLogger.addListener("allure", new AllureSelenide());
    }
}
