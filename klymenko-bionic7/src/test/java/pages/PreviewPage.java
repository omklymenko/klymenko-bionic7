package pages;

import org.openqa.selenium.By;
import webdriver.Browser;

/**
 * Created by Olena_Klymenko on 3/2/2015.
 */
public class PreviewPage extends AbstractPage{
    public PreviewPage(Browser driver)
    {
        super(driver);
    }
    public boolean isOpened(){
        return (driver.getCurrentUrl().contains("preview")
                && driver.getCurrentUrl().contains("new-adv"));
    }
}
