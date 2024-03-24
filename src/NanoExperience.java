import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NanoExperience
{
    @Test(priority = 1)
    void open_browser()
    {
        System.out.println("This is opening of a browser");
    }

    @Test(priority = 2)
    void setup()
    {
        System.setProperty("webdriver.chrome.driver", "WebDrivers/Chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.thenanoexperience.com/");
        String title = driver.getTitle();
        System.out.println(title);

        String url_page = driver.getCurrentUrl();
        System.out.println(url_page);
        driver.quit();
    }

    @Test (priority = 3)
    void close_browser()
    {
        System.out.println("Close the browser");
    }
}
