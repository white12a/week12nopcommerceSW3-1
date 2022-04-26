package homepage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

import java.util.List;

public class TopMenuTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";
    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    //This method will click on the menu depending on whatever string is passed as parameter
    public void selectMenu(String menu) {
        List<WebElement>topMenuNames=driver.findElements(By.xpath("//ul[@class='top-menu notmobile']/li"));
        for(WebElement names:topMenuNames){
            if(names.getText().equalsIgnoreCase(menu)){
                names.click();
                break;
            }
        }
    }
    @Test
    public void verifyComputersPageNavigation(){
        selectMenu("Computers");
        verifyText("Computers",By.xpath("//h1[contains(text(),'Computers')]"),"Computer Page Navigation Validation");
    }
    @Test
    public void verifyElectronicsPageNavigation(){
        selectMenu("Electronics");
        verifyText("Electronics",By.xpath("//div[@class='page-title']/h1"),"Electronics Page Navigation Validation");
    }
    @Test
    public void verifyApparelPageNavigation(){
        selectMenu("Apparel");
        verifyText("Apparel",By.xpath("//div[@class='page-title']/h1"),"Apparel Page Navigation Validation");
    }
    @Test
    public void verifyDigitalDownloadsPageNavigation(){
        selectMenu("Digital downloads");
        verifyText("Digital downloads",By.xpath("//div[@class='page-title']/h1"),"Digital downloads Page Navigation Validation");
    }
    @Test
    public void verifyBooksPageNavigation(){
        selectMenu("Books");
        verifyText("Books",By.xpath("//div[@class='page-title']/h1"),"Books Page Navigation Validation");
    }
    @Test
    public void verifyJewelryPageNavigation(){
        selectMenu("Jewelry");
        verifyText("Jewelry",By.xpath("//div[@class='page-title']/h1"),"Jewelry Page Navigation Validation");
    }
    @Test
    public void verifyGiftCardsPageNavigation(){
        selectMenu("Gift Cards");
        verifyText("Gift Cards",By.xpath("//div[@class='page-title']/h1"),"Gift Cards Page Navigation Validation");
    }
    @After
    public void tearDown(){
        closeBrowser();
    }


}

