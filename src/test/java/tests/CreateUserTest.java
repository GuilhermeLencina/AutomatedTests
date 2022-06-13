package tests;

import model.support.TestBase;
import model.support.report.Report;
import model.support.report.ReportType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import tasks.FormTask;
import validations.CreateUserValidation;

public class CreateUserTest extends TestBase {
    private WebDriver driver = this.getDriver();
    FormTask formTask = new FormTask(driver);
    CreateUserValidation createUserValidation = new CreateUserValidation(driver);

    @Test
    @DisplayName("O teste cria um usuario.")
    public void testCreateUsers() throws InterruptedException {
        Report.createTest("Valida cadastro de usuário." , ReportType.SINGLE);
        formTask.startAutomation();
        formTask.accessForm();

    }
}
