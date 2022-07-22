package week2.Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Download and set the path 
		WebDriverManager.chromedriver().setup();
		//Launch the chromebrowser
		ChromeDriver driver=new ChromeDriver();
		
		//Load the URL
		driver.get("https://en-gb.facebook.com/");
		//Maximise the window
		driver.manage().window().maximize();
		//Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Click on Create New Account button
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		//Enter the first name
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Bhuvi");
		//Enter the last name
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Gokul");
		//Enter the mobile number
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("1234567890");
		
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Bg1627@");
		
		driver.findElement(By.xpath("//select[@name='birthday_day']")).click();
		
		driver.findElement(By.xpath("//option[@value='16']")).click();
		
		driver.findElement(By.xpath("//select[@name='birthday_month']")).click();
		
		driver.findElement(By.xpath("//option[contains(text(),'Apr')]")).click();
		
		driver.findElement(By.xpath("//select[@name='birthday_year']")).click();
		
		driver.findElement(By.xpath("//option[contains(text(),'1993')]")).click();
				
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		
		
	}

}
