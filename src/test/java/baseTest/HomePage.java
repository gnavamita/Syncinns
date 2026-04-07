package baseTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class HomePage {

    public WebDriverManager.chromedriver().setup();
    public WebDriver driver;
    public driver = new ChromeDriver();
}
