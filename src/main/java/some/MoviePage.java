package some;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MoviePage {

    /*locators for movie page */
    public SelenideElement favoriteButton = $(Credentials.movieFavoriteButton);
    public SelenideElement likeButton = $(Credentials.movieLikeButton);
    public SelenideElement actorIconButton = $(By.xpath(Credentials.movieActorIconButton));
    public SelenideElement playButton = $(By.xpath(Credentials.moviePlayButton));
    public SelenideElement title = $(By.xpath(Credentials.movieTitle));

    /*locators for movie player */
    public SelenideElement playerPlayButton = $(By.xpath(Credentials.playerPlayButton));
//    public SelenideElement  = $();
//    public SelenideElement  = $();
//    public SelenideElement  = $();
//    public SelenideElement  = $();
//    public SelenideElement  = $();
    public SelenideElement playerTimestampCurrent = $(By.xpath(Credentials.playerTimestampCurrent));

    public String getTimestampCurrent(){
        return playerTimestampCurrent.shouldBe(Condition.visible).getText();
    }

    public MoviePage clickPlayMovieButton() throws InterruptedException {
        playButton.click();
        Thread.sleep(10000);
        return this;
    }

    public MoviePage clickLikeButton() {
        likeButton.click();
        return this;
    }

    public String getLikeCounter() {
        return likeButton.getText();
    }

    public MoviePage clickFavoriteButton() {
        favoriteButton.click();
        return this;
    }

    public String getMovieTitle() {
        return title.getText();
    }

}
