package tests;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.testng.annotations.Test;
import pages.HomePage;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static org.testng.Assert.assertEquals;

public class SmokeTest {

    @Test
    public void homePageLoads(){
        try(Playwright playwright = Playwright.create()){
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
            Page page = browser.newPage();
            HomePage homePage = new HomePage(page);
            homePage.navigateToHomePage();
            String actualTitle = homePage.getTitle();
            assertEquals(actualTitle,"Automation Exercise");
            browser.close();
        }
    }
}
