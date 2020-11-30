package com.scrolltest.pages;

import com.scrolltest.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage extends BasePage {

    WebDriver driver;

    public DashboardPage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    By userNameOnDashboard = By.cssSelector("[data-qa=\"lufexuloga\"]");


    // Page Actions
    public String loggedInUserName(){
        waitForElementToAppear(userNameOnDashboard);
        return driver.findElement(userNameOnDashboard).getText();
    }

}
