package some;

public class Credentials {

    /* Url for content */
    public static String urlMainPage = "https://tv.kyivstar.ua/ua/";
    public static String urlCAmovies = "https://tv.kyivstar.ua/ua/movies";

    /* Locators for header */
    public static String headerSearchButton = "//i[@class='icon-search-thin']";

    /* Locators for search PopUp*/
    public static String searchInputField = "//input[@formcontrolname='term']";
    public static String searchFirstAssetName = "//div[@class='asset-name text-overflow']";

    /* Locators for Profile page */
    public static String profileSignOutButton = "//ul[@class='menu']/child::li[6]";

    /* Locators for ContentGroupPage */
    public static String CGassetName = "//div[@class='poster__details__title text-overflow']";

}
