package org.example.pageObject;

import cucumber.api.java.zh_cn.假如;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.security.Key;

public class PenambahanPage {
    public static WebDriver webDriver;
    public PenambahanPage(WebDriver webDriver){
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
    }

    @FindBy(xpath = "//button[@class='btn btn-aps font-weight-bolder btn-sm']")
    private WebElement tambahButton;
    public void setTambahButton(){
        tambahButton.click();
    }

    @FindBy(xpath = "//input[@id='pemilih_kk']")
    private WebElement noKK;
    public void setNoKK(String inputKK){
        noKK.sendKeys(inputKK);
    }

    @FindBy(xpath = "//input[@id='pemilih_nik']")
    private WebElement noNIK;
    public void setNoNIK(String inputNIK){
        noNIK.sendKeys(inputNIK);
    }

    @FindBy(xpath = "//input[@id='pemilih_nama']")
    private WebElement nama;
    public void setNama(String inputNama){
        nama.sendKeys(inputNama);
    }

    @FindBy(xpath = "//textarea[@id='pemilih_alamat']")
    private WebElement alamat;
    public void setAlamat(String inputAlamat){
        alamat.sendKeys(inputAlamat);
    }

    @FindBy(xpath = "//input[@id='pemilih_rt']")
    private WebElement rt;
    public void setRt(String inputRT){
        rt.sendKeys(inputRT);
    }

    @FindBy(xpath = "//input[@id='pemilih_rw']")
    private WebElement rw;
    public void setRw(String inputRW){
        rw.sendKeys(inputRW);
    }

    @FindBy(id = "select2-pemilih_kelurahan_id-container")
    private WebElement selectKelurahan;
    public void setSelectKelurahan(){
        selectKelurahan.click();
    }

    @FindBy(xpath = "//input[@class='select2-search__field']")
    private WebElement kelurahan;
    public void setInputKelurahan(String inputKelurahan){
        kelurahan.sendKeys(inputKelurahan);
        kelurahan.sendKeys(Keys.RETURN);

    }

    @FindBy(xpath = "//input[@id='pemilih_tempat_lahir']")
    private WebElement tempatLahir;
    public void setTempatLahir(String inputTempatLahir){
        tempatLahir.sendKeys(inputTempatLahir);
    }

    @FindBy(xpath = "//input[@id='pemilih_tgl_lahir']")
    private WebElement tanggalLahir;
    public void setTanggalLahir(String inputTanggal) {
        tanggalLahir.sendKeys(inputTanggal);
        tanggalLahir.sendKeys(Keys.RETURN);
        tanggalLahir.sendKeys(Keys.ESCAPE);
    }

    @FindBy(xpath = "//div[@class='col-8 col-form-label']//label[1]/span[1]")
    private WebElement jenisKelamin;
    public void setJenisKelamin(){
        jenisKelamin.click();
    }

    @FindBy(css = "[aria-labelledby='select2-pemilih_status_kawin-container']")
    private WebElement statusKawin;
    public void setStatusKawin(){
        statusKawin.click();
    }

    @FindBy(xpath = "//input[@class='select2-search__field']")
    private WebElement inputStatus;
    public void setInputStatus(String status){
        inputStatus.sendKeys(status);
        inputStatus.sendKeys(Keys.RETURN);
    }

    @FindBy(css = "[aria-labelledby='select2-pemilih_caleg_id-container']")
    private WebElement caleg;
    public void setCaleg(){
        caleg.click();
    }

    @FindBy(xpath = "//input[@class='select2-search__field']")
    private WebElement inputCaleg;
    public void setInputCaleg(String caleg){
        inputCaleg.sendKeys(caleg);
        inputCaleg.sendKeys(Keys.RETURN);
    }

    @FindBy(css = "[aria-labelledby='select2-pemilih_tps_id-container']")
    private WebElement tps;
    public void setTps(){
        tps.click();
    }

    @FindBy(xpath = "//input[@class='select2-search__field']")
    private WebElement inputTps;
    public void setInputTps(String tps){
        inputTps.sendKeys(tps);
        inputTps.sendKeys(Keys.RETURN);
    }

    @FindBy(xpath = "//div[@id='Statusradio']/label[2]/span[1]")
    private WebElement statusPemilih;

    public void setStatusPemilih(){
        statusPemilih.click();
    }

    @FindBy(xpath = "//button[@id='btn-simpan']")
    private WebElement simpan;
    public void setSimpan(){
        simpan.click();
    }

}
