package tasks;

import org.openqa.selenium.WebDriver;
import pages.InitialPage;
import pages.CreateUsersPage;
import utilities.Waits;

public class CreateUserTask {
    private static WebDriver driver;
    private static Waits waits;
    private static InitialPage initialPage;
    private static CreateUsersPage createUsersPage;

    public CreateUserTask(WebDriver driver) {
        this.driver = driver;
        waits = new Waits(this.driver);
        initialPage = new InitialPage(this.driver);
        createUsersPage = new CreateUsersPage(this.driver);
    }

    //TODO: acessa a aplicação.
    public void startAutomation() throws InterruptedException {
        initialPage.getButtonStartAutomation().click();
        waits.waitInSecondsSleeper(100);
    }
    public void accessForm() throws InterruptedException {
        initialPage.getButtonAccesForm().click();
    }

    //TODO: métodos para criar um usuário.
    public void accessCreateUsers() throws InterruptedException {
        initialPage.getButtonAccessCreateUsers().click();
    }

    public void fillNameField(String name){
        createUsersPage.getNameField().sendKeys(name);
    }

    public void fillLastNameField(String lastName){
        createUsersPage.getLastNameField().sendKeys(lastName);
    }

    public void fillEmailField(String email){
        createUsersPage.getEmailField().sendKeys(email);
    }

    public void fillAddressField(String address){
        createUsersPage.getAddressField().sendKeys(address);
    }

    public void fillUniversityField(String university){
        createUsersPage.getUniversityField().sendKeys(university);
    }

    public void fillProfessionField(String profession){
        createUsersPage.getProfessionField().sendKeys(profession);
    }

    public void fillGenderField(String gender){
        createUsersPage.getGenderField().sendKeys(gender);
    }

    public void fillAgeField(String age){
        createUsersPage.getAgeField().sendKeys(age);
    }
    public void createUser() throws InterruptedException {
        createUsersPage.getButtonCreate().click();
    }
}
