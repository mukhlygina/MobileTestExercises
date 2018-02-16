package scenarios.ex3;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import setup.PropertyFile;

import java.io.IOException;

import static org.testng.Assert.assertTrue;

@Test(groups = "web")
public class SimpleWebTests extends Hooks {
    protected SimpleWebTests() throws IOException {
        super(PropertyFile.WEBTEST);
    }

    @Test(description = "Open website")
    public void webTest() throws Exception {
        driver().get(SUT);
        driverWait().until(ExpectedConditions.urlToBe(SUT+"/"));
        assertTrue(driver().getTitle().equals("Internet Assigned Numbers Authority"));
        assertTrue(driver().findElement(By.cssSelector("#intro")).isDisplayed());
        System.out.println("Site opening done");
    }

}
