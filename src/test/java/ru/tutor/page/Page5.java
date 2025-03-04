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

public class Page5 extends Driver {

    public Page5(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[5]/div/div/div/div[1]/div/h3")
    private static WebElement Header5;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[5]/div/div/div/p")
    private static WebElement Header5_1;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[5]/div/div/div/button")
    private static WebElement Continue6;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[5]/div/div/div[2]/div[1]/div[3]/button[2]")
    private static WebElement disableBtn;

    @FindBy(tagName = "button")
    private static WebElement Btn;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[5]/div/div/div[2]/div[1]/div[2]/h2")
    private static WebElement Header6;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[5]/div/div/div[2]/div[1]/div[2]/p")
    private static WebElement Header6_1;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[5]/div/div/div/div[1]/div/div[2]/div[1]/label")
    private static WebElement Q6_1;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[5]/div/div/div/div[1]/div/div[2]/div[2]/label")
    private static WebElement Q6_2;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[5]/div/div/div/div[1]/div/div[2]/div[3]/label")
    private static WebElement Q6_3;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[5]/div/div/div/div[1]/div/div[2]/div[3]/label")
    private static WebElement Q6_4;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[5]/div/div/div/div[1]/div/div[2]/div[4]/button")
    private static WebElement Back4;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[5]/div/div/div/div[1]/div/div[2]/div[4]/div/div")
    private static WebElement Count;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[5]/div/div/div[2]/div[1]/div[3]/button[2]")
    private static WebElement Continue7;

    public static Object getHeader5() {
        Header5.getText().trim();
        return "Чего вы хотите добиться от тренировок?";
    }

    public static Object getQ6_1() {
        Q6_1.getText().trim();
        return "Подтянутой формы / плоский живот";
    }

    public static Object getQ6_2() {
        Q6_2.getText().trim();
        return "Поддерживать свое здоровье";
    }

    public static Object getQ6_3() {
        Q6_3.getText().trim();
        return "Привлекать внимание мужчин";
    }

    public static Object getQ6_4() {
        Q6_4.getText().trim();
        return "Привлекать внимание женщин";
    }

    public static Object getCount() {
        Count.getText().trim();
        return "5/9";
    }

    public static void clickBack4() {
        Back4.click();
    }

    public static void clickQ6_1() {
        Q6_1.click();
    }

    public static void clickQ6_2() {
        Q6_2.click();
    }

    public static void clickQ6_3() {
        Q6_3.click();
    }

    public static void clickQ6_4() {
        Q6_4.click();
    }

    public static WebElement chechBtn() {
        Btn.getAttribute("disabled");
        return Btn;
    }

    public static void PageDown5(){
        Back4.sendKeys(Keys.PAGE_DOWN);
    }

//    public static boolean chechDisBtn(){
//        if(Objects.equals(chechBtn(), "disabled")){
//            return false;
//        } else return disableBtn.isEnabled();
//    }
}
