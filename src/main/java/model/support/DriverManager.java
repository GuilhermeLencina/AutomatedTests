package model.support;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;

public class DriverManager {
    private static WebDriver driver;

    private static WebDriver getDriverManager(DriverType browser) {

        switch (browser) {
            case CHROME:
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--start--maximized");
                driver = new ChromeDriver(chromeOptions);
                break;
            case OPERA:
                WebDriverManager.operadriver().setup();
                OperaOptions operaOptions = new OperaOptions();
                operaOptions.addArguments("--start--maximized");
                driver = new OperaDriver(operaOptions);
                 break;
            case FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                driver = new FirefoxDriver(firefoxOptions);
                break;
            case HEADLESS:
                WebDriverManager.chromedriver().setup();
                ChromeOptions headless = new ChromeOptions();
                headless.addArguments("--headless");
                driver = new ChromeDriver(headless);
                break;
            case IE:
                WebDriverManager.iedriver().setup();
                MutableCapabilities capabilities = new MutableCapabilities();
                capabilities.setCapability(CapabilityType.BROWSER_NAME, BrowserType.IE);
                capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
                driver = new InternetExplorerDriver();
                break;
            case EDGE:
                WebDriverManager.edgedriver().setup();
                EdgeOptions edgeOptions = new EdgeOptions();
                driver = new EdgeDriver(edgeOptions);
                break;
            default:
                break;
        }
        return driver;
    }

    public static WebDriver getDriver(DriverType browser) {
        if (driver == null) {
            driver = getDriverManager(browser);
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
