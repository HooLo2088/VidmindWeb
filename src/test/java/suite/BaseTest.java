package suite;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import some.*;

public class BaseTest {

    public static MainPage openMainPage() {
        Configuration.startMaximized = true;
        Configuration.timeout = 5000;
        Selenide.open(Credentials.urlMainPage);
        return new MainPage();
    }
}
