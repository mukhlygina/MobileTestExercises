package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactManagerIndexPage {
    public WebDriver driver;
    private String app_package_name = "com.example.android.contactmanager:id/";
    By addButton = By.id(app_package_name + "addContactButton");

    public ContactManagerIndexPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAddButton() {
        driver.findElement(addButton).click();
    }
}