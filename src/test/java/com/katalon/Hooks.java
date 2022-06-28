
package com.katalon;
import com.cucumber.listener.Reporter;

import com.katalon.propertyreader.PropertyReader;
import com.katalon.utility.Utility;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;


/**
 * Created by Shruti
 */
public class Hooks extends Utility {
@Before  // select cucumber api jave
    public void setup(){
    selectBrowser(PropertyReader.getInstance().getProperty("browser"));
}
@After  // select cucumber api jave
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            String screenShotPath = Utility.getScreenshot(driver, scenario.getName().replace(" ", "_"));
            try {
                Reporter.addScreenCaptureFromPath(screenShotPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        closeBrowser();
    }
}
