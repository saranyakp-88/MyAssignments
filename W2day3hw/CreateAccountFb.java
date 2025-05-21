package week2.day3hw;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountFb {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("TEST");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("ACCONE");
		
		WebElement selDay = driver.findElement(By.id("day"));
		Select dd1 = new Select(selDay);
		dd1.selectByValue("22");
		
		WebElement selMonth = driver.findElement(By.id("month"));
		Select dd2 = new Select(selMonth);
		dd2.selectByIndex(11);
		
		WebElement selYear = driver.findElement(By.id("year"));
		Select dd3 = new Select(selYear);
		dd3.selectByValue("1988");
		
		driver.findElement(By.xpath("(//input[@id='sex'])[2]")).click();
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("789456135");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("ABCD123");
		
		
		
		
		
		
	}

}
