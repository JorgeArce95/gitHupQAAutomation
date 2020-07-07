import dataproviders.usersProvider;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobject.headerPage;
import pageobject.productPage;
import pojo.searchProductData;


public class searchProductTest extends baseTest {

    @Test(dataProvider = "getProductDataFromJson", dataProviderClass = usersProvider.class)
    public void allow_to_search_Product(searchProductData _purchaseOrderData) throws InterruptedException {
        System.out.println("**************" + " Ejecutando Prueba purchase Order Test " + "**************" + "\r\n");

        productPage product = new productPage(baseURL, driver);
        headerPage header = new headerPage(baseURL, driver);

        product.insertSearchInput(_purchaseOrderData.getProduct());
        product.setLupaButton();
        product.clickNameProductButton();
        product.clickAddCartButton();

        product.implicitWaitUntilElementExists();
        Boolean isPresent = product.displayValorTextSuccess().getSize().height > 0;
        if (isPresent == true) {

            product.waitUntilElementExists(product.displayValorTextSuccess());
            System.out.println("Valor del texto al agregar un producto: " + product.displayValorTextSuccess().getText());
            Assert.assertTrue(product.displayValorTextSuccess().isEnabled());
        }

        header.clickShoppingCartButton();
        header.clickViewShoppingCartButton();

        product.implicitWaitUntilElementExists();
        Boolean isPresent2 = product.displayValorTextFail().getSize().height > 0;

        if (isPresent2 == true) {
            product.waitUntilElementExists(product.displayValorTextFail());
            System.out.println("Valor del texto del carro de compras: " + product.displayValorTextFail().getText());
            Assert.assertTrue(product.displayValorTextFail().isEnabled());
        }

    }
}
