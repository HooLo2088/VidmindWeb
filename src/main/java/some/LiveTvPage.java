package some;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.actions;

public class LiveTvPage {
    public SelenideElement liveIcon = $(By.xpath(Credentials.liveIcon));
        public SelenideElement catchUpPlayButton = $(By.xpath(Credentials.playerCatchUpPlay));
        public SelenideElement backToLiveButton = $(By.xpath(Credentials.playerBackToLiveButton));
        public SelenideElement timeStampCurrent = $(By.xpath(Credentials.playerTimestampCurrent));
//        public SelenideElement  = $(By.xpath(Credentials.));
//        public SelenideElement  = $(By.xpath(Credentials.));
//        public SelenideElement  = $(By.xpath(Credentials.));

   public String getTimeStampCurrent() throws InterruptedException {
       Thread.sleep(5000);
       return timeStampCurrent.getText();
   }

    public LiveTvPage clickCatchUp() throws InterruptedException {
        catchUpPlayButton.click();
        Thread.sleep(7000);
        return this;
    }

    public String getLiveIcon() throws InterruptedException {
        Thread.sleep(1000);
    return liveIcon.getText();
    }

    public LiveTvPage mouseMoveInPlayer() throws InterruptedException {
        Thread.sleep(5000);
        actions().moveToElement(liveIcon).perform();
        return this;
    }




}
