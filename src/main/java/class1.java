
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class1 {

    public static void main (String[] args){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\uzay\\Desktop\\chromedriver.exe");

        Webdriver driver = new ChromeDriver();

        driver.manage().window().maximize();

    }
}
