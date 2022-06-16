package validations;

import com.aventstack.extentreports.Status;
import model.support.report.Printscreen;
import model.support.report.Report;
import org.openqa.selenium.WebDriver;
import pages.InitialPage;
import pages.CreateUsersPage;

import static org.junit.jupiter.api.Assertions.*;

public class CreateUserValidation {
    private static WebDriver driver;
    private static InitialPage initialPage;
    private static CreateUsersPage createUsersPage;

    public CreateUserValidation(WebDriver driver) {
        this.driver = driver;
        initialPage = new InitialPage(this.driver);
        createUsersPage = new CreateUsersPage(this.driver);
    }
    public void ValidRegistrationSuccessfully(){
        try {
            assertAll("Validação de cadastro com sucesso do usuário",
                    ()->assertTrue(createUsersPage.getLabelSucess().isDisplayed()),
                    ()->assertEquals("Usuário Criado com sucesso", createUsersPage.getLabelSucess().getText())
            );
            Report.log(Status.PASS, "Cadastrou com sucesso", Printscreen.fullPageBase64(driver));
        } catch (Error | Exception e){
            Report.log(Status.FAIL, "Não cadastrou", Printscreen.fullPageBase64(driver));
        }
    }
}


