package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonMobilesInfo {

    public static void main(String[] args)

    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);
    }
}
