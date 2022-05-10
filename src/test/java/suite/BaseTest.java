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

    public static MoviePage openMoviesPage(){
        Configuration.startMaximized=true;
        Configuration.timeout = 10000;
        Selenide.open(Credentials.urlMoviesPage);
        return new MoviePage();
    }

    public static ProfilePage openProfilePage(){
        Configuration.startMaximized=true;
        Configuration.timeout = 10000;
        Selenide.open(Credentials.urlProfilePage);
        return new ProfilePage();
    }

    public static ContentGroupPage openFavoriteGroupPage(){
        Configuration.startMaximized=true;
        Configuration.timeout = 10000;
        Selenide.open(Credentials.urlFavoriteGroupPage);
        return new ContentGroupPage();
    }

}
