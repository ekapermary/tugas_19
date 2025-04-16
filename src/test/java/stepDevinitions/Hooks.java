package stepDevinitions;

import helper.Utility;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;

public class Hooks {

    @Before
    public static void setDriver(){
        Utility.startWebDriver();
    }

    @After
    public static void quitDriver(){
        Utility.quitDriver();
    }
}
