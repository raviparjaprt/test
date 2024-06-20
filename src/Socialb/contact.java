package Socialb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class contact {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://uat.socialbharat.org/");
		
		//click login button
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul[2]/li/div/button[1]")).click();
	
		
		//test case 1 check that it is login page or not
		 WebElement element = driver.findElement(By.xpath("//*[@id=\"auth-wrapper\"]/div/div/div/div/div[2]/div/h3"));
		 String pageText = element.getText();
		 //System.out.println(pageText);

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
		driver.findElement(By.id("password")).sendKeys("Ravi@123");
		//Thread.sleep(3000);
		//see password
    	driver.findElement(By.xpath("//*[@id=\"auth-wrapper\"]/div/div/div/div/div[2]/form/div[2]/span/span")).click();
		Thread.sleep(3000);
		//login button click
		driver.findElement(By.xpath("//*[@id=\"auth-wrapper\"]/div/div/div/div/div[2]/form/div[3]/button")).click();
		Thread.sleep(3000);
		
		
		//click on contact button
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul[1]/li[8]/a")).click();
		
		//enter name 
		
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div/div/form/div[2]/input")).sendKeys("Ravi");
		
		//enter email
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div/div/form/div[3]/input")).sendKeys("ravi12400@gmail.com");
		//enter mobile
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div/div/form/div[4]/input")).sendKeys("6378846548");
		//comment
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div/div/form/div[5]/textarea")).sendKeys("i want to get information about the organization");
		//click submit
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"user-auth-section\"]/div/div/div/div[2]/div/div/form/div[6]")).click();
//test case to check that request is submitted
		 WebElement request = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div/div/form/div[1]"));
		 String pageText1 = request.getText();
		//System.out.println(pageText1);
		 String textToVerify2 = "(All fields are required to fill.)";
		 
		 if (pageText1.contains(textToVerify2)) {
	            System.out.println("request sent");
	            System.out.println("case PASS");
	        } else {
	            System.out.println("request NOT sent");
	            System.out.println("case FAIL");
	        }
		 
		 Thread.sleep(3000);
		
		Thread.sleep(2000);
		driver.quit();

}
}
