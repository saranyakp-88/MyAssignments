package Marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonBags {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for Boys");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(5000);
		String text = driver.findElement(By.xpath("//span[contains(text(),'1-48 of')]")).getText();
		////div[@class='sg-col-inner']//span try for this above
		System.out.println("Total count of search: "+text);
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();
		driver.findElement(By.xpath("//span[text()='Brands']/following::span[text()='Gear']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[@class='a-dropdown-label']")).click();
		driver.findElement(By.xpath("//a[@id='s-result-sort-select_4']")).click();
		
		String text2 = driver.findElement(By.xpath("//span[contains(text(),'Verge 37L')]")).getText();
		System.out.println("Product name: "+text2);
		
		String text3 = driver.findElement(By.xpath("//span[text()='1,199']")).getText();
		System.out.println("Product price: "+text3);
		
		String title = driver.getTitle();
		System.out.println("Title of the page is: "+title);
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
	}

}
