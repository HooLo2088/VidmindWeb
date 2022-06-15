package suite;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import some.*;

public class BaseTest {

    public static MainPage openMainPage(){
        Configuration.startMaximized=true;
        Configuration.timeout = 10000;
        Selenide.open(Credentials.urlMainPage);
        return new MainPage();
    }

    public static ContentGroupPage openCAmovies(){
        Configuration.startMaximized=true;
        Configuration.timeout = 10000;
        Selenide.open(Credentials.urlCAmovies);
        return new ContentGroupPage();
    }
}
