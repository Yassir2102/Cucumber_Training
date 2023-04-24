package page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleSearchPage {
    //TODO : Store all google page objects/web elements

    @FindBy(name = "q")
    private static WebElement searchBar;
    @FindBy(name = "btnK")
    private static WebElement searchButton;

    public static void searchFor(String keyword) throws InterruptedException {
        searchBar.clear();
        searchBar.sendKeys(keyword);
        Thread.sleep(2000);
        searchButton.click();
    }

}
