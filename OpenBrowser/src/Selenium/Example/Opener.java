package Selenium.Example;

import Selenium.Example.By;
import Selenium.Example.WebDriver;
import Selenium.Example.WebElement;
import Selenium.Example.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class Opener {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "path of the exe file\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https:www.google.com");
        Thread.sleep(3000);

        //wait for 3 seconds
        driver.quit();

        //close Chrome

        }


    public static void main(String[] args) {

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // An implicit wait is to tell WebDriver to poll the DOM for a certain amount of time
        // when trying to find an element or elements if they are not immediately available.
        // The default setting is 0. Once set, the implicit wait is set for the life of the WebDriver object instance.

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Maximize the browser window to fit into screen
        driver.manage().window().maximize();

        // Visit Google
        driver.get("http://www.google.com");

        // Check the title of the page
        System.out.println("Page title is: " + driver.getTitle());

        // Find the text input element by its name
        WebElement element = driver.findElement(By.name("q"));

        // Enter something to search for
        element.sendKeys("Selenium!");

        // Now submit the form. WebDriver will find the form for us from the element
        element.submit();

        //Close the browser
        driver.quit();
    }

}
