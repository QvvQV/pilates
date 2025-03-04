package ru.tutor.page;

import com.github.dockerjava.api.model.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import static com.codeborne.selenide.Selenide.*;
//import static com.codeborne.selenide.Selenide.closeWebDriver;

public class Loader extends Driver {

    public Loader(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[11]/section/div[1]/div/div/div[1]/h2[1]")
    private static WebElement Header14;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[11]/section/div[1]/div/div/div[1]/h2[2]")
    private static WebElement Header14_1;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[11]/section/div[1]/div/div/div[2]/div[1]/div[1]/h3")
    private static WebElement Header14_3;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[11]/section/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/div[1]/p")
    private static WebElement oneWeek;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[11]/section/div[1]/div/div/div[2]/div[1]/div[2]/div[2]/div[1]/p")
    private static WebElement twoWeek;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[11]/section/div[1]/div/div/div[2]/div[1]/div[2]/div[3]/div[1]/p")
    private static WebElement threeWeek;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[11]/section/div[1]/div/div/div[2]/div[1]/div[2]/div[4]/div[1]/p")
    private static WebElement fourWeek;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[11]/section/div[1]/div/div/div[2]/div[1]/a")
    private static WebElement openAll;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[11]/section/div[1]/div/div/div[2]/div[2]/div[1]")
    private static WebElement IMT;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[11]/section/div[1]/div/div/div[2]/div[2]/p")
    private static WebElement FourWeekIMT;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[11]/section/div[1]/div/div/div[2]/div[2]/a")
    private static WebElement NormIMT;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[11]/section/section[1]/div/div/div[2]/div[3]/div[1]/div/h3")
    private static WebElement MetAge;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[11]/section/section[1]/div/div/div[2]/div[3]/div[2]/div[1]/p/b")
    private static WebElement met;

    @FindBy(id = "ageMeta")
    private static WebElement AgeMeta;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[11]/section/section[1]/div/div/div[2]/div[3]/div[2]/div[2]/p/b")
    private static WebElement fact;

    @FindBy(id = "ageFact")
    private static WebElement ageFact;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[11]/section/section[1]/div/div/div[2]/div[4]/div[1]/div/h3")
    private static WebElement Water;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[11]/section/section[1]/div/div/div[2]/div[4]/div[5]/p")
    private static WebElement numberWater;

    @FindBy(id = "load-percentage")
    private static WebElement Load;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[11]/section/div/div/div[1]/div[1]")
    private static WebElement all;

//    public static Object getTextLoad() {
//        return Load.getText().trim();
//    }

    public static Object getHeader14() {
        Header14.getText().trim();
        return "Поздравляем!";
    }

    public static Object getHeader14_1() {
        Header14_1.getText().trim();
        return "Вы на шаг ближе к шикарному телу!";
    }

    public static Object getHeader14_3() {
        Header14_3.getText().trim();
        return "Ваша программа тренировок готова!";
    }

    public static Object getOneWeek() {
        oneWeek.getText().trim();
        return "Неделя 1";
    }

    public static Object getTwoWeek() {
        twoWeek.getText().trim();
        return "Неделя 2";
    }

    public static Object getThreeWeek() {
        threeWeek.getText().trim();
        return "Неделя 3";
    }

    public static Object getFourWeek() {
        fourWeek.getText().trim();
        return "Неделя 4";
    }

    public static Object getOpen() {
        openAll.getText().trim();
        return "Открыть все!";
    }

    public static void clickBtn(){
        openAll.click();
    }

    public static Object getIMT() {
        IMT.getText().trim();
        return "Ваш ИМТ";
    }

    public static Object getIMTWeek() {
        FourWeekIMT.getText().trim();
        return "через 4 недели, следуя дневнику питания";
    }

    public static Object getIMTnorm() {
        NormIMT.getText().trim();
        return "Норма";
    }
}