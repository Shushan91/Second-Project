import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class BasePage {
    Logger log  = Logger.getLogger(Log.class.getName());
    public WebDriver driver;

    public BasePage(WebDriver webdriver) {
        this.driver = webdriver;
    }

    public void visit(String url) {
        log.info("Visiting " + url);
        driver.get(url);
    }

    public WebElement find(By locator) {
        log.info("finding locator");
        return driver.findElement(locator);
    }

   public void sendkey(String[] path) {
        log.info("Seting path" + path);
        return driver.sendKeys("path");

    }

    public void click(By locator) {
        log.info("Clicking" +locator);
        click((By) find(locator));
    }

}



