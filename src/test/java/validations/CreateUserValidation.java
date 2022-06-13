package validations;

import org.openqa.selenium.WebDriver;
import pages.InitialPage;

public class CreateUserValidation {
    private static WebDriver driver;
    private static InitialPage initialPage;

    public CreateUserValidation(WebDriver driver) {
        this.driver = driver;
        initialPage = new InitialPage(this.driver);
    }
}


