1. Advantage of Singltone is that only one instance of Driver will be created
2. Improvement is to create 2 separate properties files for web and native tests in order 
to make native and web tests independent of each other
3. Check assertTrue(driver().findElement(By.id(app_package_name + "contactNameEditText")).isDisplayed()) was added
5. Checks of page title and some fields on the page