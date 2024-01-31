package org.Commerce.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {

        protected WebDriver driver;
        private String BASE_URL="https://demo.nopcommerce.com/";


    @BeforeMethod
    public void setupPOM() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get(BASE_URL);

    }

    @AfterMethod
    public void teardown() {

        //driver.close();
    }

}
