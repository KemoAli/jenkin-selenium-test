package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"classpath:featureDir"}, glue = {"binding"}) //C:\Users\16465\IdeaProjects\TestProject\src\test\resources\testFeature.feature
public class TestRunner {
}
