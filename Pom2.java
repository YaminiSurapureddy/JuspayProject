package task2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Pom2 {
	WebDriver driver=null;
	public Pom2(WebDriver driver) {
		this.driver=driver;
		
	}
	public void Set1(String webelement,String input){
		WebElement tw1=driver.findElement(By.xpath(webelement));
		tw1.sendKeys(input);
		tw1.submit();
	}
	public void Set2(String webelement1) {
		WebElement tw2=driver.findElement(By.xpath(webelement1));
		tw2.click();
		
	}
	public void Set3(String webelement2,String input2){
		WebElement tw4=driver.findElement(By.xpath(webelement2));
		tw4.sendKeys(input2);
	}
	
	

}
