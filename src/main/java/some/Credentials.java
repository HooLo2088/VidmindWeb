package some;

public class Credentials {

    /* some Credentials fo login */
    public static String userLoginName = "autotestportmone";
    public static String userPassword = "123456";

    /* some Credentials fo payments cards*/
    public static String cardNumber = "4444333322221111";
    public static String cardExpDate = "1027";
    public static String cardCvv = "789";

    /* Url for content */
    public static String urlMainPage = "https://webng.dev.vidmind.com/ua/";
    public static String urlMoviesPage = "https://webng.dev.vidmind.com/ua/movie/61e165314eb4fe61f9015b04-2018-za-mrieyu";
    public static String urlProductPage = "https://webng.dev.vidmind.com/ua/account/packages";
    public static String urlFavoriteGroupPage = "https://webng.dev.vidmind.com/ua/MyVideo";
    public static String urlCAmovies = "https://webng.dev.vidmind.com/ua/movies";
    public static String urlLiveTv = "https://webng.dev.vidmind.com/en/live-channels/620cb9b3e3f44818e01eca97-testvirtfreeano";

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
    public static String headerLoginButton = "//button[@class='btn_login btn link']";
    public static String headerProfilIcon = "//a[@class='btn link profile-link']";

    /* Locators for search PopUp*/
    public static String searchInputField = "//input[@formcontrolname='term']";
    public static String searchFirstAssetName = "//div[@class='asset-name text-overflow']";


    /* Locators for login PopUp */
    public static String personAccountButton = "//div[@class='step-button ng-star-inserted']";
    public static String inputNameField = "//input[@formcontrolname='login']";
    public static String inputPassField = "//input[@class='login-input_password ng-untouched ng-pristine ng-invalid']";
    public static String loginButtonPopup = "//button[@class='btn btn-primary btn_login next-step']";

    /*locators of player*/
    public static String playerPlayButton = "//button[@class='btn btn-play']";
    public static String playerPauseButton = "//button[@class='btn btn-play btn-play_paused']";
    public static String playerBackwardButton = "//span[@class='icon-backward']";
    public static String playerForwardButton = "//span[@class='icon-forward']";
    public static String playerVolumeButton = "//i[@class='icon-volume']";
    public static String playerPicInPicButton = "//i[@class='icon-picture-in-picture']";
    public static String playerSettingButton = "//i[@class='icon-settings']";
    public static String playerExpandButton = "//i[@class='icon-expand']";
    public static String playerTimestampCurrent = "//label[@class='timestamp timestamp_current']";
    public static String playerBackToLiveButton = "//div[@class='live start-over']";
    public static String playerCatchUpPlay = "//div[@class='program-list__actions ng-tns-c15-1 ng-star-inserted']";


    /* Locators for Profile page */
    public static String profilePaymentDetailsButton = "//ul[@class='menu']/child::li[2]";
//    public static String profilePersonalDataButton = "";
//    public static String profileAccountManagementButton = "";
    public static String profileSignOutButton = "//ul[@class='menu']/child::li[7]";
    public static String profilePaymentsAddNewCardButton = "//button[@class='btn payment-details__add-card']";
    public static String profileInputCardNumberField = "//input[@id='single_portmone_pay_card']";
    public static String profileInputCardExpDateField = "//input[@id='single_portmone_pay_exp_date']";
    public static String profileInputCardCvvField = "//input[@id='single_portmone_pay_cvv2']";
    public static String profileSaveCardCredentials = "//button[@class='pg-btn pg-btn__red action']";
    public static String profileMyCardNumber = "//span[@class='card__number']";
    public static String profileProductLabel = "//div[@class='cell']";
    public static String profileBuyProductButton = "//div[@class='sticky-footer__item sticky-footer__item_short']";
    public static String profileRegularPriceProduct = "//div[@class='cell-list ng-star-inserted']/child::vd-payment-promo-cell[3]";
    public static String profileBuyForUah = "//button[@class='payment__btn btn btn-primary']";
    public static String profilePopUpDONE = "//h2[@class='popup__title']";
    public static String profileFierstProduct = "//div[@class='cell']";
    public static String profileProductDisable = "//button[@class='info__btn btn btn__new btn-secondary']";
    public static String profilePopUpDisableButton = "//button[@class='btn btn-secondary']";
    public static String profilePopUpDescribeDetail = "//textarea[@formcontrolname='textReasons']";
    public static String profilePopUpDisableDone = "//h3[@class='content__title']";
    public static String profilePopUpDoneButton = "//div[@class='actions action-buttons']";

    /* Locators for Movies page */
    public static String moviePlayerPlayButton = "//button[@class='btn btn-accent btn-icon btn-round']";
    public static String moviePlayButton = "//button[@class='btn btn-primary btn-icon']";
    public static String movieFavoriteButton = "div.asset-favorite";
    public static String movieLikeButton = "div.asset-like";
    public static String movieActorIconButton = "//div[@itemprop='actor']";
    public static String movieTitle = "//h1[@class='metadata__title']";

    /* Locators for Series page */
//    public static String * = "//div[@class='actions action-buttons']";
//    public static String * = "";
//    public static String * = "";
//    public static String * = "";
//    public static String * = "";

    /* Locators for OnlineTV */
    public static String liveIcon = "//label[@class='timestamp timestamp_left']";
//    public static String * = "";
//    public static String * = "";
//    public static String * = "";
//    public static String * = "";

    /* Locators for ContentGroupPage */
    public static String CGassetName = "//div[@class='poster__details__title text-overflow']";
//    public static String * = "";
//    public static String * = "";
//    public static String * = "";
//    public static String * = "";

}
