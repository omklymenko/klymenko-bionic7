package functional;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import webdriver.Browser;

/**
 * Created by Елена on 27.02.2015.
 */
public class AbstractTest {
    public Browser browser;

    @BeforeSuite
    public void initEnv()
    {

        browser = new Browser(new FirefoxDriver());
    }

//    @AfterSuite
//    public void shutEnv()
//    {
//        if (browser != null)
//            browser.quit();
//    }
}
