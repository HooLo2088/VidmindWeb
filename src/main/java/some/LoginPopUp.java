package some;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPopUp {

    public SelenideElement personAccountButton = $(By.xpath(Credentials.personAccountButton));
    public SelenideElement inputNameField = $(By.xpath(Credentials.inputNameField));
    public SelenideElement inputPassField = $(By.xpath(Credentials.inputPassField));
    public SelenideElement loginButtonPopup = $(By.xpath(Credentials.loginButtonPopup));

    public LoginPopUp clickPersonAccountButton() {
        personAccountButton.click();
        return this;
    }

    public LoginPopUp setUserName(String userName) {
        inputNameField.sendKeys(userName);
        return this;
    }

    public LoginPopUp setUserPass(String userPass) {
        inputPassField.sendKeys(userPass);
        return this;
    }

    public LoginPopUp clickLoginButtonPopup() {
        loginButtonPopup.click();
        return this;
    }

    public MainPage login(String userName, String userPass) {
        this.clickPersonAccountButton();
        this.setUserName(userName);
        this.setUserPass(userPass);
        this.clickLoginButtonPopup();
        return new MainPage();
    }
}
