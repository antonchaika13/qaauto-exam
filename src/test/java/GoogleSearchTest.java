import org.testng.Assert;
import org.testng.annotations.Test;
import page.GoogleFirstSearchPage;
import page.GoogleSecondSearchPage;
import page.GoogleStartPage;
import java.lang.String;

import java.util.List;


public class GoogleSearchTest extends GoogleBaseTest {



    @Test
    public void basicSearchTest() throws InterruptedException {
        String searchTerm = "Selenium";
        Assert.assertTrue(googleStartPage.isPageLoaded(),
                "Google start page is not loaded.");

        GoogleFirstSearchPage googleFirstSearchPage = googleStartPage.search(searchTerm);
        Assert.assertTrue(googleFirstSearchPage.isPageLoaded(),
                "Google search results page 1 is not loaded");

        Assert.assertEquals(googleFirstSearchPage.getResultsCount(), 10,
                "Search results count is wrong.");

        List<String> resultsList1 = googleFirstSearchPage.getResultsList();
        for (String result : resultsList1) {
            Assert.assertTrue(result.contains(searchTerm),
                    "Searchterm "+searchTerm+" is missing in following result: \n" +result);
        }

        GoogleSecondSearchPage googleSecondSearchPage = googleFirstSearchPage.clickOnSecondPage();
        Assert.assertTrue(googleSecondSearchPage.isPageLoaded(),
                "Google search results page 2 is not loaded");

        Assert.assertEquals(googleSecondSearchPage.getResultsCount(), 10,
                "Search results count is wrong.");

        List<String> resultsList2 = googleSecondSearchPage.getResultsList();
        for (String result : resultsList2) {
            Assert.assertTrue(result.contains(searchTerm),
                    "Searchterm "+searchTerm+" is missing in following result: \n" +result);
        }

        }
    }

