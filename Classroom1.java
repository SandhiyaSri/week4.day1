package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Classroom1 {
public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
	driver.manage().window().maximize();
	
	//Go to Frame
    driver.switchTo().frame("iframeResult");
    //Go to Try it button
    driver.findElement(By.xpath("//button[text()='Try it']")).click();
    
	Alert alert = driver.switchTo().alert();
	
	
	
	alert.sendKeys("Sandhiya");
	alert.accept();
	String text = driver.findElement(By.id("demo")).getText();
	if(text.contains("Sandhiya"))
	{
		System.out.println("Success");
	}
	else
	{
		System.out.println("Failure");	
	}
	
	driver.switchTo().defaultContent();
	
}
}
