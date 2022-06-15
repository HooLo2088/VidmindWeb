package some;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;




public class SearchPopUp {

    public SelenideElement inputSearchField = $(By.xpath(Credentials.searchInputField));
    public SelenideElement assetName = $(By.xpath(Credentials.searchFirstAssetName));

    public SearchPopUp setSearchName(String searchName) {
        inputSearchField.shouldBe(Condition.enabled).sendKeys(searchName);
        return this;
    }

    public String getAssetName(){
        return assetName.shouldBe(Condition.visible).getText();
    }
}
