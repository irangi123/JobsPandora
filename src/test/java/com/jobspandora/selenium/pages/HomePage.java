package com.jobspandora.selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class HomePage {

   //initiate keyword field
    @FindBy(xpath = "//*[@id='serch_original']/div[2]/div/form/input")
            private WebElement txtKeyword;

    @FindBy(id="contry_search")
          private  WebElement dwnCountry;

    @FindBy(xpath = "//*[@id='serch_original']/div[2]/div/form/button/i")
        private WebElement btnSearch;

    @FindBy(xpath = "//*[@id='navigation']/div/div[2]/div[2]/button/i[1]")
        private WebElement lnkSearchAJob;

    @FindBy(xpath = "//*[@id='find_by_loc_div']/div[1]/div[3]/a/i")
        private WebElement lnkCountry;

    //clear Designation
    public void clearDesignation(){
        txtKeyword.clear();
    }
    //Click on Keyword testb box
    public void clickKeyword(){
        txtKeyword.click();
    }
    //insert Designation
    public void enterDesignation(String keyword){
        txtKeyword.sendKeys(keyword);
    }

    //select Country from dropdown
    public void selectCountry(String country){
        Select drpCountry = new Select( dwnCountry );
        drpCountry.selectByVisibleText(country);
    }
    //Click Search Button
    public void clickSearch(){
        btnSearch.click();
    }
    //************************Search by Location
    //Click Country Australia
    public void clickAustralia(){
        lnkCountry.click();
    }

}
