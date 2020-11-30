package com.scrolltest.base;

import com.scrolltest.utils.WaitForHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class BasePage {

    // Navigate
    // Wait for Element
    // Wait for Item
    // Click
    // Write Text
    // Read Text
    // Move to Element

    protected WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    // Navigate
    public void goToUrl(String url){
        driver.get(url);
    }

    public void waitForElementToAppear(By elementLocation){
        new WaitForHelper(driver).presenceOfElement(elementLocation);
    }

    public void waitForLoading(){
        new WaitForHelper(driver).implicitWait();
    }

    public void click(By elementLocation){
        driver.findElement(elementLocation).click();
    }

    public void writeText(By elementLocation, String text){
        driver.findElement(elementLocation).clear();
        driver.findElement(elementLocation).sendKeys(text);
    }

    public void readText(By elementLocation){
        driver.findElement(elementLocation).getText();
    }

    public void moveToElement(By elementLocation){
        new Actions(driver).moveToElement(driver.findElement(elementLocation)).build().perform();
    }






}
