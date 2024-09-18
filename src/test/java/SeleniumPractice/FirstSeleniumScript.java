package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class FirstSeleniumScript {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        //navigating the browser to syntax project website
        driver.get("https://syntaxprojects.com/");
        //get the current url and print it on the console
        String url=driver.getCurrentUrl(); // Saving the returned value into a variable of type string called -url
        System.out.println("the current url is: "+url);

        // close the browser
        driver.quit();
    }
;}
