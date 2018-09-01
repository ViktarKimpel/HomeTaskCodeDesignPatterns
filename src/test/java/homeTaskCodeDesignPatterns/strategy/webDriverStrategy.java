package homeTaskCodeDesignPatterns.strategy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriverStrategy {
    private static WebDriver driver;

    public static WebDriver getInstance() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "d:\\_webdriver\\chromedriver\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        return driver;
    }
}
