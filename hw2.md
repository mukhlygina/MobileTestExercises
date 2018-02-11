1. Xpath locator is //android.widget.Button[@content-desc='Add Contact']
Class is android.widget.Button
Different locators can be used in test, emulator and real device have the same locators. 

2. In order to run test on real device capability deviceName should be changed to id of device

3. First device should be connected to PC. Then deviceName in DriverSetup should be changed.
Appium should be started. After that test can be run. No difference with run on emulator except deviceName.

4. Hard-coded values should be removed to make tests easy to support. Avoid use of thread.sleep. 
Better architecture to work with properties file and set up of native and web tests. 
Asserts should be present in order to validate values.
