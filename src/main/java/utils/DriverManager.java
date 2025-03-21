package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {


    private static WebDriver driver;

    public static void initDriver() {
        WebDriverManager.chromedriver().setup();
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void finisDriver() {
        driver.quit();
    }

}
