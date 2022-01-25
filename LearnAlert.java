package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		//Click on AlertBox
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();

		//Click on Confirm Box
		//driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		

		//Click on Prompt Box
		//driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		
		//Click on Sweet Alert
		//driver.findElement(By.xpath("//button[text()='Sweet Alert']")).click();
		//driver.findElement(By.xpath("//button[text()='OK']")).click();
		
		
		
		Thread.sleep(3000);
		
		//Accept the Alert
		Alert alert = driver.switchTo().alert();
		
		//Get Text
		String text = alert.getText();
		System.out.println(text);
		
		//Enter text in Text field in Prompt box
		//alert.sendKeys("ABC");
		
		//To press cancel button
		//alert.dismiss();
		
		//Accept the alert
		alert.accept();
		
		
		
	}

	
}
