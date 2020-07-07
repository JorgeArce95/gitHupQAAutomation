import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.util.Random;

public class baseTest {

    public WebDriver driver;

    public String baseURL = "https://demo.opencart.com/";


    @BeforeMethod(alwaysRun = true)
    @Parameters({"browser"})
    public void setUpTests(@Optional("chrome") String browser) {
        setInitialConfiguration(browser);

    }

    @AfterMethod(alwaysRun = true)

    public void tearDown() {
        driver.close();
        try {
            driver.quit();
        } catch (WebDriverException ex) {
            System.out.println("Sesion driver esta cerrada");
        }

    }

    private void setInitialConfiguration(String browser) {


        System.out.println("Before Method Setup");
        if (browser.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        driver.get(baseURL);
    }

    public String getEmailRandom(String ramdomChars) {
        ramdomChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * ramdomChars.length());
            salt.append(ramdomChars.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }
}

