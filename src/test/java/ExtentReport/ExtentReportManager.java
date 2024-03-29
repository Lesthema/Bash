package ExtentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.io.File;

public class ExtentReportManager{

    private static final String homeDir=System.getProperty("user.dir");


    public static ExtentReports extentSetup(){

        ExtentReports extentReports = new ExtentReports();
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(new File(homeDir + "/Reports/ExtentReport.html"));
        extentReports.attachReporter(sparkReporter);

        sparkReporter.config().setDocumentTitle("Extent Report");
        sparkReporter.config().setTheme(Theme.DARK);
        sparkReporter.config().setReportName("Bash Login Report");

        extentReports.setSystemInfo("NAME",("https://bash.com/"));
        extentReports.setSystemInfo("OS",System.getProperty("os.name"));
        extentReports.setSystemInfo("URL",("https://bash.com/"));
        extentReports.setSystemInfo("Execution Machine",System.getProperty("user.name"));

        return extentReports;

    }

}
