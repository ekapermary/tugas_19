package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions (
        plugin = {"pretty", "html:reports/cucumber-report.html"}, // berisi plugin yang akan di gunakan
            glue = {"stepDevinitions"}, // lokasi file stepdefinition
                features = {"src/test/resources/features"} // lokasi file .feature
    )
        public class CucumberTestRunner{

    }


