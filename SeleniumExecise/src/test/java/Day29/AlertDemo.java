package Day29;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	
		
//		normal alert with ok button
		
//		driver.findElement(By.xpath("//*[@onclick='jsAlert()']")).click();
//		Thread.sleep(5000);
//		Alert art = driver.switchTo().alert();
//		System.out.println(art.getText());
//		art.accept();
		
//		confirmation alert
//		driver.findElement(By.xpath("//*[@onclick='jsConfirm()']")).click();
//		Alert art = driver.switchTo().alert();
//		System.out.println(art.getText());
//		art.accept();
//		String act=	driver.findElement(By.xpath("//*[text()='You clicked: Ok']")).getText();
//		if (act.equalsIgnoreCase("You clicked: Ok")) {
//			System.out.println(act);
//		}
//		
//		driver.findElement(By.xpath("//*[@onclick='jsConfirm()']")).click();
//		Thread.sleep(5000);
//		Alert art1 = driver.switchTo().alert();
//		System.out.println(art1.getText());
//		art1.dismiss();
//		String cancel1 =	driver.findElement(By.xpath("//*[text()='You clicked: Cancel']")).getText();
//		if (cancel1.equalsIgnoreCase("You clicked: Cancel")) {
//			System.out.println(cancel1);
		
//		Prompt alert input box
		
		driver.findElement(By.xpath("//*[text()='Click for JS Prompt']")).click();
		Thread.sleep(5000);
		Alert art2 = driver.switchTo().alert();
		System.out.println(art2);
		art2.sendKeys("hello");
		art2.accept();
		String x=	driver.findElement(By.xpath("//*[text()='You entered: hello']")).getText();
		if (x.equalsIgnoreCase("You entered: hello")) {
			System.out.println(x);
		}
		
		
		
		
		
		
		}
		
		
		
		
	}

