package ThreadPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import OrderPackage.MahForget;
import OrderPackage.OrderForm;

public class CallingThreadClass {
	
	public static void main(String[] args) {
		
		WebDriver driver1 = new ChromeDriver();
	    WebDriver driver2 = new ChromeDriver();
		OrderForm orderForm = new OrderForm(driver1);
		MahForget or = new MahForget(driver2);
		ThreadClass class1 = new ThreadClass(driver1,orderForm);
		ThreadClass1 class2 = new ThreadClass1(driver2,or);
		
		class1.start();
		class2.start();
	}

}
