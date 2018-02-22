package scenarios.ex3;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.ContactManagerIndexPage;
import pages.NewContactPage;
import setup.PropertyFile;

import java.io.IOException;

@Test(groups = "native")
public class SimpleNativeTests extends Hooks {
    private ContactManagerIndexPage indexPage;
    private NewContactPage contactPage;

    public SimpleNativeTests() throws IOException {
        super(PropertyFile.NATIVETEST);
    }

    @BeforeClass
    public void setUpPages() throws Exception {
        indexPage = new ContactManagerIndexPage(driver());
        contactPage = new NewContactPage(driver());
    }

    @Test(description = "Just click on button 'Add contact'")
    public void simplestTest() throws Exception {
        indexPage.clickAddButton();
        contactPage.pageOpenedCheck();
        System.out.println("Simplest Appium test done");
    }
}
