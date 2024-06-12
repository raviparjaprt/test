package Socialb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class register {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		try {
			driver.manage().window().maximize();
			Thread.sleep(5000);
			driver.get("https://uat.socialbharat.org/");		
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul[1]/div/button[2]")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("name")).sendKeys("Ravi");
			
			driver.findElement(By.id("mobile")).sendKeys("6378846444");
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			System.out.println("1");
	        WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("react-select-2-input")));

	        
	        dropdown.sendKeys("Rajput",Keys.ENTER);
	        Thread.sleep(5000);
	        driver.findElement(By.xpath("//*[@id=\"auth-wrapper\"]/div/div/div/div/div[2]/form/div[4]/button")).click();

//			Hello
		}catch(Exception error) {
			System.out.println(error);
		}finally {
//			driver.quit();
		}
	}

}
