package some;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ProfilePage {

    public SelenideElement logOutButton = $(By.xpath(Credentials.profileSignOutButton));
    public SelenideElement profilePaymentButton = $(By.xpath(Credentials.profilePaymentDetailsButton));

    public SelenideElement profilePaymentsAddNewCard = $(By.xpath(Credentials.profilePaymentsAddNewCardButton));
    public SelenideElement inputCardNumber = $(By.xpath(Credentials.profileInputCardNumberField));
    public SelenideElement inputCardExpDate = $(By.xpath(Credentials.profileInputCardExpDateField));
    public SelenideElement inputCardCvv = $(By.xpath(Credentials.profileInputCardCvvField));
    public SelenideElement saveCardCredentialsButton = $(By.xpath(Credentials.profileSaveCardCredentials));
    public SelenideElement myCardNumber = $(By.xpath(Credentials.profileMyCardNumber));
    public SelenideElement productIcon= $(By.xpath(Credentials.profileProductLabel));
    public SelenideElement buyProductButton = $(By.xpath(Credentials.profileBuyProductButton));
    public SelenideElement regularPriceProductButton = $(By.xpath(Credentials.profileRegularPriceProduct));
    public SelenideElement buyForUahButton = $(By.xpath(Credentials.profileBuyForUah));
    public SelenideElement profilePopUpDONE = $(By.xpath(Credentials.profilePopUpDONE));
    public SelenideElement profilFierstProduct = $(By.xpath(Credentials.profileFierstProduct));
    public SelenideElement productDisableButton = $(By.xpath(Credentials.profileProductDisable));
    public SelenideElement profilePopUpDisableButton = $(By.xpath(Credentials.profilePopUpDisableButton));
    public SelenideElement inputDescDisable = $(By.xpath(Credentials.profilePopUpDescribeDetail));
    public SelenideElement profilePopUpDisableDone = $(By.xpath(Credentials.profilePopUpDisableDone));
    public SelenideElement profilePopUpDoneButton= $(By.xpath(Credentials.profilePopUpDoneButton));

    public MainPage logOut (){
        logOutButton.click();
        return new MainPage();
    }
    /* Package disable */
    public ProfilePage openMyProduct(){
        profilFierstProduct.shouldBe(Condition.visible).click();
        return this;
    }
    public ProfilePage clickHowDisableProduct(){
        productDisableButton.shouldBe(Condition.visible).click();
        return this;
    }
    public ProfilePage clickContinueDisable(){
        profilePopUpDisableButton.shouldBe(Condition.visible).click();
        return this;
    }
    public ProfilePage leftDescDisable(String disableInfo){
        inputDescDisable.sendKeys(disableInfo);
        return this;
    }
    public ProfilePage clickPopUpDisableDone(){
        profilePopUpDoneButton.shouldBe(Condition.visible).click();
        return this;
    }
    public String getPackageCancel(){
        return profilePopUpDisableDone.shouldBe(Condition.visible).getText();
    }


    /* Packages*/
    public ProfilePage clickProduct(){
        productIcon.shouldBe(Condition.visible).click();
        return this;
    }
    public ProfilePage clickBuyProductButton(){
        buyProductButton.shouldBe(Condition.visible).click();
        return this;
    }
    public ProfilePage clickRegularPriceProductButton(){
        regularPriceProductButton.shouldBe(Condition.visible).click();
        return this;
    }
    public ProfilePage clickBuyForUahButton(){
        buyForUahButton.shouldBe(Condition.visible).click();
        return this;
    }
    public String getDone (){
        return profilePopUpDONE.shouldBe(Condition.visible).getText();
    }



    /* Peyment Details */
    public String getMyCardNumber(){
       return myCardNumber.shouldBe(Condition.visible).getText();
    }

    public ProfilePage openProfilePaymentDetails (){
        profilePaymentButton.click();
        return this;
    }

    public ProfilePage addNewPaymentsCardButton(){
        profilePaymentsAddNewCard.click();
        return this;
    }

    public ProfilePage setCardNumber(String cardNumber){
        inputCardNumber.sendKeys(cardNumber);
        return this;
    }
    public ProfilePage setCardExpDate(String cardExpDate){
        inputCardExpDate.sendKeys(cardExpDate);
        return this;
    }
    public ProfilePage setCardCvv(String cardCvv){
        inputCardCvv.sendKeys(cardCvv);
        return this;
    }
    public ProfilePage clickSaveCard(){
        saveCardCredentialsButton.click();
        return this;
    }

    public ProfilePage addNewCardCred(String cardNumber, String cardExpDate, String cardCvv){
        this.setCardNumber(cardNumber);
        this.setCardExpDate(cardExpDate);
        this.setCardCvv(cardCvv);
        this.clickSaveCard();
        return new ProfilePage();
    }

}


