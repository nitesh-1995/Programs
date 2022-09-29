package Locator_WebDriver_WebElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Switching {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://web.whatsapp.com");
		
		Thread.sleep(5000);
		driver.switchTo().newWindow(WindowType.TAB);
		
		Thread.sleep(5000);
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(5000);
		driver.switchTo().newWindow(WindowType.TAB);

		Thread.sleep(5000);
		driver.get("https://www.flipkart.com/");

	}

}
