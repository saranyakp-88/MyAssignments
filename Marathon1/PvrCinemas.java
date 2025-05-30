package Marathon1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PvrCinemas {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.get("https://www.pvrcinemas.com/");
		driver.findElement(By.xpath("(//div[@class='cities-overlay cities-active'])[6]")).click();
		
		driver.findElement(By.xpath("//span[text()='Cinema']")).click();
		driver.findElement(By.xpath("(//span[@class='p-dropdown-label p-inputtext p-placeholder'])[2]")).click();
		driver.findElement(By.xpath("//span[text()='INOX National,Virugambakkam Chennai']")).click();
		Thread.sleep(4000);
	//	driver.findElement(By.xpath("//div[@id='date']")).click();
		driver.findElement(By.xpath("(//ul[@class='p-dropdown-items']/li)[2]")).click();
		//driver.findElement(By.xpath("//div[@id='movie']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[text()='KARATE KID LEGENDS'])[2]")).click();
		//driver.findElement(By.xpath("(//ul[@class='p-dropdown-items']/li)[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'09:30')]")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		driver.findElement(By.id("SL.SILVER|C:14")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		String text=driver.findElement(By.xpath("//div[@class='seat-info']")).getText();
		System.out.println(text);
		String text1=driver.findElement(By.xpath("//div[@class='grand-tota col-md-3']")).getText();
		System.out.println(text1);
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		driver.findElement(By.xpath("(//div[@class='cross-icon mx-2'])[2]")).click();
		
		Thread.sleep(3000);
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.quit();
		
		
		
		
	}

}
