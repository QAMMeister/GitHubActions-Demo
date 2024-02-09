package StepDefinitions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HelloWorldSteps {
    private WebDriver driver;

    @Given("I open the URL {string}")
    public void iOpenTheURL(String url) {
    	FirefoxOptions options = new FirefoxOptions();
    	options.setBinary(getFirefoxLocation());
    	driver = new FirefoxDriver(options);
        driver.get(url);
    }

    @Then("I should see the text {string}")
    public void iShouldSeeTheText(String expectedText) {
        String pageSource = driver.getPageSource();
        assertTrue("The text \"" + expectedText + "\" was not found on the page.", pageSource.contains(expectedText));
        driver.quit();
    }
}
