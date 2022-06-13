package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Waits;

public class InitialPage {
    private WebDriver driver;
    private Waits wait;

    public InitialPage(WebDriver driver) {
        wait = new Waits(driver);
        this.driver = driver;
    }

    public WebElement getButtonStartAutomation(){
        return wait.visibilityOfElement(By.xpath("//*[@id=\"index-banner\"]/div/div[3]/a"));
    }

    public WebElement getButtonAccesForm() {
        return wait.visibilityOfElement(By.xpath("/html/body/div[2]/div[1]/ul/li[1]/a"));
    }

    public WebElement getButtonAccessCreateUsers() {
        return wait.visibilityOfElement(By.xpath("/html/body/div[2]/div[1]/ul/li[1]/div/ul/li[1]/a"));
    }

    public WebElement getButtonAccessListUsers() {
        return wait.visibilityOfElement(By.xpath("/html/body/div[2]/div[1]/ul/li[1]/div/ul/li[2]/a"));
    }

}
