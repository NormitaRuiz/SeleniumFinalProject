package org.Commerce.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Method;


public class TC04_RegisterContraseñaDebilTest extends BaseTest {

        @Test
        void registerSuccess(Method method) {
          driver.findElement(By.linkText("Register")).click();
          driver.findElement(By.id("gender-female")).click();
          driver.findElement(By.id("FirstName")).sendKeys("Norma");
          driver.findElement(By.id("LastName")).sendKeys("Ruiz Landeo");
          //select
          WebElement inputDay = driver.findElement(By.name("DateOfBirthDay"));
          Select cbDay = new Select(inputDay);
          cbDay.selectByIndex(8);

          WebElement inputMonth = driver.findElement(By.name("DateOfBirthMonth"));
          Select cbMonth = new Select(inputMonth);
          cbMonth.selectByIndex(12);

          WebElement inputYear = driver.findElement(By.name("DateOfBirthYear"));
          Select cbYear = new Select(inputYear);
          cbYear.selectByIndex(20);

          driver.findElement(By.id("Email")).sendKeys("prueba1@gmail.com");
          driver.findElement(By.id("Company")).sendKeys("prueba");
          driver.findElement(By.id("Password")).sendKeys("1");
          driver.findElement(By.id("ConfirmPassword")).sendKeys("1");
          driver.findElement(By.id("register-button")).click();
          WebElement mensajeValidacionContrasenia=driver.findElement(By.xpath("//span[@id='Password-error']/ul/li"));
          String mensajeValidacion=  mensajeValidacionContrasenia.getText();
          Assert.assertEquals("must have at least 6 characters", mensajeValidacion);




    }

}













