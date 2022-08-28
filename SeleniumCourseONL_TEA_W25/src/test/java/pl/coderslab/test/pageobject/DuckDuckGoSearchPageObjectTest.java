package pl.coderslab.test;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuckDuckGoSearchPageObjectTest {
    private WebDriver driver;

    @BeforeEach
    public void beforeEach() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.get("https://duckduckgo.com/");
    }

    @Test
    public void duckDuckGoSearchTest() {
        DuckDuckGoMainPage duckDuckGoMainPage = new DuckDuckGoMainPage(this.driver);
        duckDuckGoMainPage.enterSearchPhrase("W pustyni i w puszczy");
        duckDuckGoMainPage.clickSearchIcon();
        // driver.quit();
    }
}
