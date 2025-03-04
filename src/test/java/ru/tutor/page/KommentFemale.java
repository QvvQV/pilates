package ru.tutor.page;

import com.github.dockerjava.api.model.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import static com.codeborne.selenide.Selenide.*;
//import static com.codeborne.selenide.Selenide.closeWebDriver;

public class KommentFemale extends Driver {

    public KommentFemale(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[11]/section/section/div/div/div[1]")
    private static WebElement numberPeople;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[11]/section/section/div/div/div[1]")
    private static WebElement rezult;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[11]/section/section/div/div/div[2]/p")
    private static WebElement hvast;

    @FindBy(xpath = "//*[@id=\"slick-slide11\"]/div[2]/h3")
    private static WebElement Olga;

    @FindBy(xpath = "//*[@id=\"slick-slide11\"]/div[2]")
    private static WebElement komentOlga;

    @FindBy(xpath = "//*[@id=\"splide01-slide01\"]/div/div[1]/div[1]")
    private static WebElement kat;

    @FindBy(xpath = "//*[@id=\"splide01-slide01\"]/div/div[1]/div[1]")
    private static WebElement kat32;

    @FindBy(xpath = "//*[@id=\"splide01-slide01\"]/div/div[2]")
    private static WebElement kommentKat;

    @FindBy(xpath = "//*[@id=\"splide01-slide02\"]/div/div[1]/div[1]")
    private static WebElement marina;

    @FindBy(xpath = "//*[@id=\"splide01-slide02\"]/div/div[2]")
    private static WebElement kommentMarina;

    @FindBy(xpath = "//*[@id=\"splide01-slide03\"]/div/div[1]/div[1]")
    private static WebElement anna;

    @FindBy(xpath = "//*[@id=\"splide01-slide03\"]/div/div[2]")
    private static WebElement kommentAnna;

    @FindBy(xpath = "//*[@id=\"splide01\"]/div[1]/button[2]")
    private static WebElement bntCont;

    @FindBy(xpath = "//*[@id=\"splide01\"]/div[1]/button[1]")
    private static WebElement btnBack;

    public static String setNumber() {
        numberPeople.getText().trim();
        return "> 10.000 человек";
    }

        public static String setRezult() {
        rezult.getText().trim();
        return "добились невероятного результата!";
    }

    public static String setHvast() {
        hvast.getText().trim();
        return "Мы не хвастаемся. За нас это делают наши пользователи!";
    }

    public static String getOlga() {
        Olga.getText().trim();
        return "Ольга, 28 лет";
    }

    public static String getKat() {
        kat.getText().trim();
        return "Екатерина,";
    }

        public static String getKat32() {
        kat32.getText().trim();
        return "32 года";
    }

    public static String getKommitKat() {
        kommentKat.getText().trim();
        return "Этот курс изменил мою жизнь! Сочетание сбалансированного питания и практичных упражнений оказалось легким для соблюдения." +
                " Прошло 3 месяца, я сбросила 9,5 кг и чувствую себя сильной, как никогда. " +
                "Я искренне верю, что это путь к долговременному снижению веса.";
    }

    public static String getMarina() {
        marina.getText().trim();
        return "Марина, 40 лет";
    }

        public static String getKommitMarina() {
        kommentMarina.getText().trim();
        return "Эта программа реальна и направлена на результат! Мне понравилось, " +
                "что курс не требует кардинальных изменений, а предлагает маленькие, " +
                "достижимые шаги. Я сбросила вес, не чувствуя себя лишенной или перегруженной - это был " +
                "невероятно позитивный опыт.";
    }

    public static String getAnna() {
        anna.getText().trim();
        return "Анна, 35 лет";
    }

    public static String getKommitAnna() {
        kommentAnna.getText().trim();
        return "Я чувствую, что наконец-то нашла программу для похудения, которая " +
                "учитывает моё тело и мое время. Курс был понятным, простым " +
                "в освоении и очень мотивирующим. Я сбросила 5,5 кг, а главное " +
                "- я чувствую себя потрясающе как физически, так и морально.";
    }

    public static void clickBtnCont() {
        bntCont.click();
    }

    public static void clickBtnBack() {
        btnBack.click();
    }
}
