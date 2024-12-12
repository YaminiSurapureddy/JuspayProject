package task2;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.relevantcodes.extentreports.ExtentReports;

public class CommonDetails2 {
	WebDriver driver=null;
	protected static ExtentReports report=new ExtentReports("src/ExtentReports.html");
	public static Properties objectprop=null;
	FileReader fr=null;
	public void driverInit() throws IOException {
	    objectprop=new Properties();
		FileReader fr=new FileReader("C:\\Users\\yamin\\eclipse-workspace\\Project2\\Input1.properties");
		objectprop.load(fr);
		System.setProperty("webdriver.edge.driver",objectprop.getProperty("edgepath5"));
		driver=new EdgeDriver();
		
	}
	public WebDriver LaunchURL(String URL) {
		driver.get(URL);
		driver.manage().window().maximize();
		return driver;
		
	}

}