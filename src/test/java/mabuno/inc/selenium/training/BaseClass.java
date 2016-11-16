package mabuno.inc.selenium.training;

/**
 * Created by unambo on 16.11.2016.
 */

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.HasCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

    public WebDriver driver;
    public WebDriverWait wait;

    @Before
    public void start() {
        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setCapability(FirefoxDriver.MARIONETTE, false);
        System.setProperty("webdriver.chrome.driver", "E:\\tools\\chromedriver.exe");
        driver = new ChromeDriver(caps);
        System.out.println(((HasCapabilities) driver).getCapabilities());
        wait = new WebDriverWait(driver, 10);

        Runtime.getRuntime().addShutdownHook(
                new Thread(() -> {
                    driver.quit();
                    driver = null;
                }));
    }

    @After
    public void stop() {
        driver.quit();
        driver = null;
    }
}