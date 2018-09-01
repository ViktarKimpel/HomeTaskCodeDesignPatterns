package homeTaskCodeDesignPatterns.factorymethod;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowser implements WebDriver {
        public org.openqa.selenium.WebDriver createWebDriver() {
            System.setProperty("webdriver.gecko.driver", "d:\\_webdriver\\geckodriver.exe");
            return new FirefoxDriver();
        }
    }
