package week2.day4hw;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LeafButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt90']/span")).click();
		String title = driver.getTitle();
		if(title.contains("Dashboard")) 
		{
			System.out.println("Title of the page is:"+title);
		} 
		else 
		{ 
			System.out.println("title not displayed");
		
		}
		driver.navigate().back();
		boolean disabled = driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only ui-state-disabled']")).isEnabled();
		System.out.println("Confirm if the button is enabled?"+disabled);
		
		Point location = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt94']/span[2]")).getLocation();
		System.out.println("Position of submit button"+location);
		
		String colour = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt96']/span[2]")).getCssValue("background-color");
		System.out.println("Colour of the save button is"+colour);
		
		Dimension size = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt98']//span[2]")).getSize();
		System.out.println("Position of submit button"+size);
		
		driver.close();
	}
}