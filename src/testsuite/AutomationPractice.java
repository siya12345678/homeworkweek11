package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/*Open url : http://automationpractice.com/index.php
Click on Sign In
Enter correct Email in Email field
Enter wrong Password in Password field
Click on the Sign In button.
Expected Result:
Error Message “There is 1 error”
 */
public class AutomationPractice extends BaseClass {
    String baseUrl = " http://automationpractice.com/index.php";

    @Before
    public void open() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyThatTheUsershouldnotregistersuccessfully() {
        driver.findElement(By.xpath("//a[@class='login']")).click();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("siya123@gmail.com");
        driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("Xyz123");
        driver.findElement(By.xpath("//button[@name='SubmitLogin']")).click();
        String expectedresult="There is 1 error";
        WebElement result = driver.findElement(By.xpath("//p[text()='There is 1 error']"));
        String actulresult=result.getText();
        Assert.assertEquals("user successfully signin",expectedresult,actulresult);

    }
    @After
    public void close(){
        closeBrowser();
    }

}
