import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Main {
    private static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kriss\\Desktop\\Projects HTML\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://translate.google.com");
//        driver.findElement(By.id("QFw9Te"));
//        driver.findElement(By.id("aria-autocomplete=\"list\""));
//        List<WebElement> elements = driver.findElements(By.className("er8xn"));
//        elements.get(0).sendKeys("ola");

        driver.findElement(By.className("gb_3"));




//        driver.findElement(By.className("er8xn")).click();
//        driver.findElement(By.className("er8xn")).sendKeys("Hello");



    }
}
