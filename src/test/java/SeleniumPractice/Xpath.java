package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class Xpath {
    public static void main(String[] args) {
        // declare the instance
        WebDriver driver=new ChromeDriver();
        // command to maximize the window - good practise
        driver.manage().window().maximize();
        //go to facebook.com
        driver.get("http://syntaxprojects.com/Xpath.php");
        // find the username and send text to it
        WebElement username =driver.findElement(By.xpath("//input[@id='title']"));
        username.sendKeys("moazzam");
        //find the button and click on it
        WebElement button=driver.findElement(By.xpath("//button[text()='Click Here']")); // syntax to find element by text
        button.click();
        // find the Security text box
        WebElement securityQuestion=driver.findElement(By.xpath("//input[contains(@name,'securityPartial')]"));
        securityQuestion.sendKeys("What is your school name?");
        // find the text element using partial value ( any piece of that text)
        WebElement text=driver.findElement(By.xpath("//label[contains(text(),'amet consectetur adipisicing elit')]")); // this web element is neither a text type or Clickable type
        //In this case we use function getText()
        String textofString=text.getText(); // this will return us the whole text in this particular Web element of String Type
        System.out.println(textofString); // it will print the selected text in the Console here
        // find Web element using starts-with - that particular value or attribute has to start with ( Character ir some texts)
        //Always skip or never pick numbers from the value, because they are dynamic(changeble)
        // enter api settings
        WebElement settings=driver.findElement(By.xpath("//input[starts-with(@id,'apiSettings')]")); // you can sent something to the text box on webpage
        settings.sendKeys("helloee");
        // Find web Element using Operator - meaning for ex.get me the input tag which has 2 attributes data-detail and name. This combination of 2 attributes make it unique enough
        WebElement field1=driver.findElement(By.xpath("//input[@data-detail='one' and @name='customField']"));
        field1.sendKeys("hello I'm field1");
        //email2 - find element using indexing of the xpath. Indexing refers to mirrored element options the search box found in inspect code
        WebElement email2=driver.findElement(By.xpath("(//input[@class='form-control backup'])[2]"));
        email2.sendKeys("arthys@gmail.com");















    }
}
