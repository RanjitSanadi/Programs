package Practice1.Practice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Programe1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		
		/*WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(
		    ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Login']")));
		*/
		WebElement element=driver.findElement(By.xpath("//span[text()='Login']"));
		
		Actions action=new Actions(driver);
		
		action.moveToElement(element).build().perform();
		
		WebElement element1=driver.findElement(By.xpath("//a[@title=\"Orders\"]/li/text()[normalize-space()]"));
		element1.click();
		System.out.print("Done");

	}

}
