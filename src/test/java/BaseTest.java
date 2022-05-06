import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    public static MainPage openMain(){
        Configuration.startMaximized=true;
        Configuration.timeout = 10000;
        open(Credentials.urlMainPage);
        return new MainPage();
    }

    public static MoviePage openMovies(){
        Configuration.startMaximized=true;
        Configuration.timeout = 10000;
        open(Credentials.urlMoviesPage);
        return new MoviePage();
    }




}
