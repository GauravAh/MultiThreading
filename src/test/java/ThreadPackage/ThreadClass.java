package ThreadPackage;

import org.openqa.selenium.WebDriver;

import BasePackage.BaseClass;
import OrderPackage.MahForget;
import OrderPackage.OrderForm;

public class ThreadClass extends Thread {

	BaseClass of;

	ThreadClass(WebDriver driver, BaseClass of) {
		this.of = of;
		of = new OrderForm(driver);
	}

	@Override
	public void run() {
		of.setUp();
		try {
			if (of instanceof OrderForm) {
				((OrderForm) of).runTest1();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
