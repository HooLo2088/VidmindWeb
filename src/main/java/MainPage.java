import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    public SelenideElement mainLoginButton = $(By.xpath(Credentials.MainLoginButton));

    public LoginPopUp summonsLoginPopUp() {
        mainLoginButton.click();
        return new LoginPopUp();
    }
}
