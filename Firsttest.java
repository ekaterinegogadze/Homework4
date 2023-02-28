import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import javax.swing.*;
import java.time.Duration;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.files.DownloadActions.click;

public class Firsttest {
    @Test
    public void EEtest() {

        open("https://www.ee.ge");
        $(".btn-register").click();
        $("#firstName").setValue("eka").shouldNotBe(Condition.empty);
        $("#lastName").setValue("gogadze").shouldNotBe(Condition.empty);
        $("#email").setValue("eka.gogadze88@gmail.com").shouldNotBe(Condition.empty);
        $("#password").setValue("Testtest1").shouldNotBe(Condition.empty);
        $("#confirmPassword").setValue("Testtest1").shouldNotBe(Condition.empty);
        $("#singup").shouldNotBe(Condition.empty);
        $("#singup").shouldBe(Condition.enabled);


    }
}