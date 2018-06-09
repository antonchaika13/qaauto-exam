package page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import page.GoogleFirstSearchPage;
import java.lang.String;

public class GoogleStartPage extends GoogleBasePage {

    @FindBy(xpath ="//input[@role='combobox']")
    private WebElement searchBox;

    public GoogleStartPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    public boolean isPageLoaded() {
        return searchBox.isDisplayed();
    }

    public GoogleFirstSearchPage search(String searchTerm) {
        searchBox.sendKeys(searchTerm);
        searchBox.sendKeys(Keys.RETURN);
        return new GoogleFirstSearchPage(webDriver);
        //return PageFactory.initElements(webDriver, GoogleFirstSearchPage.class);
    }

}
