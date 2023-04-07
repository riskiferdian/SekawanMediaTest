package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.example.pageObject.PencarianPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class PencarianSteps {
    private WebDriver webDriver;
    public PencarianSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    @And("^Input nama \"(.*)\" on search field and click enter$")
    public void inputNamaOnSearchFieldAndClickEnter(String arg0) throws InterruptedException {
        PencarianPage pencarianPage = new PencarianPage(webDriver);
        pencarianPage.setPencarianField(arg0);
        Thread.sleep(2000);
    }

    @Then("^System show nama should be \"(.*)\"$")
    public void verifyNamaShowedOnThePage(String verifyNama) throws InterruptedException {
        PencarianPage pencarianPage = new PencarianPage(webDriver);
        Assert.assertEquals(verifyNama,pencarianPage.setVerifySearch());
        Thread.sleep(2000);
    }
}
