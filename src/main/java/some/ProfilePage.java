package some;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ProfilePage {
    public SelenideElement logOutButton = $(By.xpath(Credentials.profileSignOutButton));

    public MainPage logOut (){
        logOutButton.click();
        return new MainPage();
    }
}
