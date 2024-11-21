package Day29;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert2Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	
//		handling alert with out of alert class
		driver.findElement(By.xpath("//*[@onclick='jsAlert()']")).click();
		Thread.sleep(5000);
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Alert myart=	mywait.until(ExpectedConditions.alertIsPresent());
		System.out.println(myart.getText());
		
	}

}
