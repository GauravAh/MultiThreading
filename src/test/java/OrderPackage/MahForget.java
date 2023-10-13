package OrderPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import BasePackage.BaseClass;

public class MahForget extends BaseClass {

	public MahForget(WebDriver driver) {
		super(driver);
	}
	
	 public void runTest2() throws Exception {
			
			System.out.println("Thread Id is.." + Thread.currentThread().getId());
			driver.get("https://myassignmenthelp.com/Home/forgot.php");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector(".p-relative>input[id='txtEmail']")).sendKeys("AAAAAAA");
			
		}

}
