import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/veenapatil/Desktop/selenium/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        driver.findElement(By.id("first-name")).sendKeys("veena");

        driver.findElement(By.id("last-name")).sendKeys("patil");

        driver.findElement(By.id("job-title")).sendKeys("QA Engineer");

        driver.findElement(By.id("radio-button-3")).click();

        driver.findElement(By.id("checkbox-2")).click();

        driver.findElement(By.cssSelector("option[value='3']"));

        driver.findElement(By.id("datepicker")).sendKeys("12/10/2021");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);

        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();



        driver.quit();
    }
}
