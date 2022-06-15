package some;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    public SelenideElement mainSearchButton = $(By.xpath(Credentials.headerSearchButton));

    public SearchPopUp summosSearchPopUp(){
        mainSearchButton.click();
        return new SearchPopUp();
    }
}
