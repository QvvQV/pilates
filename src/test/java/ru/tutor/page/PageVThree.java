package ru.tutor.page;

import com.github.dockerjava.api.model.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import static com.codeborne.selenide.Selenide.*;
//import static com.codeborne.selenide.Selenide.closeWebDriver;

public class PageVThree extends Driver {


    public PageVThree(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "")
    private static WebElement minus;

    @FindBy(xpath = "")
    private static WebElement week;

    @FindBy(xpath = "")
    private static WebElement pilates;

    @FindBy(xpath = "")
    private static WebElement bespl;

    @FindBy(xpath = "")
    private static WebElement twoMinute;

    @FindBy(xpath = "")
    private static WebElement fm;

    @FindBy(xpath = "")
    private static WebElement number;

    @FindBy(xpath = "")
    private static WebElement back;

    @FindBy(xpath = "")
    private static WebElement strongMuskuls;

    @FindBy(xpath = "")
    private static WebElement weight;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[1]/div/div/div[1]/div[2]/div[2]/div[2]/label")
    private static WebElement male;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[1]/div/div/div[1]/div[2]/div[2]/div[1]/label")
    private static WebElement female;

    public static Object getMinus() {
        minus.getText().trim();
        return "-10 см в талии";
    }

    public static Object getWeek() {
        week.getText().trim();
        return "за 2 недели";
    }

    public static Object getPilates() {
        pilates.getText().trim();
        return "тренируясь лежа на коврике!";
    }

    public static Object getBespl() {
        bespl.getText().trim();
        return "Завершите тест и получите свой план пилатеса бесплатно!";
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

    public static Object getNumber(){
  number.getText().trim();
        return "1/9";
    }

       public static Object getBack(){
  back.getText().trim();
        return "здоровая спина";
    }

       public static Object getMuskuls(){
  strongMuskuls.getText().trim();
        return "крепкие мышцы";
    }

       public static Object getWeight(){
  weight.getText().trim();
        return "похудение";
    }

}
