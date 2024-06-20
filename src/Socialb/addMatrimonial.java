package Socialb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class addMatrimonial {
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
				
				
				// go to matrimonial section
				driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul[1]/li[5]")).click();
				Thread.sleep(3000);
				//add matrimonial button click
				driver.findElement(By.xpath("//*[@id=\"searchPeoples-section\"]/div/div/div[2]/div[1]/div[1]/div[3]/div[2]/a")).click();
				Thread.sleep(3000);
				
				
		// form filling to add matrimonial
				//for whome (son)
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		        WebElement whom = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("react-select-5-input")));
		        whom.sendKeys("Son",Keys.ENTER);
		        Thread.sleep(1000);
		        //name of son
		        driver.findElement(By.xpath("//*[@id=\"fatherName\"]")).sendKeys("jack");
		        Thread.sleep(1000);
		        //fathers name 
		        driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div/div/div/div/form/fieldset/div[1]/div[3]/div[1]/input")).sendKeys("jeson");
		        Thread.sleep(1000);
		        //mothers name
		        driver.findElement(By.id("motherName")).sendKeys("lena");
		        Thread.sleep(1000);
		        //gender
		        driver.findElement(By.xpath("//*[@id=\"auth-wrapper\"]/div/div/div/div/div/form/fieldset/div[1]/div[4]/div[1]/select")).click();
				driver.findElement(By.xpath("//*[@id=\"auth-wrapper\"]/div/div/div/div/div/form/fieldset/div[1]/div[4]/div[1]/select")).sendKeys("m",Keys.ENTER);
				Thread.sleep(1000);
				//dob
				WebElement Dob = driver.findElement(By.id("jobStartDate"));
				Dob.clear();
				Dob.sendKeys("20/06/2003");
				Thread.sleep(1000);
				//state
				 WebElement state = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("react-select-6-input")));
				 state.sendKeys("Rajasthan",Keys.ENTER);
			        Thread.sleep(1000);
			    //city
			        WebElement city = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("react-select-7-input")));
			        city.sendKeys("Ajm",Keys.ENTER);
				        Thread.sleep(1000);
				        
				 //subcast
				        WebElement subcast = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("react-select-8-input")));
				        subcast.sendKeys("Nagars",Keys.ENTER);
					        Thread.sleep(1000);
				//paternal gotra
					        driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div/div/div/div/form/fieldset/div[1]/div[6]/div[2]/input")).sendKeys("xyz");
					        
			    //maternal gotra
					   driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div/div/div/div/form/fieldset/div[1]/div[7]/div[1]/input")).sendKeys("abc");
					   Thread.sleep(1000);
			
				//manglik
					 WebElement manglik = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"auth-wrapper\"]/div/div/div/div/div/form/fieldset/div[1]/div[7]/div[2]/select")));
					 manglik.sendKeys("N",Keys.ENTER);
			        Thread.sleep(1000);
			        
			    //education
			        WebElement education = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"auth-wrapper\"]/div/div/div/div/div/form/fieldset/div[1]/div[8]/div[1]/select")));
			        education.sendKeys("12",Keys.ENTER);
			        Thread.sleep(1000);
			        
			     //jobprofile
			        WebElement jobprofile = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"jobProfile\"]")));
			        jobprofile.sendKeys("Gov",Keys.ENTER);
			        Thread.sleep(1000);
			        
			     //job discription
			        driver.findElement(By.xpath("//*[@id=\"auth-wrapper\"]/div/div/div/div/div/form/fieldset/div[1]/div[8]/div[3]/div[1]/textarea")).sendKeys("management");
				        
				//edu details 
			        driver.findElement(By.xpath("//*[@id=\"auth-wrapper\"]/div/div/div/div/div/form/fieldset/div[1]/div[8]/div[3]/div[2]/textarea")).sendKeys("12th");
			        Thread.sleep(1000);
			        
			      //contact detail
			        driver.findElement(By.xpath("//*[@id=\"auth-wrapper\"]/div/div/div/div/div/form/fieldset/div[1]/div[8]/div[4]/div[2]/input")).sendKeys("6845374985");
			        Thread.sleep(1000);
			        
			       // no. of brothers
			       // driver.findElement(By.xpath("//*[@id=\"numberDropdown\"]")).click();
					driver.findElement(By.xpath("//*[@id=\"numberDropdown\"]")).sendKeys("1",Keys.ENTER);
					
				//no. of sisters
					driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div/div/div/div/form/fieldset/div[1]/div[9]/div[2]/select")).sendKeys("2",Keys.ENTER);

				//package
					driver.findElement(By.xpath("//*[@id=\"auth-wrapper\"]/div/div/div/div/div/form/fieldset/div[1]/div[11]/div[1]/input")).sendKeys("860000");
					 Thread.sleep(3000);
		        
					
			//submit
					driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div/div/div/div/form/fieldset/div[2]/div/button[1]")).click();
		        
		        
		        Thread.sleep(5000);
		        driver.quit();
	}
	

}
