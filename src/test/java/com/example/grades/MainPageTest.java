package com.example.grades;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class MainPageTest {
    MainPage mainPage = new MainPage();

    @BeforeAll
    public static void setUpAll() {
        Configuration.browserSize = "1280x800";
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @BeforeEach
    public void setUp() {
        open("http://127.0.0.1:5500/index.html");
    }

    @Test
    public void UIApproved() {
        $("#primeira").sendKeys("6");
        $("#segunda").sendKeys("6");
        $("#terceira").sendKeys("6");
        $("#quarta").sendKeys("6");
        mainPage.analyzeButton.click();
        $("#resultado").shouldHave(attribute("value", "Aprovado."));
    }

    @Test
    public void UIFinalExam() {
        $("#primeira").sendKeys("4");
        $("#segunda").sendKeys("4");
        $("#terceira").sendKeys("4");
        $("#quarta").sendKeys("4");
        mainPage.analyzeButton.click();
        $("#resultado").shouldHave(attribute("value", "Prova final."));
    }

    @Test
    public void UIFailed() {
        $("#primeira").sendKeys("1");
        $("#segunda").sendKeys("1");
        $("#terceira").sendKeys("1");
        $("#quarta").sendKeys("1");
        mainPage.analyzeButton.click();
        $("#resultado").shouldHave(attribute("value", "Reprovado."));
    }

    @Test
    public void UIInvalidNotes() {
        mainPage.analyzeButton.click();
        $("#resultado").shouldHave(attribute("value", "Notas inválidas."));
    }

//        assertEquals("All Developer Tools and Products by JetBrains", Selenide.title());
}
