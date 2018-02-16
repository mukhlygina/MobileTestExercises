package scenarios.ex2;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import setup.Driver;

import java.net.MalformedURLException;

public class SimpleTest extends DriverSetup {
    @BeforeClass
    public void setUp() throws MalformedURLException {
        prepareNative();
//        prepareAndroidWeb();
    }

    @Test
    public void simpleTest(){
        driver.findElement(By.xpath("//android.widget.Button[@content-desc='Add Contact']")).click();
        System.out.println("Simplest Appium test done");
    }

    @Test
    public void webTest() throws InterruptedException {
        driver.get("http://iana.org");
        System.out.println("Site opening done");
    }

    @AfterClass
    public void tearDown() throws MalformedURLException {
        driver.quit();
    }
}
