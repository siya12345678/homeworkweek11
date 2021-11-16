package testsuite;
/*
Navigate to website "//demohttps:.nopcommerce.com/"
Click on the register link.
Fill in all the fields.
Click on the register button.
Verify that the user registered successfully.

 */

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NopCommerceDemo extends BaseClass {
    String baseUrl = "https://demo.nopcommerce.com";

    @Before
    public void setup() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyThatTheUserRegisterdSuccessfull() {
        driver.findElement(By.linkText("Register")).click();
        String expectedResult = "Register";
        WebElement message = driver.findElement(By.xpath("//h1[contains(text(),'Register')]"));
        String actualResult = message.getText();
        Assert.assertEquals("Not in Register Page", expectedResult, actualResult);
        driver.findElement(By.xpath("//input[@id='gender-female']")).click();
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Siya");
        driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Patel");
        driver.findElement((By.xpath("//select[@name='DateOfBirthDay']"))).sendKeys("18");
        driver.findElement((By.xpath("//select[@name='DateOfBirthMonth']"))).sendKeys("April");
        driver.findElement((By.xpath("//select[@name='DateOfBirthYear']"))).sendKeys("1991");
        driver.findElement((By.xpath("//input[@name='Email']"))).sendKeys("abcd@gmail.com");
        driver.findElement((By.xpath("//input[@id='Company']"))).sendKeys("XYZ");
        driver.findElement((By.xpath("//input[@id='Newsletter']"))).click();
        driver.findElement((By.xpath("//input[@id='Password']"))).sendKeys("jsvp123");
        driver.findElement((By.xpath("//input[@id='ConfirmPassword']"))).sendKeys("jsvp123");
        driver.findElement((By.xpath("//button[@id='register-button']"))).click();


        }
    @After
    public void closeup () {
        closeBrowser();

    }
}



