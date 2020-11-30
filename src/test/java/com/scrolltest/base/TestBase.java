package com.scrolltest.base;

import com.scrolltest.utils.DriverManger;
import com.scrolltest.utils.Log;
import com.scrolltest.utils.PropertyReader;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import java.io.ByteArrayInputStream;

public class TestBase extends DriverManger {

    // Setup and TearDown
    public WebDriver driver;
    PropertyReader pr = new PropertyReader();

    public  TestBase(){
        this.driver = super.getDriver();
    }

    @BeforeMethod(alwaysRun = true)
    public void setup(){
        //Read from Properties file and set the Webdriver
        try{
            if(PropertyReader.readItem("browser").equalsIgnoreCase("firefox")){
                driver = new FirefoxDriver(  );
                driver.manage().window().maximize();
            }
            else {
                try{
                    throw new Exception( "Browser Driver is not supported." );
                }
                catch (Exception e)
                {
                    Log.error("No Compatible browser found.",e );
                }
            }

        }catch (Exception e){
            Log.error("Browser Launch error", e);
        }
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        driver.quit();
    }

    public void takeScreenShot(String name){
        Allure.addAttachment(name, new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
    }

}
