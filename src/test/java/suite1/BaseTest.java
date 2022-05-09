package suite1;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import some.Credentials;
import some.MainPage;
import some.MoviePage;

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




}
