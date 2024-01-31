package org.Commerce.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Method;


public class TC03_RegisterCampoObligatorioTest extends BaseTest {

        @Test
        void registerSuccess(Method method) {
          driver.findElement(By.linkText("Register")).click();
          driver.findElement(By.id("gender-male")).click();

          driver.findElement(By.id("register-button")).click();

          //ASSERT CAMPOS OBLIGATORIOS first name
          WebElement campoObligatorioFirstName=driver.findElement(By.id("FirstName-error"));
          String validacionCampoFirstName=campoObligatorioFirstName.getText();
          Assert.assertEquals("First name is required.", validacionCampoFirstName);

          //ASSERT CAMPOS OBLIGATORIOS last name
          WebElement campoObligatorioLastName=driver.findElement(By.id("LastName-error"));
          String validacionCampoLastName=campoObligatorioLastName.getText();
          Assert.assertEquals("Last name is required.", validacionCampoLastName);

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

          //Email
          WebElement campoObligatorioEmail=driver.findElement(By.id("Email-error"));
          String validacionCampoEmail=campoObligatorioEmail.getText();
          Assert.assertEquals("Email is required.", validacionCampoEmail);



    }

}

