package some;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MoviePage {

    /*locators for movie page */
    public SelenideElement favoriteButton = $(Credentials.movieFavoriteButton);
    public SelenideElement likeButton = $(Credentials.movieLikeButton);
    //    public SelenideElement likeCounter = $(By.xpath(Credentials.likeCounter));
    public SelenideElement actorIconButton = $(By.xpath(Credentials.movieActorIconButton));
    public SelenideElement playButton = $(By.xpath(Credentials.moviePlayButton));
    public SelenideElement title = $(By.xpath(Credentials.movieTitle));

    /*locators for movie player */
    public SelenideElement playerPlayButton = $(By.xpath(Credentials.moviePlayButton));
//    public SelenideElement  = $()
//    public SelenideElement  = $()
//    public SelenideElement  = $()
//    public SelenideElement  = $()
//    public SelenideElement  = $()
//    public SelenideElement  = $()

    public MoviePage clickPlayMovieButton() {
        playButton.click();
        return new MoviePage();
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
