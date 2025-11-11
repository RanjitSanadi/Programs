package Practice1.Practice1;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenUrl2 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.youtube.com/");
		
		List<WebElement> urls=driver.findElements(By.tagName("a"));
		System.out.println(urls.size());
		
		
		for(WebElement link: urls)
		{
			String url=link.getAttribute("href");
			geturls(url);
			
		}
		
		driver.close();
		
		
		
	}
	
	public static void geturls(String links)
	{
		try {
			
			URL url=new URL(links);
			HttpURLConnection httpurl=(HttpURLConnection) url.openConnection();
			httpurl.setConnectTimeout(5000);
			httpurl.connect();
			
			if(httpurl.getResponseCode()>=400)
			{
				System.out.print(links+"---->" + httpurl.getResponseMessage()+"is broken link");
			}
			else
			{
				System.out.println("no broken link");
			}
			
		}catch(Exception e)
		{
			
		}
	}
		
	}
