import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MoviePage {

    /*locators for movie page */
    public SelenideElement favoriteButton = $(Credentials.favoriteButton);
    public SelenideElement likeButton = $(Credentials.likeButton);
    public SelenideElement likeCounter = $(By.xpath(Credentials.likeCounter));
    public SelenideElement actorIconButton = $(By.xpath(Credentials.actorIconButton));
    public SelenideElement playButton = $(By.xpath(Credentials.playerPlayButton));


    /*locators for movie player */
    public SelenideElement playerPlayButton = $(By.xpath(Credentials.playerPlayButton));
//    public SelenideElement  = $()
//    public SelenideElement  = $()
//    public SelenideElement  = $()
//    public SelenideElement  = $()
//    public SelenideElement  = $()
//    public SelenideElement  = $()

    public MoviePage clickPlayMovieButton(){
        playButton.click();
        return new MoviePage();
    }



}
