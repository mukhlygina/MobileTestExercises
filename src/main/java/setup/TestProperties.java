package setup;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {
    Properties currentProps = new Properties();

    Properties getCurrentProps(PropertyFile file) throws IOException {
        try(FileInputStream in = new FileInputStream(System.getProperty("user.dir") +
                "/src/main/resources/" + file.toString().toLowerCase() + ".properties")) {
            currentProps.load(in);
        }
        return currentProps;
    }

    protected String getProp(String propKey, PropertyFile file) throws IOException {
        if (!currentProps.containsKey(propKey)) {
            currentProps = getCurrentProps(file);
        }
        // "default" form used to handle the absence of parameter
        return currentProps.getProperty(propKey, null);
    }
}
