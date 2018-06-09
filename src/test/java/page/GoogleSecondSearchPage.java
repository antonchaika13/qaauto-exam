package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.lang.String;

import java.util.List;

public class GoogleSecondSearchPage extends GoogleFirstSearchPage {
    @FindBy(xpath ="//a[@aria-label='Page 3']")
    private WebElement thirdPageLink;


    public GoogleSecondSearchPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    public boolean isPageLoaded() {
        waitUntilElementIsClickable(thirdPageLink,150);
        return thirdPageLink.isDisplayed();
    }
}
