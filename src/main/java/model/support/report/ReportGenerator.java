package model.support.report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class ReportGenerator {
    public static WebDriver driver;
    public static final String REPORT_PATH = System.getProperty("user.dir") + File.separator + "reports" + File.separator + "report " + DateTimeFormat.getDateInReportFormat();
    public static ExtentHtmlReporter htmlReporter;
    public static ExtentReports extentReports;

    public synchronized static ExtentReports getInstance() {
        if (extentReports == null) {
            configReportExtent();
        }
        return extentReports;
    }

    public static void configReportExtent() {
        CreateFolder.createReportFolder(REPORT_PATH);
        htmlReporter = new ExtentHtmlReporter(REPORT_PATH + File.separator + "Report_" + DateTimeFormat.getDateInReportFormat() + ".html");
        htmlReporter.config().setDocumentTitle("Automation Execution Report");
        htmlReporter.config().setReportName("Test Execution Report");
        htmlReporter.config().setTheme(Theme.DARK);
        htmlReporter.config().setEncoding("UTF-8");
        htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
        htmlReporter.config().setCSS(".nav-wrapper {​​ background-color: #1E317A !important; }​​ .brand-logo {​​ background-color: #1E317A !important; padding: 0 10px 0 0 !important; margin: 0 !important; position: absolute !important }​​ .report-name {​​ margin-left: 80px !important }​​ .blue.darken-3 {​​ background-color: #1E317A !important; color: #FFF !important;}​​");
        htmlReporter.config().setJS("$('.brand-logo').html('<img src=\"https://i.imgur.com/qDYwkD2.png\" class=\"db-logo\"/>');");

        extentReports = new ExtentReports();
        extentReports.attachReporter(htmlReporter);

    }
}
