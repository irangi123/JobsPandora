package com.jobspandora.selenium.test;

import com.jobspandora.selenium.pages.FindByLocationPage;
import com.jobspandora.selenium.pages.HomePage;
import com.jobspandora.selenium.util.Constants;
import com.jobspandora.selenium.util.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends TestBase {

    //Search Country from Dropdown
    @Test
    public void testCountryDropDown(){
        webDriver.get(Constants.BASE_URL);
        HomePage homePage = PageFactory.initElements(webDriver, HomePage.class);
        homePage.clickKeyword();
        homePage.enterDesignation(Constants.DESIGNATION1);
        //homePage.clickDropDown();
        homePage.selectCountry(Constants.COUNTRY);
        homePage.clickSearch();
        Assert.assertEquals(webDriver.getCurrentUrl(),"http://jobspandora.com/topjobs/home_search/find_by_general");
        //*** Navigate back to preveouse page
        webDriver.navigate().back();
        }

     @Test
    public void testFindByLocation(){
        webDriver.get(Constants.BASE_URL);
        HomePage homePage = PageFactory.initElements(webDriver, HomePage.class);
        homePage.clickAustralia();
        Assert.assertEquals(webDriver.getCurrentUrl(),"http://jobspandora.com/topjobs/home/find_by_location?ctid=14&city_id=0");
        FindByLocationPage findByLocationPage = PageFactory.initElements(webDriver, FindByLocationPage.class);
        findByLocationPage.countryName();
         System.out.println("test Pass");
       // Assert.assertEquals(findByLocationPage.countryName(),"");
     }
}
