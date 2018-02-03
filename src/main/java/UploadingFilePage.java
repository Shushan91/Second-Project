import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UploadingFilePage extends BasePage {
    private By fileUpload = By.id ("file-upload");
    private By upload = By.id ( "file-submit");

    public UploadingFilePage(WebDriver webDriver){
        super(webDriver);
        visit("http://the-internet.herokuapp.com/upload");
    }

    public void clickFileUpload() {
        click (fileUpload);
    }
    public  void uploadFile(){
        uploadFile(fileUpload, "D:/Desktop/bdAY");
    }




}
