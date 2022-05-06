
public class Credentials {

    /* Credentials fo login */
    public static String userLoginName = "h2088";
    public static String userPassword = "123456";

    /* Url for content */
    public static String urlMainPage = "https://tv.kyivstar.ua/ua/";
    public static String urlMoviesPage = "https://tv.kyivstar.ua/ua/movie/626f96446a347724cc8c87e1-2019-shahrajki";

    /* Locators for header */
    public static String headerLandingPageButton = "div.nav__image";
    public static String headerCAonlineTvButton = "//span[contains(text(),'Онлайн ТБ')]";
    public static String headerCAmoviesButton = "//span[contains(text(),'Фільми')]";
    public static String headerCAseriesButton = "//span[contains(text(),'Серіали і Шоу')]";
    public static String headerCAmyVideoButton = "//a[@href='/ua/MyVideo']";
    public static String headerTariffsButton = "//*[contains(text(),'Тарифи')]";
    public static String headerEnterPromoCodeButton = "//*[contains(text(),'Ввести промокод')]";
    public static String headerSearchButton = "//i[@class='icon-search-thin']";
    public static String headerLightStartButton = "//i[@class='icon-circle-ellipsis']";
    public static String headerLangButton = "//span[contains(text(),'UA')]";
    public static String headerLoginButton = "//*[contains(text(),'Увійти')]";

    /* Locators for login PopUp */
    public static String personAccountButton = "//*[contains(text(),'Особовим рахунком')]";
    public static String inputNameField = "//input[@formcontrolname='login']";
    public static String inputPassField = "//input[@class='login-input_password ng-untouched ng-pristine ng-invalid']";
    public static String loginButtonPopup = "//*[contains(text(),' Увійти ')]";

    /*locators of player*/
    public static String playerPlayButton = "//*[contains(text(),'ДИВИТИСЯ')]";
    public static String playerPauseButton = "//button[@class='btn btn-play btn-play_paused']";
    public static String playerBackwardButton = "//span[@class='icon-backward']";
    public static String playerForwardButton = "//span[@class='icon-forward']";
    public static String playerVolumeButton = "//i[@class='icon-volume']";
    public static String playerPicInPicButton = "//i[@class='icon-picture-in-picture']";
    public static String playerSettingButton = "//i[@class='icon-settings']";
    public static String playerExpandButton = "//i[@class='icon-expand']";

    /* Locators for Profile page */
//    public static String profilePaymentDetailsButton = "";
//    public static String profilePersonalDataButton = "";
//    public static String profileAccountManagementButton = "";
//    public static String profileSignOut = "";


    /* Locators for Movies page */
    public static String favoriteButton = "div.asset-favorite";
    public static String likeButton = "div.asset-like";
    public static String likeCounter = "//div[@itemprop='userInteractionCount']";
    public static String actorIconButton = "//img[@class='actor-avatar']";
//    public static String playerPlayButton = "//div[@class='actions laptop-visible']";

    /* Locators for Series page */
//    public static String * = "";
//    public static String * = "";
//    public static String * = "";
//    public static String * = "";
//    public static String * = "";

    /* Locators for OnlineTV */
//    public static String * = "";
//    public static String * = "";
//    public static String * = "";
//    public static String * = "";
//    public static String * = "";

}
