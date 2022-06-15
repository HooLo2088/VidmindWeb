package some;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ContentGroupPage {

    public SelenideElement cgAssetName = $(By.xpath(Credentials.CGassetName));

    public String getAssetName(){
        return cgAssetName.getText();
    }
}
