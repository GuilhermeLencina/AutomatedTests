package model.support.report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.Status;

public class Report {
    private static final ExtentReports extent = ReportGenerator.getInstance();
    private static final ThreadLocal<ExtentTest> parentTest = new ThreadLocal<>();
    private static final ThreadLocal<ExtentTest> test = new ThreadLocal<>();

    public static void createTest(String testName, ReportType reportType) {
        if (reportType.equals(ReportType.SINGLE)) {
            ExtentTest extentTest = extent.createTest(testName);
            test.set(extentTest);
            return;
        }
        ExtentTest extentTest = extent.createTest(testName);
        parentTest.set(extentTest);
    }

    public static void createStep(String stepName) {
        try {
            ExtentTest child = parentTest.get().createNode(stepName);
            test.set(child);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    public static void log(Status status, String mesage) {
        if (existInstance()) {
            return;
        }
        test.get().log(status, mesage);
    }

    public static void log(Status status, String mesage, MediaEntityModelProvider capture) {
        if (existInstance()) {
            return;
        }
        test.get().log(status, mesage, capture);
    }

    public static boolean existInstance() {
        if (test.get() == null) {
            return true;
        }
        return false;
    }

    public static void quit() {
        if (existInstance()) {
            return;
        }
        extent.flush();
    }
}
