import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class MoviePageTest extends BaseTest {

    @BeforeTest

    public void login() throws InterruptedException {

        MainPage mainPage = openMain()
                .summonsLoginPopUp()
                .login(Credentials.userLoginName, Credentials.userPassword);
        Thread.sleep(5000);
    }

    @Test
    public void playMovie() throws InterruptedException {

        MoviePage moviePage = openMovies()
                .clickPlayMovieButton();

        Thread.sleep(10000);
    }

}
