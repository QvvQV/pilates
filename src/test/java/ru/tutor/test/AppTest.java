package ru.tutor.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.tutor.page.*;

import java.time.Duration;

import static java.lang.Thread.sleep;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

//import static org.graalvm.compiler.nodeinfo.InputType.Condition;
//import static com.codeborne.selenide.Selenide.*;
//import static com.codeborne.selenide.Selenide.open;

public class AppTest {

    public static WebDriver driver;
    public static String url = "https://pilatesw.tutorplace.ru/";

    @Before
    public void setupAll() {
        driver = new ChromeDriver();
        Page1 Page1 = new Page1(driver);
        PageVTwo PageVTwo = new PageVTwo(driver);
        PageVThree PageVThree = new PageVThree(driver);
        PageVFour PageVFour = new PageVFour(driver);
        Page2 Page2 = new Page2(driver);
        Page3 Page3 = new Page3(driver);
        Page4 Page4 = new Page4(driver);
        Page5 Page5 = new Page5(driver);
        Page6 Page6 = new Page6(driver);
        Page7 Page7 = new Page7(driver);
        Page8 Page8 = new Page8(driver);
        Page10 Page10 = new Page10(driver);
        Loader Loader = new Loader(driver);
        Body Body = new Body(driver);
        KommentFemale komment = new KommentFemale(driver);
        KommentMale Komment = new KommentMale(driver);
        Pay Pay = new Pay(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get(url);
    }


    @After
    public void quitDriver() {
        driver.close();
    }

    @Test
    @DisplayName("Should get text First page")
    public void ShouldGetTextFirstPage() {

        Assert.assertEquals("- 5кг в неделю", Page1.getFive());
//        Assert.assertEquals("в неделю", Page1.getWeek());
        Assert.assertEquals("лежа дома на ковре!", Page1.getHome());
        Assert.assertEquals("Пройдите тест и получите персональный план пилатеса для похудения", Page1.getPerson());
        Assert.assertEquals("Тест займет не более 2 минут!", Page1.getTwoMinute());
        Assert.assertEquals("Укажите свой пол:", Page1.setmFM());
        Assert.assertEquals("1/9", Page1.getNumber());
        Assert.assertEquals("Женский", Page1.getFemale());
        Assert.assertEquals("Мужской", Page1.getMale());
        Assert.assertEquals("здоровая спина", Page1.getBack());
        Assert.assertEquals("крепкие мышцы", Page1.getMuskuls());
        Assert.assertEquals("похудение", Page1.getWeight());
    }

    @Test
    @DisplayName("Should get func First page + text Two")
    public void ShouldGetFuncFirstPage() throws InterruptedException {

        Page1.clickFemale();
        Assert.assertEquals("Как вы оцениваете свой уровень физической подготовки?", Page2.getHeader2());
        Assert.assertEquals("2/9", Page2.getCount());
        Assert.assertEquals("Никогда не занималась", Page2.getQ2_1F());
        Page2.PageDw();
        Assert.assertEquals("Продвинутый", Page2.getQ2_4());
        sleep(200);
        Page2.clickBack1();
        Assert.assertEquals("- 5кг в неделю", Page1.getFive());
        Page1.clickMale();
        Assert.assertEquals("Никогда не занимался", Page2.getQ2_1()); // принадлежность к полу
        Assert.assertEquals("Начинающий", Page2.getQ2_2());
        Assert.assertEquals("Средний", Page2.getQ2_3());

    }

    @Test
    @DisplayName("Should get funct Two page + text Three")

    public void ShouldGetFunctTwotPage() throws InterruptedException {

        Page1.clickMale();
        Page2.clickQ2_1();
        Assert.assertEquals("В какое время вам будет удобно тренироваться?", Page3.getHeader3());
        Assert.assertEquals("3/9", Page3.getCount());
        Page3.PageDw();
        sleep(200);
        Page3.clickBack2();
        Assert.assertEquals("Как вы оцениваете свой уровень физической подготовки?", Page2.getHeader2());
        Page2.clickQ2_2();
        Assert.assertEquals("Только утром", Page3.getQ3_1());
        Assert.assertEquals("Днем", Page3.getQ3_2());
//        Page3.PageDw();
        Assert.assertEquals("Хочу тренироваться в любое время", Page3.getQ3_4());
        sleep(200);
        Page3.clickBack2();
        Page2.clickQ2_3();
        Assert.assertEquals("Только вечером", Page3.getQ3_3());
//        Page3.PageDw();
//        sleep(200);
        Page3.clickBack2();
        Page2.PageDw();
        Page2.clickQ2_4();

    }

    @Test
    @DisplayName("Should get funct Three page + text Fourth")

    public void ShouldGetFunctThreePage() throws InterruptedException {

        Page1.clickMale();
        Page2.clickQ2_1();
        Page3.clickQ3_1();
        Assert.assertEquals("Как часто вы готовы тренироваться?", Page4.getHeader4());
        Assert.assertEquals("4/9", Page4.getCount());
        Page4.PgDown4();
        sleep(200);
        Page4.clickBack3();
        Assert.assertEquals("В какое время вам будет удобно тренироваться?", Page3.getHeader3());
        Page3.clickQ3_2();
        Assert.assertEquals("1 раз в неделю", Page4.getQ4_1());
        Assert.assertEquals("Несколько раз в неделю", Page4.getQ4_2());
        Page4.clickBack3();
        Page3.clickQ3_3();
        Assert.assertEquals("Каждый день", Page4.getQ4_3());
        Assert.assertEquals("Затрудняюсь ответить", Page4.getQ4_4());
        Page4.clickBack3();
        Page3.clickQ3_4();
        Assert.assertEquals("Как часто вы готовы тренироваться?", Page4.getHeader4());
    }

    @Test
    @DisplayName("Should get func Fourth page + text Five")

    public void ShouldGetFuncFourthPage() throws InterruptedException {

        Page1.clickMale();
//        Page1.clickFemale();
        Page2.clickQ2_1();
        Page3.clickQ3_1();
        Page4.clickQ4_1();
        Assert.assertEquals("Чего вы хотите добиться от тренировок?", Page5.getHeader5());
        Page5.PageDown5();
        sleep(200);
        Page5.clickBack4();
        Assert.assertEquals("Как часто вы готовы тренироваться?", Page4.getHeader4());
        Page4.clickQ4_2();
        Assert.assertEquals("Подтянутой формы / плоский живот", Page5.getQ6_1());
        Assert.assertEquals("Поддерживать свое здоровье", Page5.getQ6_2());
        Page5.clickBack4();
        Page4.clickQ4_3();
        Assert.assertEquals("Привлекать внимание женщин", Page5.getQ6_4());
//        Assert.assertEquals("Привлекать внимание мужчин", Page5.getQ6_3());
        Page5.clickBack4();
        Page4.clickQ4_4();
        Assert.assertEquals("5/9", Page5.getCount());
    }

    @Test
    @DisplayName("Should get func Five page + text Six")

    public void ShouldGetFuncFivePage() throws InterruptedException {

        Page1.clickMale();
        Page2.clickQ2_1();
        Page3.clickQ3_1();
        Page4.clickQ4_1();
        Page5.clickQ6_1();
        Assert.assertEquals("Насколько легко у вас уходит лишний вес?", Page6.getHeader6());
        Page6.PgDn6();
        sleep(200);
        Page6.clickBack5();
        Page5.clickQ6_2();
        Assert.assertEquals("Очень сложно", Page6.getQ6_1());
        Assert.assertEquals("Довольно сложно", Page6.getQ6_2());
        Assert.assertEquals("При должных условиях уходит легко", Page6.getQ6_3());
        Assert.assertEquals("Вес уходит без усилий", Page6.getQ6_4());
        Page6.clickBack5();
        Page5.clickQ6_3();
        Assert.assertEquals("6/9", Page6.getCount());
    }

    @Test
    @DisplayName("Should get text Seven page")

    public void ShouldGetTextSevenPage() {

        Page1.clickMale();
        Page2.clickQ2_1();
        Page3.clickQ3_1();
        Page4.clickQ4_1();
        Page5.clickQ6_1();
        Page6.clickQ6_1();
        Assert.assertEquals("Был ли у вас когда-нибудь желаемый вес?", Page7.getHeader7());
        Assert.assertEquals("Да, более года назад", Page7.getQ7_1());
        Assert.assertEquals("Да, недавно", Page7.getQ7_2());
        Assert.assertEquals("Нет, хочу прийти к этому", Page7.getQ7_3());
        Assert.assertEquals("7/9", Page7.getCount());
    }

    @Test
    @DisplayName("Should get func Seven text eight page")

    public void ShouldGetFuncSevenPage() {

        Page1.clickMale();
        Page2.clickQ2_1();
        Page3.clickQ3_1();
        Page4.clickQ4_1();
        Page5.clickQ6_1();
        Page6.clickQ6_1();
        Page7.clickQ7_1();
        Assert.assertEquals("На какие зоны хотите сделать акцент?", Page8.getHeader8());
        Page8.clickBack7();
        Page7.clickQ7_2();
        Assert.assertEquals("Пресс и талия", Page8.getQ8_1());
        Assert.assertEquals("Ягодицы и ноги", Page8.getQ8_2());
        Page8.clickBack7();
        Page7.clickQ7_3();
        Assert.assertEquals("Спина и осанка", Page8.getQ8_3());
        Assert.assertEquals("Всё тело", Page8.getQ8_4());
        Assert.assertEquals("8/9", Page8.getCount());
    }

    @Test
    @DisplayName("Should get func Nine page + text Ten Page")

    public void ShouldGetFuncNinePage() throws InterruptedException {

        Page1.clickMale();
        Page2.clickQ2_1();
        Page3.clickQ3_1();
        Page4.clickQ4_1();
        Page5.clickQ6_1();
        Page6.clickQ6_1();
        Page7.clickQ7_1();
        Page8.clickQ8_1();
        Assert.assertEquals("Укажите свои параметры", Page10.getHeader10());
        Page10.clickBack8();
        Page8.clickQ8_2();
        Assert.assertEquals("9/9", Page10.getCount());
        Page10.clickBack8();
        Page8.clickQ8_3();
        Assert.assertEquals("Далее", Page10.getContinue11());
        Assert.assertEquals("Возраст", Page10.getQ10_2());
        Assert.assertEquals("Рост", Page10.getQ10_1());
        Assert.assertEquals("Вес", Page10.getQ10_3());
        Page10.clickBack8();
        Page8.clickQ8_4();
        Assert.assertEquals("Желаемый вес", Page10.getQ10_4());
        Assert.assertEquals(false, Page10.chechDisBtn());
    }

    @Test
    @DisplayName("Should get funct ten page Disable1")
    public void ShouldFunctTenPageDisable1() {
        Page1.clickMale();
        Page2.clickQ2_1();
        Page3.clickQ3_1();
        Page4.clickQ4_1();
        Page5.clickQ6_1();
        Page6.clickQ6_1();
        Page7.clickQ7_1();
        Page8.clickQ8_1();
        Assert.assertEquals("Укажите свои параметры", Page10.getHeader10());

        Page10.send39KeysQ10_2();
        Assert.assertEquals("rgba(255, 0, 0, 1)", Page10.getItemQ10_2());
        Page10.send119KeysQ10_1();
        Assert.assertEquals("rgba(255, 0, 0, 1)", Page10.getItemQ10_1());
        Page10.send39KeysQ10_3();
        Assert.assertEquals("rgba(255, 0, 0, 1)", Page10.getItemQ10_3());
        Page10.send100KeysQ10_4();
        Assert.assertEquals("rgba(255, 0, 0, 1)", Page10.getItemQ10_4());
        Assert.assertEquals(false, Page10.chechDisBtn());
        Page10.clickContinue11();
    }

    @Test
    @DisplayName("Should get funct ten page Disable2")
    public void ShouldFunctTenPageDisable2() {
        Page1.clickMale();
        Page2.clickQ2_1();
        Page3.clickQ3_1();
        Page4.clickQ4_1();
        Page5.clickQ6_1();
        Page6.clickQ6_1();
        Page7.clickQ7_1();
        Page8.clickQ8_1();
        Assert.assertEquals("Укажите ваши параметры", Page10.getHeader10());
        Page10.send401KeysQ10_2();
        Assert.assertEquals("rgba(255, 0, 0, 1)", Page10.getItemQ10_2());
        Page10.send251KeysQ10_1();
        Assert.assertEquals("rgba(255, 0, 0, 1)", Page10.getItemQ10_1());
        Page10.send401KeysQ10_3();
        Assert.assertEquals("rgba(255, 0, 0, 1)", Page10.getItemQ10_3());
        Page10.send17KeysQ10_4();
        Assert.assertEquals("rgba(255, 0, 0, 1)", Page10.getItemQ10_4());
        Assert.assertEquals(false, Page10.chechDisBtn());
        Page10.clickContinue11();
    }

    @Test
    @DisplayName("Should get funct ten page Ebale1")
    public void ShouldFunctTenPageEbale1() {
        Page1.clickMale();
        Page2.clickQ2_1();
        Page3.clickQ3_1();
        Page4.clickQ4_1();
        Page5.clickQ6_1();
        Page6.clickQ6_1();
        Page7.clickQ7_1();
        Page8.clickQ8_1();
        Assert.assertEquals("Укажите ваши параметры", Page10.getHeader10());
        Page10.send120KeysQ10_1();
        Assert.assertEquals("rgba(0, 128, 0, 1)", Page10.getItemQ10_2());
        Page10.send40KeysQ10_2();
        Assert.assertEquals("rgba(0, 128, 0, 1)", Page10.getItemQ10_1());
        Page10.send40KeysQ10_3();
        Assert.assertEquals("rgba(0, 128, 0, 1)", Page10.getItemQ10_3());
        Page10.send18KeysQ10_4();
        Assert.assertEquals("rgba(0, 128, 0, 1)", Page10.getItemQ10_4());
        Assert.assertEquals(true, Page10.chechDisBtn());
        Page10.clickContinue11();
    }

    @Test
    @DisplayName("Should get funct ten page Ebale2")
    public void ShouldFunctTenPageEbale2() {
        Page1.clickMale();
        Page2.clickQ2_1();
        Page3.clickQ3_1();
        Page4.clickQ4_1();
        Page5.clickQ6_1();
        Page6.clickQ6_1();
        Page7.clickQ7_1();
        Page8.clickQ8_1();
        Assert.assertEquals("Укажите ваши параметры", Page10.getHeader10());
        Page10.send250KeysQ10_1();
        Assert.assertEquals("rgba(0, 128, 0, 1)", Page10.getItemQ10_2());
        Page10.send400KeysQ10_2();
        Assert.assertEquals("rgba(0, 128, 0, 1)", Page10.getItemQ10_1());
        Page10.send400KeysQ10_3();
        Assert.assertEquals("rgba(0, 128, 0, 1)", Page10.getItemQ10_3());
        Page10.send99KeysQ10_4();
        Assert.assertEquals("rgba(0, 128, 0, 1)", Page10.getItemQ10_4());
        Assert.assertEquals(true, Page10.chechDisBtn());
        Page10.clickContinue11();
    }

    @Test
    @DisplayName("Should get funct ten page Ebale1+Dis1")
    public void ShouldFunctTenPageEbale1Dis1() {
        Page1.clickMale();
        Page2.clickQ2_1();
        Page3.clickQ3_1();
        Page4.clickQ4_1();
        Page5.clickQ6_1();
        Page6.clickQ6_1();
        Page7.clickQ7_1();
        Page8.clickQ8_1();
        Assert.assertEquals("Укажите ваши параметры", Page10.getHeader10());
        Page10.send39KeysQ10_2();
        Page10.send120KeysQ10_1();
        Page10.send39KeysQ10_3();
        Page10.send100KeysQ10_4();
        Assert.assertEquals(false, Page10.chechDisBtn());
        Page10.clickContinue11();
    }

    @Test
    @DisplayName("Should get funct ten page Ebale1+Dis1")
    public void ShouldFunctTenPageEbale2Dis2() {
        Page1.clickMale();
        Page2.clickQ2_1();
        Page3.clickQ3_1();
        Page4.clickQ4_1();
        Page5.clickQ6_1();
        Page6.clickQ6_1();
        Page7.clickQ7_1();
        Page8.clickQ8_1();
        Assert.assertEquals("Укажите ваши параметры", Page10.getHeader10());
        Page10.send251KeysQ10_1();
        Page10.send40KeysQ10_2();
        Page10.send40KeysQ10_3();
        Page10.send17KeysQ10_4();
        Assert.assertEquals(false, Page10.chechDisBtn());
        Page10.clickContinue11();
    }

    @Test
    @DisplayName("Should get funct Loader page")
    public void ShouldFunctLoaderPage() {
        Page1.clickMale();
        Page2.clickQ2_1();
        Page3.clickQ3_1();
        Page4.clickQ4_1();
        Page5.clickQ6_1();
        Page6.clickQ6_1();
        Page7.clickQ7_1();
        Page8.clickQ8_1();
        Page10.send120KeysQ10_1();
        Page10.send40KeysQ10_2();
        Page10.send40KeysQ10_3();
        Page10.send18KeysQ10_4();
        Page10.clickContinue11();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6000));
        wait.until(visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/main/div/section[14]/section/div/div/div[1]/div[1]/h2")));

        Assert.assertEquals("Поздравляем!", Loader.getHeader14());
        Assert.assertEquals("Вы на шаг ближе к шикарному телу!", Loader.getHeader14_1());
        Assert.assertEquals("Ваша программа тренировок готова!", Loader.getHeader14_3());
        Assert.assertEquals("Неделя 1", Loader.getOneWeek());
        Assert.assertEquals("Неделя 2", Loader.getTwoWeek());
        Assert.assertEquals("Неделя 3", Loader.getThreeWeek());
        Assert.assertEquals("Неделя 4", Loader.getFourWeek());
        Assert.assertEquals("Ваш ИМТ", Loader.getIMT());
        Assert.assertEquals("через 4 недели, следуя дневнику питания", Loader.getIMTWeek());
        Assert.assertEquals("Норма", Loader.getIMTnorm());
        Assert.assertEquals("Открыть все!", Loader.getOpen());
    }

