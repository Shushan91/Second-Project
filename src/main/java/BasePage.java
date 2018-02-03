import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class BasePage {
    Logger log = Logger.getLogger(Log.class.getName());
    public WebDriver driver;

    public BasePage(WebDriver webDriver) {
        this.driver = webDriver;

    }

    public void visit(String url) {
        log.info("Visiting " + url);
        driver.get(url);
    }

    public WebElement find(By locator) {
        log.info("Finding locator");
        return driver.findElement(locator);
    }

    public void sendkey(WebElement element, String path) {
        log.info("Setting path" + path);
        element.sendKeys(path);
    }

    public void uploadFile(By locator, String path) {
        find(locator).sendKeys(path);
    }


    public void click(By locator) {
        log.info("Clicking" + locator);
        find(locator).click();
    }

    public void click(WebElement element) {
        element.click();
    }
}






