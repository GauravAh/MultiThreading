package OrderPackage;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import BasePackage.BaseClass;

public class OrderForm extends BaseClass {
	
	String[] stringArray;
	String stringLinks;
	
	public OrderForm(WebDriver driver){
		super(driver);
	}
	
	 public void runTest1() throws Exception {
		
		System.out.println("Thread Id is.." + Thread.currentThread().getId());
		driver.get("https://myassignmenthelp.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000);");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		Thread.sleep(5000);
		js.executeScript("window.scrollTo(0,0);");
		Thread.sleep(5000);
		
		List<WebElement> menuLinks = driver.findElements(By.xpath("//*[@class='container mah-container']/div/div/ul/li/a[contains(@href,'')]"));
		int menuSize = menuLinks.size();
		
		stringArray = new String[menuSize];
		
		for(int i=0;i<menuSize;i++) {
			stringLinks = menuLinks.get(i).getAttribute("href");
			stringArray[i] = stringLinks;
		}
		
		for(String we : stringArray) {
			System.out.println(we);
		}
		
		Thread.sleep(2000);
		
		driver.quit();
	}
	

}
