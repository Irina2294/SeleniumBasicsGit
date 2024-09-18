package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedXpath {
    public static void main(String[] args) {
        // declare the instance
        WebDriver driver=new ChromeDriver();
        // command to maximize the window - good practise
        driver.manage().window().maximize();
        //go to facebook.com
        driver.get("https://syntaxprojects.com/advanceXpath.php");
        //find input2
        WebElement input2=driver.findElement(By.xpath("//input[@id='favourite-book']/following-sibling::input[1]"));
        input2.sendKeys("harrypotter");
        // find the input textbox using preceding sibling
        WebElement textbox2=driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[2]"));
        textbox2.sendKeys("lordofrings");
        // Find textbox 3 using child option
        WebElement textbox3=driver.findElement(By.xpath("//div[@id='familyTree']/child::input[3]"));
        textbox3.sendKeys("abcdef");


    }
}
