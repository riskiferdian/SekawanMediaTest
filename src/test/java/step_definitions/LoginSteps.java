package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.LoginPage;
import org.example.pageObject.WelcomePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginSteps {
    private WebDriver webDriver;
    public LoginSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Given("^User already open APS website$")
    public void userAlreadyOpenAPSWebsite() {
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertTrue(loginPage.verifyLoginPage());
    }

    @When("^Input username \"(.*)\"$")
    public void inputUsername(String username) throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.setUsername(username);
        Thread.sleep(1000);
    }

    @And("^Input password \"(.*)\"$")
    public void inputPassword(String password) throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.setPassword(password);
        Thread.sleep(1000);
    }

    @And("^Click login button$")
    public void clickLoginButton() throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.setLoginButton();
        Thread.sleep(1000);
    }

    @Then("^User already logged in$")
    public void userAlreadyLoggedIn() throws InterruptedException {
        WelcomePage welcomePage = new WelcomePage(webDriver);
        Assert.assertTrue(welcomePage.verifyWelcomePage());
        Thread.sleep(2000);
    }
}
