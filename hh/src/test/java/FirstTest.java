import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class FirstTest {
    private String baseUrl = "https://demoqa.com/automation-practice-form";
    private SelenideElement FirstName = Selenide.$(By.xpath("//input[@id='firstName']"));
    private SelenideElement LastName = Selenide.$(By.xpath("//input[@id='lastName']"));
    private SelenideElement Email = Selenide.$(By.xpath("//input[@id='userEmail']"));
    private SelenideElement Gender = Selenide.$(By.xpath("//label[@for='gender-radio-1']"));
    private SelenideElement MobileNumber = Selenide.$(By.xpath("//input[@id='userNumber']"));
    private SelenideElement Subject = Selenide.$(By.xpath("//input[@id='subjectsInput']"));
    private SelenideElement Hobbies = Selenide.$(By.xpath("//label[@for='hobbies-checkbox-2']"));
    private SelenideElement CurrentAddress = Selenide.$(By.xpath("//textarea[@placeholder='Current Address']"));
    private SelenideElement StateAndCity = Selenide.$(By.xpath("//input[@id='react-select-3-input']"));
    private SelenideElement StateAndCity2 = Selenide.$(By.xpath("//input[@id='react-select-4-input']"));
    private SelenideElement Submit = Selenide.$(By.xpath("//button[@id='submit']"));

    public FirstTest() {
    }

    @BeforeAll
    static void beforeConfig() {
        Configuration.timeout = 3000L;
        Configuration.browserSize = "1920x1080";
    }

    @BeforeEach
    public void before() {
        Selenide.open(this.baseUrl);
    }

    @Test
    public void test() {
        this.step1();
        this.step2();
        this.step3();
        this.step4();
        this.step5();
        this.step8();
        this.step9();
        this.step10();
        this.step11();
    }

    @Step("1")
    private void step1() {this.FirstName.should(new Condition[]{Condition.visible}).val("Тимур");
    }

    @Step("2")
    private void step2() {
        this.LastName.should(new Condition[]{Condition.visible}).val("Карпинский");
    }

    @Step("3")
    private void step3() {
        this.Email.should(new Condition[]{Condition.visible}).val("timurka2609@yandex.ru");
    }

    @Step("4")
    private void step4() {
        this.Gender.should(new Condition[]{Condition.visible}).click();
    }

    @Step("5")
    private void step5() {
        this.MobileNumber.should(new Condition[]{Condition.visible}).val("9621845293");
    }

    @Step("8")
    private void step8() {this.Subject.should(new Condition[]{Condition.visible}).val("Computer Science").pressEnter(); }

    @Step("9")
    private void step9() {
        this.Hobbies.should(new Condition[]{Condition.visible}).click();
    }

    @Step("10")
    private void step10() {
        this.CurrentAddress.should(new Condition[]{Condition.visible}).val("Кострома");
    }

    @Step("11")
    private void step11() {this.StateAndCity.should(new Condition[]{Condition.visible}).val("NCR").pressEnter(); }

    @Step("12")
    private void step12() {this.StateAndCity2.should(new Condition[]{Condition.visible}).val("Delhi").pressEnter(); }

    @Step("13")
    private void step13() {this.Submit.should(new Condition[]{Condition.visible}).click(); }

    @AfterEach
    public void after() {
    }
}
