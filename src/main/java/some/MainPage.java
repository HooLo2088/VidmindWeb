package some;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    public SelenideElement mainLoginButton = $(By.xpath(Credentials.headerLoginButton));


    public LoginPopUp summonsLoginPopUp() {
        mainLoginButton.click();
        return new LoginPopUp();
    }

}
