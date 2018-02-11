package scenarios;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class SimpleTest extends DriverSetup {
    @BeforeClass
    public void setUp() throws MalformedURLException {
        prepareNative();
//        prepareAndroidWeb();
    }

    @Test
    public void simpleTest(){
        String app_package_name = "com.example.android.contactmanager:id/";
        driver.findElement(By.id(app_package_name + "addContactButton")).click();
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
