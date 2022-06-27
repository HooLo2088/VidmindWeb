package some;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LiveTvPage {
    public SelenideElement liveIcon = $(By.xpath(Credentials.liveIcon));

//    public SelenideElement  = $();
//    public SelenideElement  = $();
//    public SelenideElement  = $();

    public String getLiveIcon() throws InterruptedException {
        Thread.sleep(7000);
    return liveIcon.getText();
    }


}
