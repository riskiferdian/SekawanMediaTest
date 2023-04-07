package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;
import org.example.pageObject.PenambahanPage;
import org.example.pageObject.WelcomePage;
import org.openqa.selenium.WebDriver;

public class PenambahanSteps {
    private WebDriver webDriver;
    public PenambahanSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @When("^User click pemilih tetap button$")
    public void userClickPemilihTetapButton() throws InterruptedException {
        WelcomePage welcomePage = new WelcomePage(webDriver);
        welcomePage.setPemilihTetapButton();
        Thread.sleep(4000);
    }

    @And("^Click tambah button$")
    public void clickTambahButton() {
        PenambahanPage penambahanPage = new PenambahanPage(webDriver);
        penambahanPage.setTambahButton();
    }

    @And("^Input no KK \"(.*)\"$")
    public void inputNoKK(String arg0) throws InterruptedException {
        PenambahanPage penambahanPage = new PenambahanPage(webDriver);
        penambahanPage.setNoKK(arg0);
        Thread.sleep(1000);
    }

    @And("^Input NIK \"(.*)\"$")
    public void inputNIK(String arg0) throws InterruptedException {
        PenambahanPage penambahanPage = new PenambahanPage(webDriver);
        penambahanPage.setNoNIK(arg0);
        Thread.sleep(1000);
    }

    @And("^Input nama \"(.*)\"$")
    public void inputNama(String arg0) throws InterruptedException {
        PenambahanPage penambahanPage = new PenambahanPage(webDriver);
        penambahanPage.setNama(arg0);
        Thread.sleep(1000);
    }

    @And("^Input alamat \"(.*)\"$")
    public void inputAlamat(String arg0) throws InterruptedException {
        PenambahanPage penambahanPage = new PenambahanPage(webDriver);
        penambahanPage.setAlamat(arg0);
        Thread.sleep(1000);
    }

    @And("^Input RT \"(.*)\"$")
    public void inputRT(String arg0) throws InterruptedException {
        PenambahanPage penambahanPage = new PenambahanPage(webDriver);
        penambahanPage.setRt(arg0);
        Thread.sleep(1000);
    }

    @And("^Input RW \"(.*)\"$")
    public void inputRW(String arg0) throws InterruptedException {
        PenambahanPage penambahanPage = new PenambahanPage(webDriver);
        penambahanPage.setRw(arg0);
        Thread.sleep(1000);
    }

    @And("^Click kelurahan")
    public void selectKelurahan() throws InterruptedException {
        PenambahanPage penambahanPage = new PenambahanPage(webDriver);
        penambahanPage.setSelectKelurahan();
        Thread.sleep(1000);
    }

    @And("^Input kelurahan name \"(.*)\"$")
    public void inputKelurahanName(String arg0) throws InterruptedException {
        PenambahanPage penambahanPage = new PenambahanPage(webDriver);
        penambahanPage.setInputKelurahan(arg0);
        Thread.sleep(2000);
    }

    @And("^Input tempat lahir \"(.*)\"$")
    public void inputTempatLahir(String arg0){
        PenambahanPage penambahanPage = new PenambahanPage(webDriver);
        penambahanPage.setTempatLahir(arg0);
    }

    @And("^Input tanggal lahir \"(.*)\"$")
    public void inputTanggalLahir(String arg0) throws InterruptedException {
        PenambahanPage penambahanPage = new PenambahanPage(webDriver);
        penambahanPage.setTanggalLahir(arg0);
        Thread.sleep(2000);
    }

    @And("^Input jenis kelamin$")
    public void inputJenisKelamin() throws InterruptedException {
        PenambahanPage penambahanPage = new PenambahanPage(webDriver);
        penambahanPage.setJenisKelamin();
        Thread.sleep(2000);
    }

    @And("^Click status perkawinan$")
    public void clickStatusPerkawinan() {
        PenambahanPage penambahanPage = new PenambahanPage(webDriver);
        penambahanPage.setStatusKawin();
    }

    @And("^Input status perkawinan \"(.*)\"$")
    public void selectStatusPerkawinan(String arg0) {
        PenambahanPage penambahanPage = new PenambahanPage(webDriver);
        penambahanPage.setInputStatus(arg0);
    }

    @And("^Click caleg$")
    public void clickCaleg() {
        PenambahanPage penambahanPage = new PenambahanPage(webDriver);
        penambahanPage.setCaleg();
    }

    @And("^Input caleg \"(.*)\"$")
    public void selectCaleg(String arg0){
        PenambahanPage penambahanPage = new PenambahanPage(webDriver);
        penambahanPage.setInputCaleg(arg0);

    }

    @And("^Click TPS$")
    public void clickTPS() {
        PenambahanPage penambahanPage = new PenambahanPage(webDriver);
        penambahanPage.setTps();
    }

    @And("^Input TPS \"(.*)\"$")
    public void selectTPS(String arg0) {
        PenambahanPage penambahanPage = new PenambahanPage(webDriver);
        penambahanPage.setInputTps(arg0);
    }

    @And("^Choose status$")
    public void chooseStatus() {
        PenambahanPage penambahanPage = new PenambahanPage(webDriver);
        penambahanPage.setStatusPemilih();
    }

    @Then("^Click simpan button$")
    public void clickSimpanButton() {
        PenambahanPage penambahanPage = new PenambahanPage(webDriver);
        penambahanPage.setSimpan();
    }
}
