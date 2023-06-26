package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";


    @Before
        public void setup (){

        openBrowser(baseUrl);
        }
        @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        // Enter “Admin” username
        driver.findElement(By.name("username")).sendKeys("Admin");
        //Enter “admin123 password
        driver.findElement(By.name("password")).sendKeys("admin123");
        //Click on ‘LOGIN’ button
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        //Verify the ‘Dashboard’ text is display
        String expectedDisplay = "Dashboard";
        String actualDisplay = driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).getText();
        Assert.assertEquals(expectedDisplay, actualDisplay);
    }


        @After
        public void tearDown(){
            closeBrowser();
        }

}
