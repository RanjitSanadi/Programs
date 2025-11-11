package Practice1.Practice1;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenUrl {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> urls=driver.findElements(By.tagName("a"));
		
		System.out.println("size of urls" + urls.size());
		
		List<String> urlList=new ArrayList<String>();		
		for(WebElement link: urls)
		{
				String allUrls=link.getAttribute("href");
				urlList.add(allUrls);
				//checkbrokenLinks(allUrls);
		}
		
		
		long stTime=System.currentTimeMillis();
		urlList.parallelStream().forEach(e ->checkbrokenLinks(e) );
		long endTime=System.currentTimeMillis();
		
		System.out.println( "Timing is "+(endTime-stTime));
		driver.quit();
	}
	
	public static void checkbrokenLinks(String links)
	{
		try
		{
			int brk=0;
			URL url=new URL(links);
			HttpURLConnection httpurl=(HttpURLConnection) url.openConnection();
			httpurl.setConnectTimeout(5000);
			httpurl.connect();
			
			if(httpurl.getResponseCode()>=400)
			{
				brk++;
				System.out.println(links+ "--->"+ httpurl.getResponseMessage()+ " is broken link");
			}
			
			System.out.println( "broken linkks is "+(brk));
			
			
		}catch(Exception e)
		{
			
		}
		
	}
	
	
	

}
