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

        MainPage mainPage = BaseTest.openMainPage()
                .summonsLoginPopUp()
                .login(Credentials.userLoginName, Credentials.userPassword);
        Thread.sleep(1000);
    }

    @Test
    public void getTimestampCurrent() throws InterruptedException {
        String currentTime = BaseTest.openMoviesPage().clickPlayMovieButton().getTimestampCurrent();

    }

    @Test
    public void likeMovie(){
        String beforeLikeCounter = BaseTest.openMoviesPage().getLikeCounter();
        MoviePage moviePage = BaseTest.openMoviesPage().clickLikeButton();
        String afterLikeCounter = BaseTest.openMoviesPage().getLikeCounter();
        Integer b = Integer.parseInt(beforeLikeCounter) + 1;
        Integer a = Integer.parseInt(afterLikeCounter);
        Assert.assertNotEquals(b, a);
        MoviePage moviePageAfter = BaseTest.openMoviesPage().clickLikeButton();
    }

    @Test
    public void addFavoriteMovie(){
        String movieTitle = BaseTest.openMoviesPage().getMovieTitle();
        MoviePage moviePage = BaseTest.openMoviesPage().clickFavoriteButton();
        String favoriteMovieTitle = BaseTest.openFavoriteGroupPage().getFavoriteMovieTitle();
        Assert.assertEquals(movieTitle, favoriteMovieTitle);
        MoviePage moviePageAfter = BaseTest.openMoviesPage().clickFavoriteButton();
    }

    @Test
    public void playMovie() throws InterruptedException {
        MoviePage moviePage = BaseTest.openMoviesPage()
                .clickPlayMovieButton();

    }


    @AfterTest
    public void logOut() throws InterruptedException {
        MainPage mainPage = BaseTest.openProfilePage()
                .logOut();
    }
}
