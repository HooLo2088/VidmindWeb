import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    public static MainPage openMain(){
        Configuration.startMaximized=true;
        Configuration.timeout = 10000;
        open(Credentials.UrlMainPage);
        return new MainPage();
    }

//    public static MoviePage openMovies(){
//        Configuration.timeout = 10000;
//        open(Credentials.UrlMoviesPage);
//        return new MoviePage();
//    }




}
