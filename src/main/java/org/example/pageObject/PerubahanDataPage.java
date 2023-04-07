package org.example.pageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;
import java.nio.charset.Charset;
import java.util.Random;

public class PerubahanDataPage {
    public static WebDriver webDriver;
    public PerubahanDataPage(WebDriver webDriver){
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
    }

    @FindBy(xpath = "//table[@id='table-inputpemilih']//tr[3]//i[@class='icon far fa-edit']")
    private WebElement editButton;
    public void setEditButton(){
        editButton.click();
    }

    @FindBy(xpath = "//input[@id='pemilih_nama']")
    private WebElement nama;
    public void setNama(){
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 5;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        String generatedString = buffer.toString();
        nama.sendKeys(" " + generatedString);
    }

    @FindBy(xpath = "//textarea[@id='pemilih_alamat']")
    private WebElement alamat;
    public void setAlamat(){
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        String generatedString = buffer.toString();
        alamat.sendKeys(" " + generatedString);
    }

}
