package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Waits;

public class CreateUsersPage {
    private WebDriver driver;
    private Waits wait;

    public CreateUsersPage(WebDriver driver) {
        wait = new Waits(driver);
        this.driver = driver;
    }

    public WebElement getNameField(){
        return wait.visibilityOfElement(By.cssSelector("#user_name"));
    }

    public WebElement getLastNameField(){
        return wait.visibilityOfElement(By.cssSelector("#user_lastname"));
    }

    public WebElement getEmailField(){
        return wait.visibilityOfElement(By.cssSelector("#user_email"));
    }

    public WebElement getAddressField(){
        return wait.visibilityOfElement(By.cssSelector("#user_address"));
    }

    public WebElement getUniversityField(){
        return wait.visibilityOfElement(By.cssSelector("#user_university"));
    }

    public WebElement getProfessionField(){
        return wait.visibilityOfElement(By.cssSelector("#user_profile"));
    }

    public WebElement getGenderField(){
        return wait.visibilityOfElement(By.cssSelector("#user_gender"));
    }

    public WebElement getAgeField(){
        return wait.visibilityOfElement(By.cssSelector("#user_age"));
    }

    public WebElement getButtonCreate(){
        return wait.visibilityOfElement(By.cssSelector(".actions.btn.green"));
    }

    public WebElement getLabelSucess(){
        return wait.visibilityOfElement(By.cssSelector("#notice"));
    }

}
