package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 *  BaseURL: https://opensource-demo.orangehrmlive.com/
 * 1 .Setup chrome browser
 * 2. Open URL
 * 3. Print the title of the page
 * 4. Print the current url
 * 5. Print the page source
 * 6. Enter the email to email field
 * 7. Enter the password to password field
 * 8. Close the browser
 */
public class ChromeBrowserTest {
    public static void main(String[] args) {
       String baseUrl= "https://opensource-demo.orangehrmlive.com/";
      // launch the chrome browser
        WebDriver drive= new ChromeDriver();
        // Open URL into the browser
        drive.get(baseUrl);
        // get the title of the page
        String title =drive.getTitle();
        System.out.println(title);

        drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));
        // get the current Url

        drive.getCurrentUrl();
        //Print the current url
        System.out.println("Current Url :" + drive.getCurrentUrl());

        // Print the page source
        System.out.println("Page source :"+ drive.getPageSource());

        // Enter the email to email field
         WebElement usernameField = drive.findElement(By.name("username"));
         usernameField.sendKeys("Admin");


        WebElement passwordField = drive.findElement(By.name("password"));
        passwordField.sendKeys("admin123");
         drive.close();




    }
}
