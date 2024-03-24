/*
Authors: Ayleen Roque, Katarya Johnson-William
Class: Software Testing - CEN 4072 - CRN 10420
Instructor: Dr. Deepa Devasenapathy
Date: Spring 2024
File:
Description:
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Navbar
{
    // Variable to store the webdriver
    protected WebDriver driver;

    // Set up the webdriver before we start running the class
    @BeforeClass // set up the webdriver before we begin testing
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "WebDrivers/Chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
    }

    // Close the webdriver after we are done running the class
    @AfterClass // close the driver after we are done testing
    public void close() {
        driver.close();
    }

    // ---------------------- Test Functions ------------------------------------
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
