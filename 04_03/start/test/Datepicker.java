import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Datepicker {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/veenapatil/Desktop/selenium/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/datepicker");

        WebElement dateFeild = driver.findElement(By.id("datepicker"));
        dateFeild.sendKeys("12/9/20201");
        dateFeild.sendKeys(Keys.RETURN);

        driver.quit();
    }
}