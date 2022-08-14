package locators;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class FindElementTest {

    @Test
    public void elementSearch() {

        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://lms.coderslab.pl/login");
        WebElement emailInput = driver.findElement(By.id("username"));
        System.out.println(emailInput);
        WebElement passwordInput = driver.findElement(By.name("_password"));
        System.out.println(passwordInput);
    }

}
