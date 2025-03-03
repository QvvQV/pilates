package ru.tutor.page;

import com.github.dockerjava.api.model.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import static com.codeborne.selenide.Selenide.*;
//import static com.codeborne.selenide.Selenide.closeWebDriver;

public class Page3 extends Driver {

    public Page3(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[3]/div/div/div/div[1]/div/h3")
    private static WebElement Header3;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[3]/div/div/div/div[1]/div/div[2]/div[5]/button")
    private static WebElement Back2;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[3]/div/div/div/div[1]/div/div[2]/div[1]/label")
    private static WebElement Q3_1;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[3]/div/div/div/div[1]/div/div[2]/div[2]")
    private static WebElement Q3_2;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[3]/div/div/div/div[1]/div/div[2]/div[3]")
    private static WebElement Q3_3;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[3]/div/div/div/div[1]/div/div[2]/div[4]")
    private static WebElement Q3_4;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[3]/div/div/div/div[1]/div/div[2]/div[5]/div/div")
    private static WebElement Count;

    public static Object getHeader3() {
        Header3.getText().trim();
        return "В какое время вам будет удобно тренироваться?";
    }

    public static Object getQ3_1() {
        Q3_1.getText().trim();
        return "Только утром";
    }

    public static Object getQ3_2() {
        Q3_2.getText().trim();
        return "Днем";
    }

    public static Object getQ3_3() {
        Q3_3.getText().trim();
        return "Только вечером";
    }

    public static Object getQ3_4() {
        Q3_4.getText().trim();
        return "Хочу тренироваться в любое время";
    }

    public static Object getCount() {
        Count.getText().trim();
        return "3/9";
    }

    public static void clickBack2() {
        Back2.click();
    }

    public static void clickQ3_1() {
        Q3_1.click();
    }

    public static void clickQ3_2() {
        Q3_2.click();
    }

    public static void clickQ3_3() {
        Q3_3.click();
    }

    public static void clickQ3_4() {
        Q3_4.click();
    }

    public static void PageDw() {
        Back2.sendKeys(Keys.PAGE_DOWN);
    }
}
