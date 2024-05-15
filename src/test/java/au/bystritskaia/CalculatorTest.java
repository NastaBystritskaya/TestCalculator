package au.bystritskaia;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Тесты калькулятора
 */
public class CalculatorTest {

    /**
     * Страница калькулятора
     */
    private CalculatorPage calculatorPage = new CalculatorPage();

    /**
     * Начало тестов
     */
    @BeforeClass
    public void Start() {
        WebDriverManager.chromedriver().setup();
        Selenide.open("https://ecalc.ru/simple/");
        WebDriverRunner.getWebDriver().manage().window().fullscreen();
    }

    /**
     * Scenario1.txt
     * 2 * 2 = 4
     */
    @Test
    public void Test1() {
        calculatorPage.getButtonC().shouldBe(Condition.visible).click();
        calculatorPage.getButton2().shouldBe(Condition.visible).click();
        calculatorPage.getButtonUmn().shouldBe(Condition.visible).click();
        calculatorPage.getButton2().shouldBe(Condition.visible).click();
        calculatorPage.getButtonRavn().shouldBe(Condition.visible).click();
        calculatorPage.getDisplay().shouldHave(Condition.attribute("value","4"));

    }

    /**
     * Scenario2.txt
     * 2 * 2 != 5
     */
    @Test
    public void Test2() {
        calculatorPage.getButtonC().shouldBe(Condition.visible).click();
        calculatorPage.getButton2().shouldBe(Condition.visible).click();
        calculatorPage.getButtonUmn().shouldBe(Condition.visible).click();
        calculatorPage.getButton2().shouldBe(Condition.visible).click();
        calculatorPage.getButtonRavn().shouldBe(Condition.visible).click();
        calculatorPage.getDisplay().shouldNotHave(Condition.attribute("value", "5"));
    }

    /**
     * Scenario3.txt
     * 9^2 = 81
     */
    @Test
    public void Test3() {
        calculatorPage.getButtonC().shouldBe(Condition.visible).click();
        calculatorPage.getButton9().shouldBe(Condition.visible).click();
        calculatorPage.getButtonX2().shouldBe(Condition.visible).click();
        calculatorPage.getDisplay().shouldHave(Condition.attribute("value", "81"));
    }

    /**
     * Scenario4.txt
     * 10 - 2 = 8
     */
    @Test
    public void Test4() {
        calculatorPage.getButtonC().shouldBe(Condition.visible).click();
        calculatorPage.getButton1().shouldBe(Condition.visible).click();
        calculatorPage.getButton0().shouldBe(Condition.visible).click();
        calculatorPage.getButtonMin().shouldBe(Condition.visible).click();
        calculatorPage.getButton2().shouldBe(Condition.visible).click();
        calculatorPage.getButtonRavn().shouldBe(Condition.visible).click();
        calculatorPage.getDisplay().shouldHave(Condition.attribute("value", "8"));

    }

    /**
     * Scenario5.txt
     * 12 - 3 != 6
     */
    @Test
    public void Test5() {
        calculatorPage.getButtonC().shouldBe(Condition.visible).click();
        calculatorPage.getButton1().shouldBe(Condition.visible).click();
        calculatorPage.getButton2().shouldBe(Condition.visible).click();
        calculatorPage.getButtonMin().shouldBe(Condition.visible).click();
        calculatorPage.getButton3().shouldBe(Condition.visible).click();
        calculatorPage.getButtonRavn().shouldBe(Condition.visible).click();
        calculatorPage.getDisplay().shouldNotHave(Condition.attribute("value", "6"));
    }

    /**
     * Scenario6.txt
     * Проверка очистки значений
     */
    @Test
    public void Test6() {
        calculatorPage.getButtonC().shouldBe(Condition.visible).click();
        calculatorPage.getDisplay().shouldHave(Condition.attribute("value", "0"));
    }

    /**
     * Scenario7.txt
     * Деление на 0
     */
    @Test
    public void Test7() {
        calculatorPage.getButtonC().shouldBe(Condition.visible).click();
        calculatorPage.getButton9().shouldBe(Condition.visible).click();
        calculatorPage.getButtonDel().shouldBe(Condition.visible).click();
        calculatorPage.getButton0().shouldBe(Condition.visible).click();
        calculatorPage.getButtonRavn().shouldBe(Condition.visible).click();
        calculatorPage.getDisplay().shouldHave(Condition.attribute("value", "Infinity"));
    }
}
