package some;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    public SelenideElement mainLoginButton = $(By.xpath(Credentials.headerLoginButton));
    public SelenideElement mainSearchButton = $(By.xpath(Credentials.headerSearchButton));

    public LoginPopUp summonsLoginPopUp() {
        mainLoginButton.click();
        return new LoginPopUp();
    }

    public SearchPopUp summosSearchPopUp(){
        mainSearchButton.click();
        return new SearchPopUp();
    }
}
