package ru.tutor.page;

import com.github.dockerjava.api.model.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import static com.codeborne.selenide.Selenide.*;
//import static com.codeborne.selenide.Selenide.closeWebDriver;

public class PageVTwo extends Driver {


    public PageVTwo(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "")
    private static WebElement secret;

    @FindBy(xpath = "")
    private static WebElement slimness;

    @FindBy(xpath = "")
    private static WebElement pilates;

    @FindBy(xpath = "")
    private static WebElement oneRub;

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

    public static Object getSecret() {
        secret.getText().trim();
        return "Секрет";
    }

    public static Object getSlimness() {
        slimness.getText().trim();
        return "стройности";
    }

    public static Object getPilates() {
        pilates.getText().trim();
        return "минус 2 размера за месяц с пилатесом!";
    }

    public static Object getOneRub() {
        oneRub.getText().trim();
        return "Пройдите тест и сделайте первый шаг к стройности, всего за 1 рубль!";
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
