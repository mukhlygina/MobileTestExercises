package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertTrue;

public class NewContactPage {
    public WebDriver driver;
    private String app_package_name = "com.example.android.contactmanager:id/";
    By contactName = By.id(app_package_name + "contactNameEditText");
    By contactPhone = By.id(app_package_name + "contactPhoneEditText");

    public NewContactPage(WebDriver driver) {
        this.driver = driver;
    }

    public void pageOpenedCheck() {
        assertTrue(driver.findElement(contactName).isDisplayed());
        assertTrue(driver.findElement(contactPhone).isDisplayed());
    }
}
