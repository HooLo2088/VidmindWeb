import org.testng.annotations.Test;


public class LoginTest extends BaseTest {

    @Test
    public void login() {

        LoginPopUp loginPopUp = openMain().summonsLoginPopUp().login(Credentials.LoginName, Credentials.Password);
    }
}
