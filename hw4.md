1. browser=Safari in DesiredCapabilities, webtest.properties file was changed -> platform=iOS and UDID of certain device is used.
Webtest for iOS is passed.

2. appPackage=com.example.android.contactmanager and appActivity=.ContactManager were added
to properties file, on a certain device ContacManager app was uploaded manually. After this test passes.

3. It is better to use Page Objects pattern in order to divide tests and pages