package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import webdriver.Browser;

/**
 * Created by Елена on 27.02.2015.
 */
public class HomePage extends AbstractPage{

    public HomePage(Browser driver)
    {
        super(driver);
    }

    public void open()
    {
        driver.get("http://olx.ua/uk/");
    }

}
