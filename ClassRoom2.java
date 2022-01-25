package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassRoom2 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		
		
		Thread.sleep(10000);
	//	ChromeOptions options=new ChromeOptions();
		//options.addArguments("--start-maximized");
		//options.addArguments("--disable-notifications");
		//options.addArguments("--disable-extenstions");
				//click ok sweet-alert
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		//Click on Flights Tab
		driver.findElement(By.linkText("FLIGHTS")).click();
		//driver.findElement(By.xpath("//li[@class='menu-list header-icon-menu']/a[text()=' FLIGHTS ']")).click();
		//Get windowHandles
		Set<String> windowHandles = driver.getWindowHandles();
		//Conver to List
		List<String>windows=new ArrayList<String>(windowHandles);
		//switch to window
		driver.switchTo().window(windows.get(1));
		//get title of child window
		System.out.println(driver.getTitle());
		//get back to parent window
		driver.switchTo().window(windows.get(0));
		//close the parent window
		driver.close();
		
		
	}

}
