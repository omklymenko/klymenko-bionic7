package pages;

import org.openqa.selenium.WebDriver;

/**
 * Created by Елена on 27.02.2015.
 */
public class AbstractPage {
    protected WebDriver driver;

    public AbstractPage(WebDriver driver)
    {
        this.driver = driver;
    }
}
