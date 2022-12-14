package pl.coderslab.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DuckDuckGoMainPage {
    private WebDriver driver;

    public DuckDuckGoMainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterSearchPhrase(String phraseToSearch) {
        WebElement searchInputBox = this.driver.findElement(By.name("q"));
        searchInputBox.clear();
        searchInputBox.sendKeys(phraseToSearch);
    }

    public void clickSearchIcon() {
        WebElement submitButton = this.driver.findElement(
                By.cssSelector("form[data-testid=mainSearchBar] button[type=submit]")
        );
        submitButton.click();
    }
}
