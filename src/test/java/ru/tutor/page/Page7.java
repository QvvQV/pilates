package ru.tutor.page;

import com.github.dockerjava.api.model.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import static com.codeborne.selenide.Selenide.*;
//import static com.codeborne.selenide.Selenide.closeWebDriver;

public class Page7 extends Driver {

    public Page7(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[7]/div/div/div/div[1]/div/h3")
    private static WebElement Header7;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[7]/div/div/div/div[1]/div/div[2]/div[4]/button")
    private static WebElement Back6;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[7]/div/div/div/div[1]/div/div[2]/div[1]/label")
    private static WebElement Q7_1;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[7]/div/div/div/div[1]/div/div[2]/div[2]/label")
    private static WebElement Q7_2;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[7]/div/div/div/div[1]/div/div[2]/div[3]/label")
    private static WebElement Q7_3;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[7]/div/div/div[2]/div[1]/div[2]/div[4]/label")
    private static WebElement Q7_4;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[7]/div/div/div/div[1]/div/div[2]/div[4]/div/div")
    private static WebElement Count;

    public static Object getHeader7() {
        Header7.getText().trim();
        return "Был ли у вас когда-нибудь желаемый вес?";
    }

    public static Object getQ7_1() {
        Q7_1.getText().trim();
        return "Да, более года назад";
    }

    public static Object getQ7_2() {
        Q7_2.getText().trim();
        return "Да, недавно";
    }

    public static Object getQ7_3() {
        Q7_3.getText().trim();
        return "Нет, хочу прийти к этому";
    }

    public static Object getCount() {
        Count.getText().trim();
        return "7/9";
    }

    public static void clickBack6() {
        Back6.click();
    }

    public static void PgDn7(){
        Back6.sendKeys(Keys.PAGE_DOWN);
    }

        public static void clickQ7_1() {
        Q7_1.click();
    }

        public static void clickQ7_2() {
        Q7_2.click();
    }

        public static void clickQ7_3() {
        Q7_3.click();
    }

    public static void clickQ7_4() {
        Q7_4.click();
    }

}
