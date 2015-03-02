package functional;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdvertisementPage;
import pages.HomePage;
import pages.PreviewPage;

/**
 * Created by Елена on 27.02.2015.
 */
public class NewAdvertisementTest extends AbstractTest {
    @Test
    public void OpenAdvertisementPage(){
        HomePage homePage = new HomePage(browser);
        homePage.open();
        AdvertisementPage advertisementPage = new AdvertisementPage(browser);
        advertisementPage.createAdvertisement();
        advertisementPage.enterTitle();
        advertisementPage.chooseCategory();
        advertisementPage.priceInput();
        advertisementPage.state();
        advertisementPage.owner();
        advertisementPage.TestFileUpload();
        advertisementPage.SelectRegion();
        advertisementPage.description();
        advertisementPage.person();
        advertisementPage.email();
        advertisementPage.agreement();
        advertisementPage.preview();
        PreviewPage previewPage = new PreviewPage(browser);
        Assert.assertTrue(previewPage.isOpened());
    }

}
