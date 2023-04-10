package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTest {
    static String browser = "Chrome";
    static WebDriver driver;
    static String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser name");
        }
        //Open URL
        driver.get(baseUrl);

        // implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));

        // Maximise the browser
        driver.manage().window().maximize();

        // Get the title of page
        System.out.println(driver.getTitle());

        // Get the current URL
        System.out.println("Current URL is: " + driver.getCurrentUrl());

        // Get the page source
        System.out.println("Page Source : " + driver.getPageSource());

        // Enter the email to email field
        WebElement emailField = driver.findElement(By.name("username"));
        emailField.sendKeys("Admin");

        // Enter the password to password field
        WebElement passField = driver.findElement(By.name("password"));
        passField.sendKeys("admin123");

        // Close the browser
        driver.close();
    }
}
