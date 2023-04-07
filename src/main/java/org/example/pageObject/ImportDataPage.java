package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.XMLFormatter;

public class ImportDataPage {
    public static WebDriver webDriver;
    public ImportDataPage(WebDriver webDriver){
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
    }

    @FindBy(xpath = "//button[@class='btn btn-sm btn-aps dropdown-toggle dropdown-toggle-split']")
    private WebElement dropDown;
    public void selectImport(){
        dropDown.click();
    }

    @FindBy(xpath = "//a[.='Import Excel']")
    private WebElement importExcel;
    public void setImportExcel(){
        importExcel.click();
    }

    @FindBy(xpath = "//input[@name='excel_file']")
    private WebElement importFile;
    public void setImportFile(){
        String DIR = System.getProperty("user.dir");
        String a = DIR + "/src/test/resources/Files/DataPemilihTemplate.xlsx";
        importFile.sendKeys(a);
    }

    @FindBy(xpath = "//button[.='Upload']")
    private WebElement uploadButton;
    public void setUploadButton(){
        uploadButton.click();
    }

}
