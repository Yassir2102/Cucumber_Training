package modules;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import page_objects.GoogleSearchPage;

import static utils.BrowserFactory.getFactoryDriver;

public class Hooks {
    //TODO : Configure actions to be run before and after sceanrio
    public static WebDriver driver;

   private GoogleSearchPage googleSearchPagObject = new GoogleSearchPage();
    @Before
    public void setup(){

        driver = getFactoryDriver();
        PageFactory.initElements(driver, googleSearchPagObject);
    }

    @After
    public void tearDown(){

        driver.quit();
    }
}
