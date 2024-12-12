package task2;

import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
@Listeners(listenerdemo.ListenerClass.class)
public class CaseTest2 extends CommonDetails2 {
	ExtentTest test=null;
	static final Logger log=LogManager.getLogger(CaseTest2.class.getName());
    @Test
	public void testmethod1() throws IOException, InterruptedException {
		// TODO Auto-generated method stub
    	log.info("###########");
    	log.info("TEST Has Started");
    	test=report.startTest("Flipkart Page");
    	Logger logger=Logger.getLogger("CaseTest2");
		CommonDetails2 com=new CommonDetails2();
		com.driverInit();
		WebDriver driver=com.LaunchURL(objectprop.getProperty("flipkarturl"));
		logger.debug("Flipkart page launched Successfully");
		Pom2 pm=new Pom2(driver);
		try {
			Thread.sleep(4000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		if(driver.getTitle().equals("Flipkart")) {
			test.log(LogStatus.PASS, "Flipkartpage launched successfully");
		}
		else {
			test.log(LogStatus.FAIL, "Flipkartpage launched failed");
		}
		pm.Set1(objectprop.getProperty("firsttry"),objectprop.getProperty("data"));
		pm.Set2(objectprop.getProperty("thirdtry"));
		for(String CTab:driver.getWindowHandles()) {
			driver.switchTo().window(CTab);
		}
		pm.Set2(objectprop.getProperty("fourthtry"));

	}
    @AfterClass
    public void reportend() {
    	report.endTest(test);
    }
    @AfterSuite
    public void reportflush() {
    	report.flush();
    }
    

    
    

}
