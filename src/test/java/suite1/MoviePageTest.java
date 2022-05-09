package suite1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import some.Credentials;
import some.MainPage;
import some.MoviePage;


public class MoviePageTest extends BaseTest {

    @BeforeTest
    public void login() throws InterruptedException {

        MainPage mainPage = BaseTest.openMain()
                .summonsLoginPopUp()
                .login(Credentials.userLoginName, Credentials.userPassword);
        Thread.sleep(3000);
    }

    @Test
    public void playMovie() throws InterruptedException {

        MoviePage moviePage = BaseTest.openMovies()
                .clickPlayMovieButton();

        Thread.sleep(10000);
    }

}
