package some;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MailPage {

    public SelenideElement spleshCounter = $(By.xpath(Credentials.spleshCounter));


    public String getSpleshCounter() {
        return spleshCounter.shouldBe(Condition.visible).getText();
    }
}
