package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import gherkin.lexer.Th;
import org.example.pageObject.FilterDataPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class FilterDataSteps {
    private WebDriver webDriver;
    public FilterDataSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    @And("^Click filter data button$")
    public void clickFilterDataButton() throws InterruptedException {
        FilterDataPage filterDataPage = new FilterDataPage(webDriver);
        filterDataPage.setFilterButton();
        Thread.sleep(2000);
    }

    @Then("^Verify pop up filter data$")
    public void verifyPopUpFilterData() throws InterruptedException {
        FilterDataPage filterDataPage = new FilterDataPage(webDriver);
        Assert.assertTrue(filterDataPage.setPopUpFilter());
        Thread.sleep(2000);
    }

    @And("^Click provinsi$")
    public void clickProvinsi() {
        FilterDataPage filterDataPage = new FilterDataPage(webDriver);
        filterDataPage.setProvinsi();
    }

    @And("^Input nama provinsi \"(.*)\"$")
    public void inputNamaProvinsi(String arg0) throws InterruptedException {
        FilterDataPage filterDataPage = new FilterDataPage(webDriver);
        filterDataPage.setInputProvinsi(arg0);
        Thread.sleep(2000);
    }

    @And("^Click kota atau kabupaten$")
    public void clickKotaAtauKabupaten() {
        FilterDataPage filterDataPage = new FilterDataPage(webDriver);
        filterDataPage.setKota();
    }

    @And("^Input nama kota atau kabupaten \"(.*)\"$")
    public void inputNamaKotaAtauKabupaten(String arg0) throws InterruptedException {
        FilterDataPage filterDataPage = new FilterDataPage(webDriver);
        filterDataPage.setInputKota(arg0);
        Thread.sleep(2000);
    }

    @And("^Click kecamatan$")
    public void clickKecamatan() {
        FilterDataPage filterDataPage = new FilterDataPage(webDriver);
        filterDataPage.setKecamatan();
    }

    @And("^Input nama kecamatan \"(.*)\"$")
    public void inputNamaKecamatan(String arg0) throws InterruptedException {
        FilterDataPage filterDataPage = new FilterDataPage(webDriver);
        filterDataPage.setInputKecamatan(arg0);
        Thread.sleep(2000);
    }

    @And("^Click nama kelurahan$")
    public void clickNamaKelurahan() {
        FilterDataPage filterDataPage = new FilterDataPage(webDriver);
        filterDataPage.setKelurahan();
    }

    @And("^Input nama kelurahan \"(.*)\"$")
    public void inputNamaKelurahan(String arg0) throws InterruptedException {
        FilterDataPage filterDataPage = new FilterDataPage(webDriver);
        filterDataPage.setInputKelurahan(arg0);
        Thread.sleep(2000);
    }

    @And("^Click nama TPS$")
    public void clickNamaTPS() {
        FilterDataPage filterDataPage = new FilterDataPage(webDriver);
        filterDataPage.setTPS();
    }

    @And("^Input nama TPS \"(.*)\"$")
    public void inputNamaTPS(String arg0) throws InterruptedException {
        FilterDataPage filterDataPage = new FilterDataPage(webDriver);
        filterDataPage.setInputTps(arg0);
        Thread.sleep(2000);
    }

    @And("^Click apply button$")
    public void clickApplyButton() {
        FilterDataPage filterDataPage = new FilterDataPage(webDriver);
        filterDataPage.setApplyButton();
    }

    @Then("^Verify filtered data tps \"(.*)\"$")
    public void verifyFilteredData(String verifyText) {
        FilterDataPage filterDataPage = new FilterDataPage(webDriver);
        Assert.assertEquals(verifyText, filterDataPage.setVerifyFilter());
    }
}
