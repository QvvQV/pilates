package ru.tutor.page;

import com.github.dockerjava.api.model.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import static com.codeborne.selenide.Selenide.*;
//import static com.codeborne.selenide.Selenide.closeWebDriver;

public class Page4 extends Driver {

    public Page4(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[4]/div/div/div/div[1]/div/h3")
    private static WebElement Header4;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[4]/div/div/div/div[1]/div/div[2]/div[5]/button")
    private static WebElement Back3;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[4]/div/div/div/div[1]/div/div[2]/div[1]/label")
    private static WebElement Q4_1;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[4]/div/div/div/div[1]/div/div[2]/div[2]/label")
    private static WebElement Q4_2;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[4]/div/div/div/div[1]/div/div[2]/div[3]/label")
    private static WebElement Q4_3;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[4]/div/div/div/div[1]/div/div[2]/div[4]/label")
    private static WebElement Q4_4;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[4]/div/div/div/div[1]/div/div[2]/div[5]/div/div")
    private static WebElement Count;

    public static Object getHeader4() {
        Header4.getText().trim();
        return "Как часто вы готовы тренироваться?";
    }

    public static Object getQ4_1() {
        Q4_1.getText().trim();
        return "1 раз в неделю";
    }

    public static Object getQ4_2() {
        Q4_2.getText().trim();
        return "Несколько раз в неделю";
    }

    public static Object getQ4_3() {
        Q4_3.getText().trim();
        return "Каждый день";
    }

        public static Object getQ4_4() {
        Q4_4.getText().trim();
        return "Затрудняюсь ответить";
    }

    public static Object getCount() {
        Count.getText().trim();
        return "4/9";
    }

    public static void clickBack3() {
        Back3.click();
    }

        public static void clickQ4_1() {
        Q4_1.click();
    }

        public static void clickQ4_2() {
        Q4_2.click();
    }

        public static void clickQ4_3() {
        Q4_3.click();
    }

    public static void clickQ4_4() {
        Q4_4.click();
    }

    public static void PgDown4(){
        Back3.sendKeys(Keys.PAGE_DOWN);
    }

}
