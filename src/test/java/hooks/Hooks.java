package hooks;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import utils.DriverManager;

public class Hooks {


    @Before
    public void setUp() {
        DriverManager.initDriver();
        OnStage.setTheStage(new OnlineCast());
    }
}
