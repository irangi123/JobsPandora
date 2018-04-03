package com.jobspandora.selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FindByLocationPage {
    @FindBy(xpath = "//*[@id='service']/div[1]/div/div[1]/div")
    private WebElement lblCountryName;



//**** Methods
    public void countryName(){
       lblCountryName.getText();
      // return lblCountryName.getText();
    }


}
