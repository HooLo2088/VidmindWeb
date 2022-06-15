package suite;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTest extends BaseTest {

    @Test
    public void searchTest (){
        String beforeFirstAssetName = BaseTest.openCAmovies().getAssetName();
        String afterSearchAssetName = BaseTest.openMainPage().summosSearchPopUp().setSearchName(beforeFirstAssetName).getAssetName();
        Assert.assertEquals(beforeFirstAssetName, afterSearchAssetName);
    }
}
