package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.lang.String;

public class GoogleBasePage {

    protected WebDriver webDriver;



    public GoogleBasePage(WebDriver webDriver){
        this.webDriver = webDriver;
    }

    public String getCurrentTitle(){
        return webDriver.getTitle();
    }

    public WebElement waitUntilElementIsClickable (WebElement webElement, int timeOutInSeconds){
        WebDriverWait wait = new WebDriverWait(webDriver, timeOutInSeconds);
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
        return webElement;
    }


}
