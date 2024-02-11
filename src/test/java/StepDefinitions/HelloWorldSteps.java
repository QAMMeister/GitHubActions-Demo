package StepDefinitions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HelloWorldSteps {
    private WebDriver driver;

    @Given("I open the URL {string}")
    public void iOpenTheURL(String url) {
		WebDriverManager.chromedriver().setup();
	    
		//Map<String, Object> prefs = new HashMap<String, Object>();
		//prefs.put("profile.default_content_setting_values.cookies", 2);
		//ChromeOptions options = new ChromeOptions();
		//options.setExperimentalOption("prefs", prefs);	
		driver = new ChromeDriver(options);
        driver.get(url);
    }

    @Then("I should see the text {string}")
    public void iShouldSeeTheText(String expectedText) {
        String pageSource = driver.getPageSource();
        assertTrue("The text \"" + expectedText + "\" was not found on the page.", pageSource.contains(expectedText));
        driver.quit();
    }
}
