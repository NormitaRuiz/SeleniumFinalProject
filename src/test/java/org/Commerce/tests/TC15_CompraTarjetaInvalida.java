package org.Commerce.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class TC15_CompraTarjetaInvalida extends BaseTest {

    @Test
    public void tarjetaInvalida(){
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.id("Email")).sendKeys("prueba1@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("123456");
        //ingresando opcion computers
        driver.findElement(By.linkText("Computers")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //dar clic en la opcion desktop
        List<WebElement> seleccionarDesktop=driver.findElements(By.xpath("//div[@class='picture']/a"));
        seleccionarDesktop.get(1).click();

        List<WebElement> desktop=driver.findElements(By.xpath("//div[@class='buttons']//button[contains(text(),'Add to cart')]"));
        desktop.get(0).click();

        List<WebElement> laptop=driver.findElements(By.xpath("//div[@class='buttons']"));
        laptop.get(1).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //dar clic en el carrito
        driver.findElement(By.xpath("//li[@id='topcartlink']/a/span[contains(text(),'Shopping cart')]")).click();

        driver.findElement(By.id("termsofservice")).click();
        driver.findElement(By.id("checkout")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
        driver.findElement(By.xpath("//button[@class='button-1 checkout-as-guest-button']")).click();

        //Billing Address
        driver.findElement(By.id("BillingNewAddress_FirstName")).sendKeys("Ruiz Landeo");
        driver.findElement(By.id("BillingNewAddress_LastName")).sendKeys("Norma");
        driver.findElement(By.id("BillingNewAddress_Email")).sendKeys("prueba1@gmail.com");
        driver.findElement(By.id("BillingNewAddress_Company")).sendKeys("prueba");
        List<WebElement> country=driver.findElements(By.id("BillingNewAddress_CountryId"));
        country.get(10).click();





    }

}
