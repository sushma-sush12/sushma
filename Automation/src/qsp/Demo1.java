package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/ChromeDriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver c=new ChromeDriver();
		c.get("facebook.com");
		Thread.sleep(4000);
		
		
	}

}
