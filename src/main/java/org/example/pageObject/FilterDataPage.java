package org.example.pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilterDataPage {
    public static WebDriver webDriver;
    public FilterDataPage(WebDriver webDriver){
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
    }

    @FindBy(xpath = "//button[@class='btn btn-sm btn-light-aps d-flex justify-content-center']")
    private WebElement filterButton;
    public void setFilterButton(){
        filterButton.click();
    }

    @FindBy(xpath = "//h5[@id='table-inputpemilih_id-modalLabel']")
    private WebElement popUpFilter;
    public boolean setPopUpFilter(){
        return popUpFilter.isDisplayed();
    }

    @FindBy(css = "[aria-labelledby='select2-filter_provinsi_id-container'] > .select2-selection__rendered")
    private WebElement provinsi;
    public void setProvinsi(){
        provinsi.click();
    }

    @FindBy(xpath = "//input[@class='select2-search__field']")
    private WebElement inputProvinsi;
    public void setInputProvinsi(String provinsi){
        inputProvinsi.sendKeys(provinsi);
        inputProvinsi.sendKeys(Keys.RETURN);
    }

    @FindBy(xpath = "//div[@class='modal fade show']//span[@class='select2-selection__placeholder']")
    private WebElement kota;
    public void setKota(){
        kota.click();
    }

    @FindBy(xpath = "//input[@class='select2-search__field']")
    private WebElement inputKota;
    public void setInputKota(String kota){
        inputKota.sendKeys(kota);
        inputKota.sendKeys(Keys.RETURN);
    }

    @FindBy(css = "[aria-labelledby='select2-filter_kecamatan_id-container'] > .select2-selection__rendered")
    private WebElement kecamatan;
    public void setKecamatan(){
        kecamatan.click();
    }

    @FindBy(xpath = "//input[@class='select2-search__field']")
    private WebElement inputKecamatan;
    public void setInputKecamatan(String kecamatan){
        inputKecamatan.sendKeys(kecamatan);
        inputKecamatan.sendKeys(Keys.RETURN);
    }

    @FindBy(css = "[aria-labelledby='select2-filter_kelurahan_id-container'] > .select2-selection__rendered")
    private WebElement kelurahan;
    public void setKelurahan(){
        kelurahan.click();
    }

    @FindBy(xpath = "//input[@class='select2-search__field']")
    private WebElement inputKelurahan;
    public void setInputKelurahan(String kelurahan){
        inputKelurahan.sendKeys(kelurahan);
        inputKelurahan.sendKeys(Keys.RETURN);
    }

    @FindBy(css = "[aria-labelledby='select2-filter_tps_id-container'] > .select2-selection__rendered")
    private WebElement TPS;
    public void setTPS(){
        TPS.click();
    }

    @FindBy(xpath = "//input[@class='select2-search__field']")
    private WebElement inputTps;
    public void setInputTps(String tps){
        inputTps.sendKeys(tps);
        inputTps.sendKeys(Keys.RETURN);
    }

    @FindBy(xpath = "//div[@class='modal fade show']//button[@class='btn btn-sm btn-aps font-weight-bold']")
    private WebElement applyButton;
    public void setApplyButton(){
        applyButton.click();
    }

    @FindBy(xpath = "//tr[@class='odd']/td[.='Baru']")
    private WebElement verifyFilter;
    public String setVerifyFilter(){
        return verifyFilter.getText();
    }
}


