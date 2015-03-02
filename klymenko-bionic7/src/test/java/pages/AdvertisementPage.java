package pages;

//import com.sun.glass.ui.Robot;
import org.openqa.selenium.By;
import org.testng.Assert;
import webdriver.Browser;

//import java.awt.*;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.net.URISyntaxException;
import java.util.concurrent.TimeUnit;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

/**
 * Created by Елена on 27.02.2015.
 */
public class AdvertisementPage extends AbstractPage {
    private static final By createAdvertisementLink = By.id("post-new-ad");
    private static final By advTitle = By.id("add-title");
    private static final By advCategory = By.cssSelector("#targetrenderSelect1-0>dt>a");
    private static final By category = By.id("cat-36");
    private static final By childrenWorld = By.cssSelector("a[data-category = '69']");
    //private static final By childrenWear = By.cssSelector("a[data-category = '1']");
    private static final By price = By.className("paramPriceInput");
    private static final By state = By.xpath(".//*[@id='targetparam13']/dt/a");
    private static final By chooseState = By.xpath(".//*[@id='targetparam13']/dd/ul/li[3]/a");

    public AdvertisementPage(Browser browser) {
        super(browser);
    }

    public void createAdvertisement() {
        driver.findElement(createAdvertisementLink).click();
    }

    public void enterTitle() {
        driver.findElement(advTitle).sendKeys("New Adv");
    }

    public void chooseCategory() {
        driver.findElement(advCategory).click();
        //driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.findElement(category).click();
        driver.findElement(childrenWorld).click();
        //driver.findElement(childrenWear).click();
    }

    public void priceInput() {
        driver.findElement(price).sendKeys("500");
    }

    public void state() {
        driver.findElement(state).click();
        driver.findElement(chooseState).click();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        //driver.findElement(By.className("add2")).sendKeys("E:\\klymenko-bionic7\\g6Zx0AY0Mfc.jpg");
    }

    public void owner(){
        driver.findElement(By.cssSelector("#targetid_private_business>dt>a")).click();
        driver.findElement(By.xpath(".//*[@id='targetid_private_business']/dd/ul/li[2]/a")).click();
    }
    public void description(){
        driver.findElement(By.id("add-description")).sendKeys("Неимоверно нежное изысканное выпускное платье Tony Bowls, удачное сочетание силуэта, отделки и оптимального объема пышной струящейся юбки создает некую таинственность и очарование.\n" +
                "Размер 6\n" +
                "\n" +
                "Смотрите другие мои объявления,есть много интересного)");
    }

    public static void setClipboardData(String string) {
        StringSelection stringSelection = new StringSelection(string);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
    }

    public void TestFileUpload() {
        {
            driver.findElement(By.xpath(".//*[@id='add-file-1']/div/a")).click();
            setClipboardData("D:\\klymenko-bionic7\\g6Zx0AY0Mfc.jpg");

            Robot robot = null;
            try {
                robot = new Robot();
            } catch (AWTException e) {
                e.printStackTrace();
            }
            robot.setAutoDelay(900);

            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);

            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);

            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        }
    }
    public void SelectRegion(){
        driver.findElement(By.cssSelector("#targetregion-id-select>dt>a")).click();
        driver.findElement(By.xpath(".//*[@id='targetregion-id-select']/dd/ul/li[2]/a")).click();
        driver.findElement(By.cssSelector("#targetsubregion-id-select>dt>a")).click();
        driver.findElement(By.xpath(".//*[@id='targetsubregion-id-select']/dd/ul/li[8]/a")).click();
    }
    public void person(){
        driver.findElement(By.id("add-person")).sendKeys("Елена");
    }
    public void email(){
        driver.findElement(By.id("add-email")).sendKeys("ttt.rrr@gmail.com");
    }
    public void agreement(){
        driver.findElement(By.cssSelector("label[for='agreement']")).click();
    }
    public void preview(){
        driver.findElement(By.id("preview-link")).click();
    }
}
