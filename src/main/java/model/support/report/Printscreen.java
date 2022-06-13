package model.support.report;

import com.assertthat.selenium_shutterbug.core.PageSnapshot;
import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.Status;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.ScreenshotException;

import javax.imageio.ImageIO;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

public class Printscreen {
    private static final String SCREEN_CATCH_PATH = ReportGenerator.REPORT_PATH + File.separator + "PrintScreen";

    public static MediaEntityModelProvider capture(WebDriver driver) {
        try {
            CreateFolder.createReportFolder(SCREEN_CATCH_PATH);
            File capture = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            String capturePath = SCREEN_CATCH_PATH +
                    File.separator +
                    "Image_ " +
                    DateTimeFormat.getDateInScreenshotFormat() +
                    ".png";
            FileUtils.copyFile(capture, new File(capturePath));
            return MediaEntityBuilder.createScreenCaptureFromPath(capturePath).build();
        } catch (IOException e) {
            String mensagem = "Ocorreu um erro na captura de tela!";
            Report.log(Status.WARNING, mensagem);
        }
        return null;
    }

    public static MediaEntityModelProvider fullPageBase64(WebDriver driver) {
        try {
            PageSnapshot capture = Shutterbug.shootPage(driver);
            ByteArrayOutputStream stream = new ByteArrayOutputStream();

            ImageIO.write(capture.getImage(), "png", stream);
            String base64imagem = Base64.encodeBase64String(stream.toByteArray());

            return MediaEntityBuilder.createScreenCaptureFromBase64String(base64imagem).build();
        } catch (ScreenshotException | IOException e) {
            String mesage = "Ocorreu um erro na captura de tela!";
            Report.log(Status.WARNING, mesage);
        }
        return null;
    }
}
