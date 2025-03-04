package ru.tutor.page;

import com.github.dockerjava.api.model.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import static com.codeborne.selenide.Selenide.*;
//import static com.codeborne.selenide.Selenide.closeWebDriver;

public class PageVFour extends Driver {

    public PageVFour(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[1]/div/div/div[1]/div[1]/div[1]/h1")
    private static WebElement lie;

    @FindBy(xpath = "")
    private static WebElement week;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[1]/div/div/div[1]/div[1]/div[1]/h2")
    private static WebElement pilates;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[1]/div/div/div[1]/div[1]/div[1]/p")
    private static WebElement oneRub;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[1]/div/div/div[1]/div[1]/div[2]/p[1]")
    private static WebElement pers;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[1]/div/div/div[1]/div[1]/div[2]/p[2]")
    private static WebElement twoMinute;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[1]/div/div/div[1]/div[2]/div[1]/h3")
    private static WebElement fm;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[1]/div/div/div[1]/div[2]/div[1]/h2")
    private static WebElement number;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[1]/div/div/div[2]/div/p[1]")
    private static WebElement back;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[1]/div/div/div[2]/div/p[2]")
    private static WebElement strongMuskuls;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[1]/div/div/div[2]/div/p[3]")
    private static WebElement weight;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[1]/div/div/div[1]/div[2]/div[2]/div[2]/label")
    private static WebElement male;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[1]/div/div/div[1]/div[2]/div[2]/div[1]/label")
    private static WebElement female;

    public static Object getMinus() {
        lie.getText().trim();
        return "Лежать и худеть";
    }

//    public static Object getWeek() {
//        week.getText().trim();
//        return "за 2 недели";
//    }

    public static Object getPilates() {
        pilates.getText().trim();
        return "- реально с пилатесом Сбросьте до 7,6 кг за месяц";
    }

    public static Object getOneRub() {
        oneRub.getText().trim();
        return "всего за 1 рубль уже сейчас!";
    }

        public static Object getPers() {
        pers.getText().trim();
        return "Пройдите тест и получите персональный план пилатеса для похудения.";
    }

    public static Object getTwoMinute() {
        twoMinute.getText().trim();
        return "Тест займет не более 2 минут!";
    }

    public static Object setmFM() {
        fm.getText().trim();
        return "Укажите свой пол:";
    }

    public static Object getFemale() {
        female.getText().trim();
        return "Женский";
    }

    public static Object clickFemale() {
        female.click();
        return female;
    }

    public static Object getMale() {
        male.getText().trim();
        return "Мужской";
    }

    public static Object clickMale() {
        male.click();
        return male;
    }

    public static Object getNumber() {
        number.getText().trim();
        return "1/9";
    }

    public static Object getBack() {
        back.getText().trim();
        return "здоровая спина";
    }

    public static Object getMuskuls() {
        strongMuskuls.getText().trim();
        return "крепкие мышцы";
    }

    public static Object getWeight() {
        weight.getText().trim();
        return "похудение";
    }

}
