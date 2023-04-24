package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;

public class BrowserFactory {
    //TODO : Configure browsers
    static WebDriver factoryDriver;
    private static HashMap<String, String> ConfigurationMap = PropertiesFile.read("src/test/resources/environnement/config.properties");
    static String webBrowserType= ConfigurationMap.get("browser");

    public static WebDriver getFactoryDriver(){
    switch (webBrowserType){
        case "chrome":
            WebDriverManager.chromedriver().setup();

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");
            options.addArguments("--ignore-certificate-errors");
            options.addArguments("--disable-popup-blocking");
            options.addArguments("--incognito");
            options.setHeadless(true);

            factoryDriver = new ChromeDriver(options);
            break;
        case "Firefox":
            WebDriverManager.chromedriver().setup();
            factoryDriver = new FirefoxDriver();
            break;
        case "Edge":
            WebDriverManager.edgedriver().setup();
            factoryDriver = new EdgeDriver();
            break;
        default:
            System.out.println("Please Entre a GOOD Browser");
            break;
    }

        return factoryDriver;
    }
}
