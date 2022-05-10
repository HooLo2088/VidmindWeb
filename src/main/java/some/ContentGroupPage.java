package some;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ContentGroupPage {

    /*locators methods for Favorite Group page */
    public SelenideElement favoriteMovieTitle = $(By.xpath(Credentials.favoriteMovieTitle));

    public String getFavoriteMovieTitle(){
        return favoriteMovieTitle.getText();
    }

    /*locators methods for Continue Watching Group page */


}
