package Practice1.Practice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxes {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		
		WebElement firstname=driver.findElement(By.xpath("//label[text()='First Name ']/following-sibling::input[1]"));
		WebElement lastname=driver.findElement(By.xpath("//label[text()='Last Name']/following-sibling::input[@maxlength='15']"));
		WebElement email=driver.findElement(By.xpath("//label[text()='Email']/following-sibling::input[1]"));
		WebElement check1=driver.findElement(By.xpath("//td[text()='Maria Anders']/preceding-sibling::td/input[@type='checkbox']")); // '//td[text()='Maria Anders']/preceding::input[@type='checkbox']'
		
		
		firstname.sendKeys("Ab");
		lastname.sendKeys("Cd");
		email.sendKeys("abcd@gmail.com");
		check1.click();
		
		WebElement click1=driver.findElement(By.xpath("//td[text()='Maria Anders']/following-sibling::td[3]"));

		
		System.out.print("Done");
		
		
		
		
		
		
		
		
		
		
		/*
		 
		 	//label[text()='Email']/following-sibling::input[1]
			//td[text()='Maria Anders']/preceding-sibling::td/child::input
			//label[text()='Email']/following-sibling::input[1]/parent::div
			//div[@class='container']/child::input[@type='text']
			//div[@class='container']/descendant::button
			//div[@class='buttons']/ancestor-or-self::div
			//label[text()='Password']/following::input[1]
		  
		 */
		
		
		
		
		
		
		
		
		
		
	}

}
