package scenarios.ex3;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import setup.Driver;
import setup.PropertyFile;

import java.io.IOException;

public class Hooks extends Driver {
    /**
     * Required variables will be initialized by inherited constructor
     * @throws IOException
     */
    Hooks(PropertyFile file) throws IOException {
        super(file);
    }

    @BeforeSuite(description = "Prepare driver to run test(s)", alwaysRun = true)
    public void setUp() throws Exception {
        prepareDriver();
        System.out.println("Native and WEB Driver prepared");

    }

    @AfterSuite(description = "Close driver on all tests completion", alwaysRun = true)
    public void tearDown() throws Exception {
 //       driver().quit();
        driver().closeApp();
        System.out.println("Driver closed");
    }

}
