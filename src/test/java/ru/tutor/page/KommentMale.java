package ru.tutor.page;

import com.github.dockerjava.api.model.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import static com.codeborne.selenide.Selenide.*;
//import static com.codeborne.selenide.Selenide.closeWebDriver;

public class KommentMale extends Driver {

    public KommentMale(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[11]/section/section/div/div/div[1]")
    private static WebElement numberPeople;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[11]/section/section/div/div/div[1]")
    private static WebElement rezult;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[11]/section/section/div/div/div[2]/p")
    private static WebElement hvast;

    @FindBy(xpath = "//*[@id=\"splide02-slide01\"]/div/div[1]")
    private static WebElement Nikita;

    @FindBy(xpath = "//*[@id=\"splide02-slide01\"]/div/div[2]")
    private static WebElement komentNikita;

    @FindBy(xpath = "//*[@id=\"splide02-slide02\"]/div/div[1]/div[1]")
    private static WebElement Sergey;

    @FindBy(xpath = "//*[@id=\"splide02-slide02\"]/div/div[1]/div[1]")
    private static WebElement Sergey33;

    @FindBy(xpath = "//*[@id=\"splide02-slide02\"]/div/div[2]")
    private static WebElement kommentSerg;

    @FindBy(xpath = "//*[@id=\"splide02-slide03\"]/div/div[1]/div[1]")
    private static WebElement Alex;

    @FindBy(xpath = "//*[@id=\"splide02-slide03\"]/div/div[2]")
    private static WebElement kommentAlex;

    @FindBy(xpath = "//*[@id=\"slick-slide10\"]/div[2]/h3")
    private static WebElement anna;

    @FindBy(xpath = "//*[@id=\"slick-slide10\"]/div[2]")
    private static WebElement kommentAnna;

    @FindBy(xpath = "//*[@id=\"splide02\"]/div[1]/button[2]")
    private static WebElement bntCont;

    @FindBy(xpath = "//*[@id=\"splide02\"]/div[1]/button[1]")
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

    public static String getNikita() {
        Nikita.getText().trim();
        return "Никита, 29 лет";
    }

    public static String getKommitNikita() {
        komentNikita.getText().trim();
        return "Я перепробовал многие тренировки но эта программа " +
                "изменила моё отношение к спорту. Я наконец-то достиг своих целей! Хотел похудеть и начать наращивать " +
                "мышечную массу. Начал сбрасывать вес уже в первые недели занятий. Начинаю строить тело своей мечты))";
    }

    public static String getSergey() {
        Sergey.getText().trim();
        return "Сергей, ";
    }

        public static String getSergey33() {
        Sergey33.getText().trim();
        return "33 года";
    }

    public static String getKommitSerg() {
        kommentSerg.getText().trim();
        return "Просто отличный курс! Я был поражён своим прогрессом всего за несколько недель. " +
                "Профессиональная программа тренировок действительно работает. Я чувствую себя сильнее и " +
                "увереннее, чем когда-либо! Это было отличное вложение в себя)";
    }

    public static String getAlex() {
        Alex.getText().trim();
        return "Алексей, 27 лет";
    }

        public static String getKommitAlex() {
        kommentAlex.getText().trim();
        return "Советую этот курс! Упражнения разнообразные и эффективные, план тренировок вписался в мой ритм жизни." +
                " Автор очень грамотный, объясняет всё доступно. " +
                "Результатом доволен, лишний вес уходит, осанка стала гораздо лучше. Рекомендую всем!";
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
