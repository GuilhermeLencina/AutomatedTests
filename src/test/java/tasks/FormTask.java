package tasks;

import org.openqa.selenium.WebDriver;
import pages.InitialPage;

public class FormTask {
    private static WebDriver driver;
    private static InitialPage initialPage;

    public FormTask(WebDriver driver) {
        this.driver = driver;
        initialPage = new InitialPage(this.driver);
    }

    //TODO: acessa a aplicação.
    public void startAutomation() throws InterruptedException {
        initialPage.getButtonStartAutomation().click();
        Thread.sleep(3000);
    }
    public void accessForm() throws InterruptedException {
        initialPage.getButtonAccesForm().click();
        Thread.sleep(3000);
    }
}
