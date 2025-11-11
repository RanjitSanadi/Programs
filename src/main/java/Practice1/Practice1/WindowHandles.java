package Practice1.Practice1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		
		String mainWindow=driver.getWindowHandle();
		
		System.out.println(mainWindow);
		
		driver.findElement(By.linkText("Open a popup window")).click();
		
		Set<String> windohandles=driver.getWindowHandles();
		
		for(String windows:windohandles)
		{
			driver.switchTo().window(windows);
			
			if(driver.getCurrentUrl().equals("https://the-internet.herokuapp.com/windows/new"))
			{
				String str=driver.findElement(By.xpath("//div[@class='example']/h3")).getText();
				
				System.out.print("-->"+str);
				System.out.print(windows);
				
				driver.close();
				break;
			}
			
			
		}
		
		driver.switchTo().window(mainWindow);
		
		driver.findElement(By.id("ta1")).sendKeys("hi");
		
		
		//driver.close();
	}

}
