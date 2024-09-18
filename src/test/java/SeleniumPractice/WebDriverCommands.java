package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.plaf.TableHeaderUI;

public class WebDriverCommands {
    public static void main(String[] args) throws InterruptedException {
        // declare the instance
        WebDriver driver=new ChromeDriver();
        // command to maximize the window - good practise
        driver.manage().window().maximize();
        //go to facebook.com
        driver.get("https://facebook.com"); // get command waits for the webpage to fully load before displaying all elements. Also doesn't save browsing history ( meaing click back or forward)
        //navigate to syntaxprojects website
        driver.navigate().to("https://syntaxprojects.com"); // navigate.to() loads the page instantly without waiting on all elements.Saves browsing history It allows back/forward botton to work.
        // Command to navigate one step back. This case back to fb
        driver.navigate().back();
        // Command to navigate one step Forward to Syntaxprojects.com website
        driver.navigate().forward();
        // Command to refresh in slow motion just for observation. Don't implement this in real testing case. Increases time of the test case
        Thread.sleep(2000); // slow down for 2000 miliseconds=2 sec. It refreshes the page after waiting for 2 seconds.

        // Command to refresh webpage. Use without the above command in production
        driver.navigate().refresh();
        //Command closing the browser. Will only close current working window in the browser. Quit closes the entire browser
        driver.close();







    }
}
