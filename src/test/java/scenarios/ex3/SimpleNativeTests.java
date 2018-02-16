package scenarios.ex3;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import setup.PropertyFile;

import java.io.IOException;

import static org.testng.Assert.assertTrue;

@Test(groups = "native")
public class SimpleNativeTests extends Hooks {
    protected SimpleNativeTests() throws IOException {
        super(PropertyFile.NATIVETEST);
    }

    @Test(description = "Just click on button 'Add contact'")
    public void simplestTest() throws Exception {
        String app_package_name = "com.example.android.contactmanager:id/";
        By add_btn = By.id(app_package_name + "addContactButton");
        driver().findElement(add_btn).click();
        assertTrue(driver().findElement(By.id(app_package_name + "contactNameEditText")).isDisplayed());
        assertTrue(driver().findElement(By.id(app_package_name + "contactPhoneEditText")).isDisplayed());
    // The result of clicking doesn't checked.
        System.out.println("Simplest Appium test done");
    }
}
