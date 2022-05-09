package suite;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import some.Credentials;
import some.MainPage;
import some.MoviePage;
import some.ProfilePage;

public class BaseTest {

    public static MainPage openMain(){
        Configuration.startMaximized=true;
        Configuration.timeout = 10000;
        Selenide.open(Credentials.urlMainPage);
        return new MainPage();
    }

    public static MoviePage openMovies(){
        Configuration.startMaximized=true;
        Configuration.timeout = 10000;
        Selenide.open(Credentials.urlMoviesPage);
        return new MoviePage();
    }

    public static ProfilePage openProfile(){
        Configuration.startMaximized=true;
        Configuration.timeout = 10000;
        Selenide.open(Credentials.urlProfilePage);
        return new ProfilePage();
    }




}
