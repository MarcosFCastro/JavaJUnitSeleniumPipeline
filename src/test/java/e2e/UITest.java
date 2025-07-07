package e2e;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UITest {

    @Test
    public void testGoogleHomepage() {
        WebDriver driver = new ChromeDriver(); // ChromeDriver deve estar no PATH
        driver.get("https://www.google.com");
        assert driver.getTitle().contains("Google");
        driver.quit();
    }
}