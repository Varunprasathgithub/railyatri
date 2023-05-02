package Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\varun\\IdeaProjects\\Seli\\src\\main\\resources\\Feature\\LiveTrainStatus.feature",
        glue = {"StepDef"}
)

public class Runner {


}
