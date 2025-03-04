package ru.tutor.page;

import com.github.dockerjava.api.model.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v131.indexeddb.model.Key;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import static com.codeborne.selenide.Selenide.*;
//import static com.codeborne.selenide.Selenide.closeWebDriver;

public class Body extends Driver {

    public Body(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[1]/div/div/div[2]/div[5]/div[1]/div/h3")
    private static WebElement NormKal;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[1]/div/div/div[2]/div[5]/div[5]/p")
    private static WebElement kkal;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[1]/div/div/div[2]/div[6]/div[1]/div/h3")
    private static WebElement Zone;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[1]/div/div/div[2]/div[6]/div[3]/div[1]/p")
    private static WebElement face;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[1]/div/div/div[2]/div[6]/div[3]/div[3]/p")
    private static WebElement stomach;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[1]/div/div/div[2]/div[6]/div[3]/div[4]/p")
    private static WebElement leg;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[1]/div/div/div[2]/div[6]/div[3]/div[2]/p")
    private static WebElement arms;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[1]/div/div/div[2]/div[5]/div[6]/h2")
    private static WebElement numberKkal;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[1]/div/div/div[2]/div[5]/div[6]/div[2]/div[1]/p[1]")
    private static WebElement zeroKkal;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[1]/div/div/div[2]/div[5]/div[6]/div[2]/div[1]/p[2]")
    private static WebElement nameZero;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[1]/div/div/div[2]/div[5]/div[6]/div[2]/div[2]/p[1]")
    private static WebElement fiveThousendKkal;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[1]/div/div/div[2]/div[5]/div[6]/div[2]/div[2]/p[2]")
    private static WebElement nameFive;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[2]/div/div/div[2]/div[1]/div[2]/div[1]")
    private static WebElement firstLesson;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[2]/div/div/div[2]/div[1]/div[2]/div[2]")
    private static WebElement vvedRaz;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[2]/div/div/div[2]/div[2]/div[2]/div[1]")
    private static WebElement secondLesson;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[2]/div/div/div[2]/div[2]/div[2]/div[2]")
    private static WebElement balanse;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[2]/div/div/div[1]/h2[1]/b")
    private static WebElement Programm;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[2]/div/div/div[1]/h2[1]")
    private static WebElement kurs;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[2]/div/div/div[1]/h2[2]")
    private static WebElement yourRoad;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[2]/div/div/div[1]/h2[2]")
    private static WebElement zdorFood;

    @FindBy(xpath = "//*[@id=\"mainFormaSubmitBtn\"]")
    private static WebElement btnPoluchit;


    public static void PageDownBtn(){
        btnPoluchit.sendKeys(Keys.PAGE_DOWN);
    }

    public static void EndBtn(){
        btnPoluchit.sendKeys(Keys.END);
    }

    public static void clickBtnPoluchit() {
        btnPoluchit.click();
    }
}