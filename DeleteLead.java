package week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver=new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");

		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Wipro");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Bhuvana");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Gokul");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneNumber']")).sendKeys("0987654321");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("0987654321");
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		//driver.getScreenshotAs(OutputType.FILE);
		//File dest=new File("snap1.png");
		//FileUtils.copyFile(source, source);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='14955']")).click();
		
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		
	}

}
