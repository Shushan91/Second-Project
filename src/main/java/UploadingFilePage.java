import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UploadingFilePage extends BasePage {
    private By fileUpload = By.id ("file-upload");
    private By upload = By.id ( "file-submit");

    public UploadingFilePage(){

        visit("http://the-internet.herokuapp.com/upload");
    }



    public void clickFileUpload() {
        click ( fileUpload);
    }



}
