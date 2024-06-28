package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		WebElement button = driver.findElement(By.id("j_idt88:j_idt104"));
		button.click();
		Alert alert = driver.switchTo().alert();
		String text = "Test";
		alert.sendKeys(text);
		alert.accept();
		WebElement msg = driver.findElement(By.id("confirm_result"));
		System.out.println(msg.getText());
	}
	
	public int printRaveena(String text) {
		return 324;
	}

}
