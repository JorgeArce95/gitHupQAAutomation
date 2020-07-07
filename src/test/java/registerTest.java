import dataproviders.usersProvider;
import org.testng.annotations.Test;
import pageobject.registerPage;
import pageobject.headerPage;
import pojo.registerData;

public class registerTest extends baseTest {


    @Test(dataProvider = "getRegisterDataFromJson", dataProviderClass = usersProvider.class)
    public void allow_to_register(registerData _SignInData) throws InterruptedException {
        System.out.println("**************" + " Ejecutando Prueba sing In Test " + "**************" + "\r\n");
        headerPage header = new headerPage(baseURL, driver);
        registerPage register = new registerPage(baseURL, driver);
        header.clickMyAccountButton();
        header.clickSignInButton();
        register.insertName(_SignInData.getName());
        register.insertLastName(_SignInData.getLastName());
        register.insertEmail(getEmailRandom(""));
        register.insertEmail("@gmail.com");
        register.insertTelephone(_SignInData.getTelephone());
        register.insertPassword(_SignInData.getPassword());
        register.insertConfirmPassword(_SignInData.getPassword());
        register.clickPrivacyPolicyCheckBox();
        register.clickContinueButton();
        header.clickMyAccountButton();
        header.clickLogoutButton();


    }
}





