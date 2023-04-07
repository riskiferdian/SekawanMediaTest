package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.example.pageObject.ImportDataPage;
import org.openqa.selenium.WebDriver;

public class ImportDataSteps {
    private WebDriver webDriver;
    public ImportDataSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    @And("^Click dropdown button$")
    public void clickDropdownButton() throws InterruptedException {
        ImportDataPage importDataPage = new ImportDataPage(webDriver);
        importDataPage.selectImport();
        Thread.sleep(2000);
    }

    @And("^Click import excel$")
    public void clickImportExcel() throws InterruptedException {
        ImportDataPage importDataPage = new ImportDataPage(webDriver);
        importDataPage.setImportExcel();
        Thread.sleep(2000);
    }

    @And("^Input file import$")
    public void inputFileImport() throws InterruptedException {
        ImportDataPage importDataPage = new ImportDataPage(webDriver);
        importDataPage.setImportFile();
        Thread.sleep(2000);
    }

    @Then("^Click upload button$")
    public void clickUploadButton() {
        ImportDataPage importDataPage = new ImportDataPage(webDriver);
        importDataPage.setUploadButton();
    }
}