    @Test
    @DisplayName("Should get funct Loader-Komment Female page")
    public void ShouldFunctLoaderKommentFemale() throws InterruptedException {
        Page1.clickFemale();
        Page2.clickQ2_1();
        Page3.clickQ3_1();
        Page4.clickQ4_1();
        Page5.clickQ6_1();
        Page6.clickQ6_1();
        Page7.clickQ7_1();
        Page8.clickQ8_1();
        Page10.send120KeysQ10_1();
        Page10.send40KeysQ10_2();
        Page10.send40KeysQ10_3();
        Page10.send18KeysQ10_4();
        Page10.clickContinue11();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6000));
        wait.until(visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/main/div/section[14]/section/div/div/div[1]/div[2]/h3")));
        Body.PageDownBtn();
//        Body.PageDownBtn();
//        Body.PageDownBtn();
        sleep(1000);
//        Body.PageDownBtn();
//        Body.PageDownBtn();
        Assert.assertEquals("> 10.000 человек", KommentFemale.setNumber());
        Assert.assertEquals("добились невероятного результата!", KommentFemale.setRezult());
        Assert.assertEquals("Мы не хвастаемся. За нас это делают наши пользователи!", KommentFemale.setHvast());
        Body.PageDownBtn();
        Assert.assertEquals("Ольга, 28 лет", KommentFemale.getOlga());
        Assert.assertEquals("Я перепробовала множество программ для похудения, но эта уникальна! Курс не только помог мне избавиться от упорных килограммов, но научил устойчивым привычкам, которые я смогу сохранить на всю жизнь. Я чувствую себя здоровой, уверенной и полной энергии каждый день!", KommentFemale.getKommitOlgal());
        Assert.assertEquals("Екатерина,", KommentFemale.getKat());
        Assert.assertEquals("32 года", KommentFemale.getKat32());
        Assert.assertEquals("Этот курс изменил мою жизнь! Сочетание сбалансированного питания и практичных упражнений оказалось легким для соблюдения. Прошло 3 месяца, я сбросила 9,5 кг и чувствую себя сильной, как никогда. Я искренне верю, что это путь к долговременному снижению веса.", KommentFemale.getKommitKat());
        sleep(1000);
        Assert.assertEquals("Марина, 40 лет", KommentFemale.getMarina());
        Assert.assertEquals("Эта программа реальна и направлена на результат! Мне понравилось, что курс не требует кардинальных изменений, а предлагает маленькие, достижимые шаги. Я сбросила вес, не чувствуя себя лишенной или перегруженной - это был невероятно позитивный опыт.", KommentFemale.getKommitMarina());
        KommentFemale.clickBtnCont();
        Assert.assertEquals("Анна, 35 лет", KommentFemale.getAnna());
        Assert.assertEquals("Я чувствую, что наконец-то нашла программу для похудения, которая учитывает моё тело и мое время. Курс был понятным, простым в освоении и очень мотивирующим. Я сбросила 5,5 кг, а главное - я чувствую себя потрясающе как физически, так и морально.", KommentFemale.getKommitAnna());
        KommentFemale.clickBtnBack();
        Assert.assertEquals("Ольга, 28 лет", KommentFemale.getOlga());
        KommentFemale.clickBtnBack();
        Assert.assertEquals("Марина, 40 лет", KommentFemale.getMarina());
    }

        @Test
    @DisplayName("Should get funct Loader-Komment Male page")
    public void ShouldFunctLoaderKommentMale() throws InterruptedException {
        Page1.clickMale();
        Page2.clickQ2_1();
        Page3.clickQ3_1();
        Page4.clickQ4_1();
        Page5.clickQ6_1();
        Page6.clickQ6_1();
        Page7.clickQ7_1();
        Page8.clickQ8_1();
        Page10.send120KeysQ10_1();
        Page10.send40KeysQ10_2();
        Page10.send40KeysQ10_3();
        Page10.send18KeysQ10_4();
        Page10.clickContinue11();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6000));
        wait.until(visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/main/div/section[14]/section/div/div/div[1]/div[2]/h3")));
        Body.PageDownBtn();
//        Body.PageDownBtn();
//        Body.PageDownBtn();
        sleep(1000);
//        Body.PageDownBtn();
//        Body.PageDownBtn();
        Assert.assertEquals("> 10.000 человек", KommentMale.setNumber());
        Assert.assertEquals("добились невероятного результата!", KommentMale.setRezult());
        Assert.assertEquals("Мы не хвастаемся. За нас это делают наши пользователи!", KommentMale.setHvast());
        Body.PageDownBtn();
        Assert.assertEquals("Никита, 29 лет", KommentMale.getNikita());
        Assert.assertEquals("Я перепробовал многие тренировки но эта программа изменила моё отношение к спорту. Я наконец-то достиг своих целей! Хотел похудеть и начать наращивать мышечную массу. Начал сбрасывать вес уже в первые недели занятий. Начинаю строить тело своей мечты))", KommentMale.getKommitNikita());
        Assert.assertEquals("Сергей, ", KommentMale.getSergey());
        Assert.assertEquals("33 года", KommentMale.getSergey33());
        Assert.assertEquals("Просто отличный курс! Я был поражён своим прогрессом всего за несколько недель. Профессиональная программа тренировок действительно работает. Я чувствую себя сильнее и увереннее, чем когда-либо! Это было отличное вложение в себя)", KommentMale.getKommitSerg());
        sleep(1000);
        Assert.assertEquals("Алексей, 27 лет", KommentMale.getAlex());
        Assert.assertEquals("Советую этот курс! Упражнения разнообразные и эффективные, план тренировок вписался в мой ритм жизни. Автор очень грамотный, объясняет всё доступно. Результатом доволен, лишний вес уходит, осанка стала гораздо лучше. Рекомендую всем!", KommentMale.getKommitAlex());
        KommentFemale.clickBtnCont();
        Assert.assertEquals("Анна, 35 лет", KommentMale.getAnna());
        Assert.assertEquals("Я чувствую, что наконец-то нашла программу для похудения, которая учитывает моё тело и мое время. Курс был понятным, простым в освоении и очень мотивирующим. Я сбросила 5,5 кг, а главное - я чувствую себя потрясающе как физически, так и морально.", KommentMale.getKommitAnna());
        KommentMale.clickBtnBack();
        Assert.assertEquals("Никита, 29 лет", KommentMale.getNikita());
        KommentMale.clickBtnBack();
        Assert.assertEquals("Марина, 40 лет", KommentMale.getAlex());
    }

    @Test
    @DisplayName("Should get funct Pay page")
    public void ShouldFunctPay() throws InterruptedException {
        Page1.clickMale();
        Page2.clickQ2_1();
        Page3.clickQ3_1();
        Page4.clickQ4_1();
        Page5.clickQ6_1();
        Page6.clickQ6_1();
        Page7.clickQ7_1();
        Page8.clickQ8_1();
        Page10.send40KeysQ10_2();
        Page10.send120KeysQ10_1();
        Page10.send40KeysQ10_3();
        Page10.send18KeysQ10_4();
        Page10.clickContinue11();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6000));
        wait.until(visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/main/div/section[14]/section/div/div/div[1]/div[2]/h3")));
        Body.EndBtn();
        sleep(1000);
        Pay.PageUpBtn();
        sleep(2500);
        Assert.assertEquals("Фигура мечты почти ваша! Успейте забрать тренировки пилатес по акции", Pay.getFigure());
//        Assert.assertEquals("рационы питания по акции!", Pay.getAkchia());
        Assert.assertEquals("Только сейчас: получите доступ", Pay.getDostup());
        Assert.assertEquals("к курсу всего за 1 ₽*", Pay.getOneRubl());
        Assert.assertEquals("*Первые 7 дней, далее 399₽ или 99₽ раз в 30 дней или в зависимости от условий. Отмена в любой момент.", Pay.getUsl());
        Assert.assertEquals("Получить доступ", Pay.getBtnText());
        Assert.assertEquals("none",Pay.getErrorDisplay());
        Pay.clickMainBtn();
        Assert.assertEquals("Укажите корректный email", Pay.getErrorText());
        Assert.assertEquals("Нажимая кнопку  \"Получить доступ\" вы подтверждаете ознакомление с офертой и тарифами, а также даете согласие на обработку персональных данных.", Pay.getTwiseUslText());
        Pay.setEmailValid();
        Pay.clickMainBtn();
        sleep(2000);
    }
}