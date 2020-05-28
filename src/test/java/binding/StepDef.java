package binding;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StepDef {

    private WebDriver webDriver;
    @Given("I go to {string}")
    public void i_go_to(String string) {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--no-sandbox","--disable-dev-shm-usage");
        webDriver = new ChromeDriver(chromeOptions);
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        webDriver.navigate().to(string);
    }
/*
    @Then("I should see {title} as title")
    public void i_should_see_as_title(String title) {
        Assert.assertTrue(webDriver.getTitle().equals(title));
    }*/
    @Then("I should see {string} as title")
    public void i_should_see_as_title(String string) {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(webDriver.getTitle().equals(string));
        //webDriver.close();

        }
}
