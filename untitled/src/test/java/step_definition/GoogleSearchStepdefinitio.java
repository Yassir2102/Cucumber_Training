package step_definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import static modules.Hooks.driver;

import static org.junit.Assert.assertTrue;
import static page_objects.GoogleSearchPage.searchFor;

public class GoogleSearchStepdefinitio {



    @Given("I open google search page")
    public void iOpenGoogleSearchPage() {


        driver.get("https://www.google.com/");

    }

    @When("I lookup the word {string}")
    public void iLookupTheWord(String arg0) throws InterruptedException {
        searchFor(arg0);

    }

    @Then("search result display the word {string}")
    public void searchResultDisplayTheWord(String arg0) {

        assertTrue(driver.getTitle().contains(arg0));
    }
}
