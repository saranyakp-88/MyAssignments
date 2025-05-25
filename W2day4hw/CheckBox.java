package week2.day4hw;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Basic checkbox
		driver.findElement(By.xpath("//div[@id='j_idt87:j_idt89']/div[2]")).click();
				
		//NOtification and verification of message
		driver.findElement(By.xpath("//div[@id='j_idt87:j_idt91']/div[2]")).click();
			
		String text = driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
		if(text.contains("Checked")) {
			System.out.println("Check Message Displayed:"+text);
			}
		else { System.out.println("Check Message Displayed"); }
	
		//FAv Lang
		driver.findElement(By.xpath("//div[@class='ui-chkbox ui-widget']/div[2]")).click();
			
		//Tri State = Checking of State1
		Thread.sleep(8000);
		driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']/div[2]")).click();
		
		String stateText = driver.findElement(By.xpath("//div[@class='ui-growl-message']/p")).getText();
		//System.out.println(stateText);
		if(stateText.contains("State = 1")) {
			System.out.println("Message Displayed:"+stateText);
		}
		else { System.out.println("State change Message not Displayed"); }
	
		Thread.sleep(8000);
		driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']/div[2]")).click();
		
		String twoText = driver.findElement(By.xpath("//div[@class='ui-growl-message']/p")).getText();
		//System.out.println(twoText);
		if(twoText.contains("State = 2")) {
			System.out.println("Message Displayed:"+twoText);
		}
		else { System.out.println("State change Message not Displayed"); }
		
		Thread.sleep(8000);
		driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']/div[2]")).click();
		
		String threeText = driver.findElement(By.xpath("//div[@class='ui-growl-message']/p")).getText();
		//System.out.println(twoText);
		if(threeText.contains("State = 0")) {
			System.out.println("Message Displayed:"+threeText);
		}
		else { System.out.println("State change Message not Displayed"); }
		
		Thread.sleep(8000);
		//Toggle 
		driver.findElement(By.xpath("//div[@id='j_idt87:j_idt100']/div[2]")).click();
		String toggle = driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
		//System.out.println(twoText);
		if(toggle.contains("Checked")) {
			System.out.println("Message Displayed:"+toggle);
		}
		else { System.out.println("Message not Displayed"); }
		
		//Check disable button
		boolean disabled = driver.findElement(By.id("j_idt87:j_idt102_input")).isEnabled();
		System.out.println("check box is enabled?:"+disabled);
		
		//No Select Class in XML. Dropdown without select class
		driver.findElement(By.id("j_idt87:multiple")).click();
		driver.findElement(By.xpath("(//div[@class='ui-chkbox ui-widget']/div)[16]")).click();
		driver.findElement(By.xpath("(//div[@class='ui-chkbox ui-widget']/div)[18]")).click();
		driver.findElement(By.xpath("(//div[@class='ui-chkbox ui-widget']/div)[20]")).click();
		
		Thread.sleep(2000);
		driver.close();
	}
	

}
