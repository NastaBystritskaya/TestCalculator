package au.bystritskaia;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import lombok.Setter;

/**
 * Страница калькулятора
 */
@Getter
@Setter
public class CalculatorPage {

    /**
     * Кнопка 9
     */
    private SelenideElement button9 = Selenide.$x(".//button[@value = '9']");

    /**
     * Кнопка 8
     */
    private SelenideElement button8 = Selenide.$x(".//button[@value = '8']");

    /**
     * Кнопка 7
     */
    private SelenideElement button7 = Selenide.$x(".//button[@value = '7']");

    /**
     * Кнопка 6
     */
    private SelenideElement button6 = Selenide.$x(".//button[@value = '6']");

    /**
     * Кнопка 5
     */
    private SelenideElement button5 = Selenide.$x(".//button[@value = '5']");

    /**
     * Кнопка 4
     */
    private SelenideElement button4 = Selenide.$x(".//button[@value = '4']");

    /**
     * Кнопка 3
     */
    private SelenideElement button3 = Selenide.$x(".//button[@value = '3']");

    /**
     * Кнопка 2
     */
    private SelenideElement button2 = Selenide.$x(".//button[@value = '2']");

    /**
     * Кнопка 1
     */
    private SelenideElement button1 = Selenide.$x(".//button[@value = '1']");

    /**
     * Кнопка 0
     */
    private SelenideElement button0 = Selenide.$x(".//button[@value = '0']");

    /**
     * Кнопка "C"
     */
    private SelenideElement buttonC = Selenide.$x(".//button[contains(@class, 'calculator__clear')]");

    /**
     * Кнопка "<-"
     */
    private SelenideElement buttonBack = Selenide.$x(".//button[contains(@class, 'calculator__backspace')]");

    /**
     * Кнопка "x2"
     */
    private SelenideElement buttonX2 = Selenide.$x(".//button[contains(@class, 'calculator__power')]");

    /**
     * Кнопка "+"
     */
    private SelenideElement buttonPlus = Selenide.$x(".//button[@value = '+']");

    /**
     * Кнопка "/"
     */
    private SelenideElement buttonDel = Selenide.$x(".//button[@value = '/']");

    /**
     * Кнопка "*"
     */
    private SelenideElement buttonUmn = Selenide.$x(".//button[@value = '*']");

    /**
     * Кнопка "-"
     */
    private SelenideElement buttonMin = Selenide.$x(".//button[@value = '-']");

    /**
     * Кнопка "="
     */
    private SelenideElement buttonRavn = Selenide.$x(".//button[contains(@class, 'key--equal')]");

    /**
     * Кнопка "."
     */
    private SelenideElement buttonPoint = Selenide.$x(".//button[@value = '.']");

    /**
     * Дисплей калькулятора
     */
    private SelenideElement display = Selenide.$x(".//input[@class = 'calculator__display']");
}
