package MahLoginPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import BasePackage.BaseClass;

public class Pract extends BaseClass {
	
	public Pract(WebDriver driver){
		super(driver);
	}
	
	 public void MahLogin() throws Exception {
		
		System.out.println("Thread Id is.." + Thread.currentThread().getId());
		driver.manage().window().maximize();
		driver.get("https://myassignmenthelp.com/Home/login.php");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[id$='txtEmail']")).sendKeys("abc@gmail.com");
		driver.findElement(By.cssSelector("input[id$='password']")).sendKeys("123456");
		Thread.sleep(3000);
		
	}

}
