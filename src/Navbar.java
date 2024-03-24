/*
Authors: Ayleen Roque, Katarya Johnson-Williams
Class: Software Testing - CEN 4072 - CRN 10420
Instructor: Dr. Deepa Devasenapathy
Date: Spring 2024
File: Navbar.java
Description: Class to test Navigation bar on Nano Experience website
 */

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Navbar {
    // Protected variable to store the webdriver
    protected WebDriver driver;

    // Protected variable to store the executor
    protected JavascriptExecutor execute;

    // Store website URL in a variable for easy access
    protected String NanoExperienceURL = "https://www.thenanoexperience.com/";

    // Set up the webdriver before we start running the class
    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "WebDrivers/Chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
    }

    // Close the webdriver after we are done running the class
    @AfterClass
    public void close() {
        driver.quit();
    }

    // ---------------------- Test Functions ------------------------------------
    @Test(priority = 1)
    void open_browser() throws InterruptedException {
        driver.get(NanoExperienceURL);
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }

    @Test(priority = 2)
    void url_and_title() throws InterruptedException {
        // Get and print URL of webpage
        String pageURL = driver.getCurrentUrl();
        System.out.print("Current Page URL: ");
        System.out.print(pageURL);
        System.out.println();

        // Get and print title of webpage
        String title = driver.getTitle();
        System.out.print("Current Page Title: ");
        System.out.print(title);
        System.out.println();
    }

    @Test(priority = 3)
    void call_to_action_button_links() throws InterruptedException {
        // Click on "Arthrex Nano Experience" logo
        driver.findElement(By.cssSelector(".logo-container")).click();
        Thread.sleep(2000);
    }
}