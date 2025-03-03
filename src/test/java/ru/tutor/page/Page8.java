package ru.tutor.page;

import com.github.dockerjava.api.model.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Objects;
//import static com.codeborne.selenide.Selenide.*;
//import static com.codeborne.selenide.Selenide.closeWebDriver;

public class Page8 extends Driver {

    public Page8(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[8]/div/div/div/div[1]/div/h3")
    private static WebElement Header7_1;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[9]/div/div/div/p")
    private static WebElement Header7_2;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[9]/div/div/div/button")
    private static WebElement Continue8;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[8]/div/div/div/div[1]/div/h3")
    private static WebElement Header8;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[8]/div/div/div/div[1]/div/div[2]/div[1]/label")
    private static WebElement Q8_1;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[8]/div/div/div/div[1]/div/div[2]/div[2]/label")
    private static WebElement Q8_2;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[8]/div/div/div/div[1]/div/div[2]/div[3]/label")
    private static WebElement Q8_3;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[8]/div/div/div/div[1]/div/div[2]/div[4]/label")
    private static WebElement Q8_4;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[8]/div/div/div/div[1]/div/div[2]/div[5]/button")
    private static WebElement Back7;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[8]/div/div/div/div[1]/div/div[2]/div[5]/div/div")
    private static WebElement Count;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[8]/div/div/div[2]/div[1]/div[3]/button[2]")
    private static WebElement Continue7;


    public static Object getHeader8() {
        Header8.getText().trim();
        return "На какие зоны хотите сделать акцент?";
    }

    public static Object getQ8_1() {
        Q8_1.getText().trim();
        return "Пресс и талия";
    }

    public static Object getQ8_2() {
        Q8_2.getText().trim();
        return "Ягодицы и ноги";
    }

    public static Object getQ8_3() {
        Q8_3.getText().trim();
        return "Спина и осанка";
    }

    public static Object getQ8_4() {
        Q8_4.getText().trim();
        return "Всё тело";
    }

    public static Object getCount() {
        Count.getText().trim();
        return "8/9";
    }

    public static void clickBack7() {
        Back7.click();
    }

        public static void PgDn8(){
        Back7.sendKeys(Keys.PAGE_DOWN);
    }

    public static void clickQ8_1() {
        Q8_1.click();
    }

    public static void clickQ8_2() {
        Q8_2.click();
    }

    public static void clickQ8_3() {
        Q8_3.click();
    }

    public static void clickQ8_4() {
        Q8_4.click();
    }

}
