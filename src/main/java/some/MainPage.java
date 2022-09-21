package some;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;


public class MainPage {


    public SelenideElement userNameField = $(By.xpath(Credentials.userNameField));
    public SelenideElement passField = $(By.xpath(Credentials.passField));
    public SelenideElement loginButton = $(By.xpath(Credentials.loginButton));

    public MainPage setUserName(String userName) {
        userNameField.sendKeys(userName);
        return this;
    }

    public MainPage setPass(String pass) {
        passField.sendKeys(pass);
        return this;
    }

    public MailPage clickLoginButton() {
        loginButton.click();
        return new MailPage();
    }
}

