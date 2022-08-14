package seleniumFunctions;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.*;

public class IsEnabledTest {

    @Test

    public void IsEnabled() {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        boolean isSignInEnabled = driver.findElement(By.cssSelector("a.user_login.navigation-link")).isEnabled();
        assertTrue(isSignInEnabled);
    }
}
