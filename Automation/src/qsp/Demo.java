package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/ChromeDriver");
	}
	
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://facebok.com/");
		String title = driver.getTitle();
		System.out.println(title);
	}

}
