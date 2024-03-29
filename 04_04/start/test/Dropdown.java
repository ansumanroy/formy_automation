import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Dropdown {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/veenapatil/Desktop/selenium/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropDownMenuButton = driver.findElement(By.id("dropdownMenuButton"));
        dropDownMenuButton.click();

       // WebElement autoComplete = driver.findElement(By.id("autocomplete"));
               // autoComplete.click();

        WebElement datePicker = driver.findElement(By.linkText("Datepicker"));
        datePicker.click();

        // driver.quit();
    }
}
