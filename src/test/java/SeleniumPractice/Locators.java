package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) {
        //declare the instance
        WebDriver driver= new ChromeDriver();
        //maximize the creen
        driver.manage().window().maximize();
        //navigate to syntaxprojects
        driver.get("https://syntaxprojects.com/input-form-locator.php");
        //send the person name to the text box
        //findElement function returns the value for a Web Element. In this case by ID of the element. Returned Type will be WebElement
        WebElement firstName= driver.findElement(By.id("first_name")); // here it only finds the element
        //After Finding the element we will send values to that element for testing
        firstName.sendKeys("john"); // here it sends the value(text) "john" to that element.
        //Inspect the ID for last name box. Use attribute name in this case because it is the attribute for the "last_name"
       WebElement lastName=driver.findElement(By.name("last_name"));
       lastName.sendKeys("doe"); // It will send keys in this particular element
        // Using Attribute/Locator class send key to email box
        WebElement email=driver.findElement(By.className("form-control-01")); // in Selenium always use ClassName when looking for class
        email.sendKeys("john@does.com");
        // Finding Element by using TagName. This case button. If multiple Tags with the same name it will grab the first ome it identifies
        WebElement submitBtn=driver.findElement(By.tagName("button"));
        submitBtn.click(); //makes no sense to send text to a button, in this case better to click on it
        //click on first link
        WebElement link1=driver.findElement(By.linkText("Click Here.")); // Use linkText locator to  click on the element, this case a link
        link1.click();
        // Now Use partialLinkText Locator to click the element. In this case our test is"Link" but we are removing L to make it partial
        //click on the second link. Actually used when you have a long text and you wanna avoid typing too much
        WebElement link2=driver.findElement(By.partialLinkText("ink"));
        link2.click();













    }
}
