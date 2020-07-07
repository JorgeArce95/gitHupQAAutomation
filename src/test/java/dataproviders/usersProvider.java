package dataproviders;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import org.testng.annotations.DataProvider;
import pojo.searchProductData;
import pojo.registerData;
import pojo.currenciesData;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class usersProvider {

    @DataProvider(name="getRegisterDataFromJson")
    private  Object[][] getRegisterDataFromJson() throws FileNotFoundException {
        JsonElement jsonData = new JsonParser().parse(new FileReader("src/test/resources/data/register.json"));
        JsonElement dataSet = jsonData.getAsJsonObject().get("dataset");

        List<registerData> SignInData = new Gson().fromJson(dataSet, new TypeToken<List<registerData>>() {}.getType());

        Object[][] retunValue= new Object[SignInData.size()][1];

        int index = 0;

        for (Object [] each: retunValue){
            each[0] = SignInData.get(index++);
        }

        return retunValue;

    }


    @DataProvider(name="getProductDataFromJson")
    private  Object[][] getProductDataFromJson() throws FileNotFoundException {
        JsonElement jsonData = new JsonParser().parse(new FileReader("src/test/resources/data/product.json"));
        JsonElement dataSet = jsonData.getAsJsonObject().get("dataset");

        List<searchProductData> PurchaseOrderData = new Gson().fromJson(dataSet, new TypeToken<List<searchProductData>>() {}.getType());

        Object[][] retunValue= new Object[PurchaseOrderData.size()][1];

        int index = 0;

        for (Object [] each: retunValue){
            each[0] = PurchaseOrderData.get(index++);
        }

        return retunValue;

    }
    @DataProvider(name="getCurrenciesDataFromJson")
    private  Object[][] getCurrenciesDataFromJson() throws FileNotFoundException {
        JsonElement jsonData = new JsonParser().parse(new FileReader("src/test/resources/data/currencies.json"));
        JsonElement dataSet = jsonData.getAsJsonObject().get("dataset");

        List<currenciesData> CurrenciesData = new Gson().fromJson(dataSet, new TypeToken<List<currenciesData>>() {}.getType());

        Object[][] retunValue= new Object[CurrenciesData.size()][1];

        int index = 0;

        for (Object [] each: retunValue){
            each[0] = CurrenciesData.get(index++);
        }

        return retunValue;

    }
}
