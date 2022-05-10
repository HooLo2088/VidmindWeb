package suite;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
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
        Thread.sleep(1000);
    }

    @Test
    public void likeCounter(){
        String BeforeLikeCounter = BaseTest.openMovies().getLikeCounter();
        MoviePage moviePage = BaseTest.openMovies().clickLikeButton();
        String AfterLikeCounter = BaseTest.openMovies().getLikeCounter();
        Integer b = Integer.parseInt(BeforeLikeCounter) + 1;
        Integer a = Integer.parseInt(AfterLikeCounter);
        Assert.assertEquals(b, a);
        MoviePage moviePageAfter = BaseTest.openMovies().clickLikeButton();
    }

    @Test
    public void playMovie() throws InterruptedException {
        MoviePage moviePage = BaseTest.openMovies()
                .clickPlayMovieButton();
        Thread.sleep(10000);
    }


    @AfterTest
    public void logOut() throws InterruptedException {
        MainPage mainPage = BaseTest.openProfile()
                .logOut();
    }
}
