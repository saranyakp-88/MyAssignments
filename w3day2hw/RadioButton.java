package week2.day4hw;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//fav browser
		driver.findElement(By.xpath("//label[text()='Chrome']")).click();
		
		
		//deselection - doubt
		WebElement city = driver.findElement(By.xpath("//div[@id='j_idt87:city2']/descendant::input"));
		boolean beforeClick = city.isSelected();
		System.out.println("city selected: "+beforeClick);
		driver.findElement(By.xpath("//label[text()='Chennai']")).click();
		boolean afterClick = city.isSelected();
		System.out.println("city selected first click: "+afterClick);
		driver.findElement(By.xpath("//label[text()='Chennai']")).click();
		boolean after2Click = city.isSelected();
		System.out.println("city selected second click: "+after2Click);
		
		//default radio button selected
		Thread.sleep(4000);
		WebElement browserName = driver.findElement(By.xpath("//table[@id='j_idt87:console2']/descendant::input[@checked]"));
		boolean	selected = browserName.isSelected();
		System.out.println("browesr Radio button selected by default: "+selected);
		
		//default age radio button selected
		Thread.sleep(4000);
		WebElement age = driver.findElement(By.xpath("//div[@id='j_idt87:age']/descendant::input[@checked]"));
		boolean ageSelect=age.isSelected();
		System.out.println("Age radio selected by default: "+ageSelect);
		driver.findElement(By.xpath("//label[text()='41-60 Years']")).click();
		WebElement age2 = driver.findElement(By.xpath("(//div[@id='j_idt87:age']/descendant::input)[3]"));
		boolean age2Select=age2.isSelected();
		System.out.println("Age radio selected by input: "+age2Select);
}
}