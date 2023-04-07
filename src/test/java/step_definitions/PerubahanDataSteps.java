package step_definitions;

import cucumber.api.java.en.And;
import org.example.pageObject.PerubahanDataPage;
import org.openqa.selenium.WebDriver;

public class PerubahanDataSteps {
    private WebDriver webDriver;
    public PerubahanDataSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    @And("^Click edit button$")
    public void clickEditButton() throws InterruptedException {
        PerubahanDataPage perubahanDataPage = new PerubahanDataPage(webDriver);
        perubahanDataPage.setEditButton();
        Thread.sleep(2000);
    }

    @And("^Update nama with add a random string$")
    public void updateName() throws InterruptedException {
        PerubahanDataPage perubahanDataPage = new PerubahanDataPage(webDriver);
        perubahanDataPage.setNama();
        Thread.sleep(2000);
    }

    @And("^Update alamat with add a random string$")
    public void updateAlamatWithAddARandomString() throws InterruptedException {
        PerubahanDataPage perubahanDataPage = new PerubahanDataPage(webDriver);
        perubahanDataPage.setAlamat();
        Thread.sleep(2000);
    }
}
