package Socialb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class addservice {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://uat.socialbharat.org/");
		Thread.sleep(3000);
		
		
		
	
	//click login button
				driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul[2]/li/div/button[1]")).click();
			
				
               Thread.sleep(3000);
						
				
				//enter mobile no.
				driver.findElement(By.id("mobile")).sendKeys("6378846434");
				//Thread.sleep(3000);
				//entering password
				driver.findElement(By.id("password")).sendKeys("Ravi@123");
				//Thread.sleep(3000);
				//see password
		    	driver.findElement(By.xpath("//*[@id=\"auth-wrapper\"]/div/div/div/div/div[2]/form/div[2]/span/span")).click();
				Thread.sleep(3000);
				//login button click
				driver.findElement(By.xpath("//*[@id=\"auth-wrapper\"]/div/div/div/div/div[2]/form/div[3]/button")).click();
				Thread.sleep(3000);
				
		// go to service section
				driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul[1]/li[4]")).click();
				Thread.sleep(3000);
		//select your service
				//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		       // WebElement service = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"react-select-9-placeholder\"]")));
		        //service.sendKeys("Room",Keys.ENTER);
				//driver.findElement(By.xpath("//*[@id=\"service-section\"]/div/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div/div[2]/div/svg")).click();				
				
				
				
				WebElement job = driver.findElement(By.xpath("//*[@id=\"service-section\"]/div/div/div[2]/div/div[2]/div/div[1]"));
				 String pagetext = job.getText();
				 String textToVerify1 = "ADD SERVICE";
				 
				 
				//System.out.println(textToVerify1);
				 if (pagetext.contains(textToVerify1)) {
			            System.out.println(" case 1 passed");
			        } else {
			            System.out.println("case 1 faild");
			        }
				
				
				
			//mob no
				driver.findElement(By.xpath("//*[@id=\"service-section\"]/div/div/div[2]/div/div[2]/div/div[2]/div[4]/input")).sendKeys("6894576518");
				
				
				
				Thread.sleep(5000);
				driver.quit();
				
	
	}

}
