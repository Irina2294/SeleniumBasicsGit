package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS {
    public static void main(String[] args) {
        // declare the instance
        WebDriver driver=new ChromeDriver();
        // command to maximize the window - good practise
        driver.manage().window().maximize();
        //go to facebook.com
        driver.get("https://syntaxprojects.com/cssSelector.php");
        // find the Profile id
        //example with whole syntax
        WebElement profileId=driver.findElement(By.cssSelector("input[id='profileID']"));
        profileId.sendKeys("moazzam");
        //Example Css with shortcuts
        //find the profile
        WebElement profile=driver.findElement(By.cssSelector("input#profileBox"));
        profile.sendKeys("amazon");
        // use shortcut for classname to find element. If the Text inside Value has spaces -> eliminate them with . sign and delete space
        // find the feedback from jenny
         WebElement feedbackByJenny=driver.findElement(By.cssSelector("input.form-control.feedbackBox1"));
         feedbackByJenny.sendKeys("the website is really cool!!!");
         // find the element by using * shortcut
        //course topic
       WebElement courseTopic= driver.findElement(By.cssSelector("input[name*='contentInput']"));
       courseTopic.sendKeys("selenium");
       // find web element using starts-with ^ shortcut
        WebElement advanceCss=driver.findElement(By.cssSelector("input[name^='IntroInput']"));
        advanceCss.sendKeys("shortcuts");
        // find element using ends-with $ shortcut
      WebElement cssModule= driver.findElement(By.cssSelector("input[name$='Input']"));
      cssModule.sendKeys("css");






    }
}
