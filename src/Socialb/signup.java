package Socialb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class signup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.socialbharat.org/");
		Thread.sleep(3000);
		
		//click on sign up
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul[1]/div/button[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("name")).sendKeys("Ravi Kumar");
		driver.findElement(By.id("mobile")).sendKeys("6378846434");
		driver.findElement(By.xpath("//*[@id=\"community_id\"]/div/div[1]/div[2]")).click();
//		Select.selectByIndex(0);

		
		
		
		
		
		
		Thread.sleep(20000);
		driver.quit();

}
}
