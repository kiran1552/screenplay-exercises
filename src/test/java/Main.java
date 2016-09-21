import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by kimahale on 9/21/2016.
 */
public class Main {

    public static void main(String [] args)
    {
        System.setProperty("webdriver.chrome.driver","D:\\Serenity-BDD\\Intellij_Workspace\\screenplay-exercises-screenplay-webdriver-part-1-start\\chromedriver.exe");
        WebDriver wd= new ChromeDriver();
        wd.get("https://www.google.com/");
    }
}
