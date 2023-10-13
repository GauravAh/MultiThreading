package ThreadPackage;

import org.openqa.selenium.WebDriver;

import BasePackage.BaseClass;
import OrderPackage.MahForget;

public class ThreadClass1 extends Thread {

	BaseClass pt; 
	
	ThreadClass1(WebDriver driver, BaseClass pt) {
		this.pt=pt;
		pt = new MahForget(driver);

	}

	@Override
	public void run() {
		pt.setUp();
		try {
			if(pt instanceof MahForget) {
				((MahForget) pt).runTest2();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
