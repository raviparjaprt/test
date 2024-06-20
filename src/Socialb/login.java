package Socialb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://uat.socialbharat.org/");
		
		
	
	//click login button
				driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul[1]/div/button[1]")).click();
			
				
				//test case 1 check that it is login page or not
				 WebElement element = driver.findElement(By.xpath("//*[@id=\"auth-wrapper\"]/div/div/div/div/div[2]/div/h3"));
				 String pageText = element.getText();
				 String textToVerify = "Sign in";
				 
				 if (pageText.contains(textToVerify)) {
			            System.out.println("Text \"" + textToVerify + "\" is present on the page.\ntest case 1 passed");
			        } else {
			            System.out.println("Text \"" + textToVerify + "\" is NOT present on the page.\ntest case 1 faild");
			        }
				 
				 Thread.sleep(3000);
						
				
				//enter mobile no.
				driver.findElement(By.id("mobile")).sendKeys("6378846434");
				//Thread.sleep(3000);
				//entering password
				driver.findElement(By.id("password")).sendKeys("Ravi@12");
				//Thread.sleep(3000);
				//see password
		    	driver.findElement(By.xpath("//*[@id=\"auth-wrapper\"]/div/div/div/div/div[2]/form/div[2]/span/span")).click();
				Thread.sleep(3000);
				//login button click
				driver.findElement(By.xpath("//*[@id=\"auth-wrapper\"]/div/div/div/div/div[2]/form/div[3]/button")).click();
				Thread.sleep(3000);
				
		//case to varify wrong password
				WebElement pass = driver.findElement(By.xpath("//*[@id=\"auth-wrapper\"]/div/div/div/div/div[2]/form/div[1]"));
				 String invalidpass = pass.getText();
				 String textToVerify1 = "Invalid Password";
				 
				 if (invalidpass.contains(textToVerify1)) {
			            System.out.println("you enterd invalid password");
			        } else {
			            System.out.println("you are successfully loged in");
			        }
				
				
				
//				//another case to varify password
//				 WebElement element1 = driver.findElement(By.xpath("//*[@id=\"dropdown-basic\"]/span/span"));
//				 String pageText1 = element1.getText();
//				 String textToVerify1 = "Hi";
//				 
//				 if (pageText1.contains(textToVerify1)) {
//			            System.out.println("correct password you are loged in");
//			        } else {
//			            System.out.println("wrong / invalid password");
//			        }
//				 
//				 Thread.sleep(3000);
				
				 
				 Thread.sleep(3000);
				driver.quit();
				

}
}
