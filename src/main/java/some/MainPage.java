package some;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    public SelenideElement mainLoginButton = $(By.xpath(Credentials.headerLoginButton));
    public SelenideElement mainSearchButton = $(By.xpath(Credentials.headerSearchButton));
    public SelenideElement profileIcon = $(By.xpath(Credentials.headerProfilIcon));
    public SelenideElement caLiveTv = $(By.xpath(Credentials.headerCAonlineTvButton));

    public LoginPopUp summonsLoginPopUp() {
        mainLoginButton.click();
        return new LoginPopUp();
    }

    public SearchPopUp summosSearchPopUp(){
        mainSearchButton.click();
        return new SearchPopUp();
    }

    public ProfilePage openProfilePage(){
        profileIcon.click();
        return new ProfilePage();
    }

    public LiveTvPage clickCaLiveTv(){
        caLiveTv.shouldBe(Condition.visible).click();
        return new LiveTvPage();
    }
}
