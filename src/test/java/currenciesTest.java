import dataproviders.usersProvider;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobject.headerPage;
import pageobject.productPage;
import pojo.currenciesData;


public class currenciesTest extends baseTest {

    @Test(dataProvider = "getCurrenciesDataFromJson", dataProviderClass = usersProvider.class)
    public void allow_to_currencies(currenciesData _currenciesData) throws InterruptedException {
        System.out.println("**************" + " Ejecutando Prueba currencies Test " + "**************" + "\r\n");

        headerPage header = new headerPage(baseURL, driver);
        productPage product = new productPage(baseURL, driver);

        product.clickNameProductCurrencyButton();

        header.clickTypeOfCurrencyButton();
        header.clickEuroButton();
        header.implicitWaitUntilElementExists();
        header.waitUntilElementExists(header.setValidateCurrencyButton());
        System.out.println("El valor del producto en Euros es el siguiente: " + header.setValidateCurrencyButton().getText() + "\r\n");
        Assert.assertEquals(header.setValidateCurrencyButton().getText(), _currenciesData.getEuros());

        header.clickTypeOfCurrencyButton();
        header.clickDollarButton();
        header.implicitWaitUntilElementExists();
        header.waitUntilElementExists(header.setValidateCurrencyButton());
        System.out.println("El valor del producto en dolares es el siguiente: " + header.setValidateCurrencyButton().getText() + "\r\n");
        Assert.assertEquals(header.setValidateCurrencyButton().getText(), _currenciesData.getDollar());

        header.clickTypeOfCurrencyButton();
        header.clickLibraButton();
        header.implicitWaitUntilElementExists();
        header.waitUntilElementExists(header.setValidateCurrencyButton());
        System.out.println("El valor del producto en libras es el siguiente: " + header.setValidateCurrencyButton().getText() + "\r\n");
        Assert.assertEquals(header.setValidateCurrencyButton().getText(), _currenciesData.getLibra());


    }
}
