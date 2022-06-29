package suite;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import some.Credentials;
import some.MainPage;
import some.MoviePage;


public class DemoTest extends BaseTest {

    @BeforeTest
    public void login() throws InterruptedException {

        MainPage mainPage = BaseTest.openMainPage()
                .summonsLoginPopUp()
                .login(Credentials.userLoginName, Credentials.userPassword);
        Thread.sleep(5000);
    }

    @Test
    public void catchUpLive() throws InterruptedException {
        String timeStampLiveChannel = BaseTest.openVirtLiveTv()
                .clickCatchUp()
                .getTimeStampCurrent();
        Assert.assertNotEquals(timeStampLiveChannel,"00:00:00");
    }

    @Test
    public void liveChannel() throws InterruptedException {
        String liveChannel = BaseTest.openMainPage()
                .clickCaLiveTv()
                .clickLiveChannel()
                .mouseMoveInPlayer()
                .getLiveIcon();
        Assert.assertEquals(liveChannel, "LIVE");
    }

    @Test
    public void disableProduct(){
        String popUpPackageCancel = BaseTest
                .openProfilePage()
                .openMyProduct()
                .clickHowDisableProduct()
                .clickContinueDisable()
                .leftDescDisable("I want to disable the product")
                .clickPopUpDisableDone()
                .getPackageCancel();
        Assert.assertEquals(popUpPackageCancel, "Пакет відключено");
    }

    @Test
    public void buyProduct(){
        String popUpDone = BaseTest.openProfilePage()
                .clickProduct()
                .clickBuyProductButton()
                .clickRegularPriceProductButton()
                .clickBuyForUahButton()
                .getDone();
        Assert.assertEquals(popUpDone, "Готово!");
    }

    @Test
    public void addNewCard(){
        String myCardNumber = BaseTest.openMainPage()
                .openProfilePage()
                .openProfilePaymentDetails()
                .addNewPaymentsCardButton()
                .addNewCardCred(Credentials.cardNumber, Credentials.cardExpDate, Credentials.cardCvv)
                .getMyCardNumber();
        Assert.assertEquals(myCardNumber, "444433******1111");
    }

    @Test
    public void searchTest () throws InterruptedException {
        String beforeFirstAssetName = BaseTest.openCAmovies().getAssetName();
        String afterSearchAssetName = BaseTest.openMainPage().summosSearchPopUp().setSearchName(beforeFirstAssetName).getAssetName();
        Assert.assertEquals(beforeFirstAssetName, afterSearchAssetName);
    }

    @Test
    public void playMovie() throws InterruptedException {
        String currentTime = BaseTest.openMoviesPage().clickPlayMovieButton().getTimestampCurrent();
        Assert.assertNotEquals(currentTime,"00:00:00");
    }

    @Test
    public void likeMovie(){
        String beforeLikeCounter = BaseTest.openMoviesPage().getLikeCounter();
        MoviePage moviePage = BaseTest.openMoviesPage().clickLikeButton();
        String afterLikeCounter = BaseTest.openMoviesPage().getLikeCounter();
        Integer b = Integer.parseInt(beforeLikeCounter) + 1;
        Integer a = Integer.parseInt(afterLikeCounter);
        Assert.assertEquals(b, a);
        MoviePage moviePageAfter = BaseTest.openMoviesPage().clickLikeButton();
    }

    @Test
    public void addFavoriteMovie() throws InterruptedException {
        String movieTitle = BaseTest.openMoviesPage().getMovieTitle();
        MoviePage moviePage = BaseTest.openMoviesPage().clickFavoriteButton();
        String favoriteMovieTitle = BaseTest.openFavoriteGroupPage().getAssetName();
        Assert.assertEquals(movieTitle, favoriteMovieTitle);
        MoviePage moviePageAfter = BaseTest.openMoviesPage().clickFavoriteButton();
    }

    @AfterTest
    public void logOut() throws InterruptedException {
        MainPage mainPage = BaseTest.openProfilePage()
                .logOut();
    }
}
