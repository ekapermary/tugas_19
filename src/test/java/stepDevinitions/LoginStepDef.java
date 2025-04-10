package stepDevinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;

public class LoginStepDef {

    @Given ("user on the home page")
    public void onTheLoginPage(){
        LoginPage loginPage = new LoginPage();
        Assert.assertTrue(loginPage.isPageDisplayed());
    }

    @When ("user input {string} as username")
    public  void inputUsername(String username){
        LoginPage loginPage = new LoginPage();
        loginPage.setInputUsername(username);
    }

    @When ("user input {string} as password")
    public  void inputPassword(String password){
        LoginPage loginPage = new LoginPage();
        loginPage.setInputPassword(password);
    }

    @Then("user will redirect to home page")
    public void verifyTheHomePage(){
        HomePage homePage = new HomePage();
        Assert.assertTrue(homePage.verifyPageIsDisplayed());


    }
}
