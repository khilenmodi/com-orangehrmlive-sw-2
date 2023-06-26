package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class ForgotPasswordTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";


    @Before
    public void setup () {
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        // forget password link
        driver.findElement(By.xpath("//p[@class = 'oxd-text oxd-text--p orangehrm-login-forgot-header']")).click();
        // Enter “Admin” username
        driver.findElement(By.name("username")).sendKeys("Admin");
        // click on reset password
       // driver.findElement(By.xpath("//button [@class = 'oxd-button oxd-button--large oxd-button--secondary orangehrm-forgot-password-button orangehrm-forgot-password-button--reset']")).click();
        // expected result
        String expectedMessage = "Reset Password";
        String actualMessage = driver.findElement(By.xpath("//button [@type = 'submit']")).getText();
        Assert.assertEquals("Reset Password", expectedMessage,actualMessage);

    }

    @After
    public void teardown(){
       closeBrowser();
    }


}
