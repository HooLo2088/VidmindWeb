package suite;

import org.testng.Assert;
import org.testng.annotations.Test;
import some.Credentials;

public class SearchTest extends BaseTest {

    @Test
    public void spleshTest() {
        String counter = "";
        String spleshCounter = BaseTest.openMainPage()
                .setUserName(Credentials.userName)
                .setPass(Credentials.pass)
                .clickLoginButton()
                .getSpleshCounter();
        Assert.assertNotEquals(counter, spleshCounter);
    }
}
