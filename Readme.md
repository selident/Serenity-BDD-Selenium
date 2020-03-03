# Serenity BDD & Selenium demo project

### Overview ###

**The high level structure**

[Serenity BDD [Selenium WebDriver]] <=====> chromeDriver <=====> Chrome browser

Libraries / Tech Stacks:

- JUnit
- Maven
- Selenium WebDriver
- Serenity BDD

### How To Run ###

  * **Run tests on local**
  
    1. Clone repo
    2. Run Maven command to execute tests
        
        ```
        mvn clean verify
        ```
    3. A index.html report will be created at `target/site/serenity/index.html` 
    
  * **Run with headless mode?**

    If you want to run tests with headless mode, un-comment the below property in `serenity.properties`

        chrome.switches=--headless

    Note that your computer needs to have Chrome version 80 installed before running test.
    
    Also this test suite target to JAVA 11 and Windows OS.
