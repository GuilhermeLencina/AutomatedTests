package tests;

import com.aventstack.extentreports.Status;
import model.FakerGenerator;
import model.support.TestBase;
import model.support.report.Printscreen;
import model.support.report.Report;
import model.support.report.ReportType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import tasks.CreateUserTask;
import validations.CreateUserValidation;

import static model.support.report.Report.log;

public class CreateUserTest extends TestBase {
    private WebDriver driver = this.getDriver();
    FakerGenerator fakerGenerator = new FakerGenerator(driver);
    CreateUserTask createUserTask = new CreateUserTask(driver);
    CreateUserValidation createUserValidation = new CreateUserValidation(driver);

    @Test
    @DisplayName("O teste cria um usuario.")
    public void testCreateUsers() throws InterruptedException {
        String masculino = "Masculino";
        String feminino = "Feminino";

        try{
            Report.createTest("Valida cadastro de usuário." , ReportType.SINGLE);

            Report.log(Status.PASS,"Abre site e acessa o formulário de cadastro.");
            createUserTask.startAutomation();
            createUserTask.accessForm();
            createUserTask.accessCreateUsers();
            Report.log(Status.PASS,"Preenche campos para cadastro.");
            createUserTask.fillNameField(fakerGenerator.getName());
            createUserTask.fillLastNameField(fakerGenerator.getLastName());
            createUserTask.fillEmailField(fakerGenerator.getEmail());
            createUserTask.fillAddressField(fakerGenerator.getAddress());
            createUserTask.fillUniversityField(fakerGenerator.getUniversity());
            createUserTask.fillProfessionField(fakerGenerator.getProfession());
            createUserTask.fillGenderField(masculino);
            createUserTask.fillAgeField(fakerGenerator.getAge());
            Report.log(Status.PASS, "Cria e valida usuário cadastrado com sucesso.");
            createUserTask.createUser();
            createUserValidation.ValidRegistrationSuccessfully();
        }catch (Exception error){
            log(Status.ERROR, error.getMessage(), Printscreen.fullPageBase64(driver));
        }
    }
}
