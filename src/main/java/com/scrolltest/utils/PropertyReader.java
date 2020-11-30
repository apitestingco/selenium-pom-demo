package com.scrolltest.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
    // Read the Properties file in resource
    // readItem("url") --> https://app.vwo.com
    // readItem("browser") --> firefox
    // PropertyReader instance and Call readItem with String

    static Properties properties;

    public PropertyReader(){
        loadAllProperties();
    }

    // Load the File from the resource
    public void loadAllProperties(){
        properties = new Properties(  );
        // Read the File prod_config.properties
        try{
            // Make this function with params
            String fileName =  System.getProperty("user.dir")+"/src/main/resources/prod_config.properties";
            properties.load(new FileInputStream(fileName));

        }catch (IOException e){
            throw new RuntimeException( "Not able to Find the File." );
        }
    }

    public static String readItem(String propertyName){
        return properties.getProperty(propertyName);
    }


}
