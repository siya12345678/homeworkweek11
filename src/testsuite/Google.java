package testsuite;
/*Navigate to google https://www.google.com/
In Google search type "demo nopCommerce store" and click search
Click on the link "nopCommerce demo store"
Click on Computers and Verify that the user successfully navigated to the Computers page.
Navigate to google https://www.google.com/
In Google search type "demo nopCommerce store" and click search
Click on the link "nopCommerce demo store"
Click on Electronics and Verify that the user successfully navigated to the Electronics page.
Above same test do for Apparel, Digital downloads, Books, Jewelry, Gift Cards.
*/


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Google extends BaseClass {
    String baseUrl = " https://www.google.com";

    @Before
    public void start() {
        openBrowser(baseUrl);
        driver.findElement(By.xpath("//div[contains(text(),'I agree')]")).click();
        WebElement one = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
        one.sendKeys("demo nopcommerce store", Keys.ENTER);
        driver.findElement(By.xpath("//h3[text()='nopCommerce demo store']")).click();
    }

    @Test
    public void one() {
        driver.findElement(By.linkText("Computers")).click();
        String expectedResult = "Computers";
        WebElement two = driver.findElement(By.xpath("//h1[contains(text(),'Computers')]"));
        String actuelResult = two.getText();
        Assert.assertEquals("Your are not on Computer Page", expectedResult, actuelResult);

        driver.findElement(By.linkText("Electronics")).click();
        String expectedResult1 = "Electronics";
        WebElement three = driver.findElement(By.xpath("//h1[contains(text(),'Electronics')]"));
        String actuelResult1 = three.getText();
        Assert.assertEquals("Your are not on Computer Page", expectedResult1, actuelResult1);

        driver.findElement(By.linkText("Apparel")).click();
        String expectedResult2 = "Apparel";
        WebElement four = driver.findElement(By.xpath("//h1[contains(text(),'Apparel')]"));
        String actuelResult2 = four.getText();
        Assert.assertEquals("Your are not on Computer Page", expectedResult2, actuelResult2);

        driver.findElement(By.linkText("Digital downloads")).click();
        String expectedResult3 = "Digital downloads";
        WebElement five = driver.findElement(By.xpath("//h1[contains(text(),'Digital downloads')]"));
        String actuelResult3 = five.getText();
        Assert.assertEquals("Your are not on Computer Page", expectedResult3, actuelResult3);

        driver.findElement(By.linkText("Books")).click();
        String expectedResult4 = "Books";
        WebElement six = driver.findElement(By.xpath("//h1[contains(text(),'Books')]"));
        String actuelResult4 = six.getText();
        Assert.assertEquals("Your are not on Computer Page", expectedResult4, actuelResult4);

        driver.findElement(By.linkText("Jewelry")).click();
        String expectedResult5 = "Jewelry";
        WebElement seven = driver.findElement(By.xpath("//h1[contains(text(),'Jewelry')]"));
        String actualResult5 = seven.getText();
        Assert.assertEquals("Your are not on Computer Page", expectedResult5, actualResult5);

        driver.findElement(By.linkText("Gift Cards")).click();
        String expectedResult6 = "Gift Cards";
        WebElement eight = driver.findElement(By.xpath("//h1[contains(text(),'Gift Cards')]"));
        String actuelResult6 = eight.getText();
        Assert.assertEquals("Your are not on Computer Page", expectedResult6, actuelResult6);

    }


    @After
    public void stop() {
        closeBrowser();

    }
}
