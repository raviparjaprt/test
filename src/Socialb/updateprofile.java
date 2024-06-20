package Socialb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class updateprofile {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://uat.socialbharat.org/");
		Thread.sleep(3000);
		
		
		
	
	//click login button
				driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul[2]/li/div/button[1]")).click();
			
				
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
				driver.findElement(By.id("password")).sendKeys("Ravi@123");
				//Thread.sleep(3000);
				//see password
		    	driver.findElement(By.xpath("//*[@id=\"auth-wrapper\"]/div/div/div/div/div[2]/form/div[2]/span/span")).click();
				Thread.sleep(3000);
				//login button click
				driver.findElement(By.xpath("//*[@id=\"auth-wrapper\"]/div/div/div/div/div[2]/form/div[3]/button")).click();
				Thread.sleep(3000);
				
				
	//go to profile option to update profile
				driver.findElement(By.xpath("//*[@id=\"dropdown-basic\"]/span/button")).click();
				Thread.sleep(1000);
				
				//profile
				driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul[2]/li/div/div/a[3]/span")).click();
				Thread.sleep(3000);
	//test case to check profile page
				 WebElement profile = driver.findElement(By.xpath("//*[@id=\"basic-profile-section\"]/div/div/div[1]/div/div[2]"));
				 String pageText1 = profile.getText();
				 String textToVerify1 = "Ravi Kumar";
				 
				 if (pageText1.contains(textToVerify1)) {
			            System.out.println("Text \"" + textToVerify1 + "\" is present on the page.\ntest case 2 passed");
			        } else {
			            System.out.println("Text \"" + textToVerify1 + "\" is NOT present on the page.\ntest case 2 faild");
			        }
				
	   //edit profile option click
				driver.findElement(By.xpath("//*[@id=\"basic-profile-section\"]/div/div/div[2]/div/div[1]/a/i")).click();
				Thread.sleep(3000);
				
		//teat case to varify updading page
				 WebElement update = driver.findElement(By.xpath("//*[@id=\"auth-wrapper\"]/div/div/div/div/div/form/fieldset/legend"));
				 String pageText2 = update.getText();
				 String textToVerify2 = "Basic Profile";
				 
				 if (pageText2.contains(textToVerify2)) {
			            System.out.println("Text \"" + textToVerify2 + "\" is present on the page.\ntest case 3 passed");
			        } else {
			            System.out.println("Text \"" + textToVerify2 + "\" is NOT present on the page.\ntest case 3 faild");
			        }
				
				
     //updating profile
				//email
				//driver.findElement(By.id("email")).sendKeys("kumaravi5432@gmail.com");
				WebElement email = driver.findElement(By.id("email"));
				email.clear();
				email.sendKeys("kumaravi@gmail.com");
				//gender
				driver.findElement(By.xpath("//*[@id=\"auth-wrapper\"]/div/div/div/div/div/form/fieldset/div[1]/div[2]/div[1]/select")).click();
				driver.findElement(By.xpath("//*[@id=\"auth-wrapper\"]/div/div/div/div/div/form/fieldset/div[1]/div[2]/div[1]/select")).sendKeys("m",Keys.ENTER);
				//dob
				WebElement dob = driver.findElement(By.id("jobStartDate"));
				dob.clear();
				dob.sendKeys("11/08/2003");
				//stste
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		        WebElement state = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("react-select-2-input")));
		        state.sendKeys("Rajasthan",Keys.ENTER);
		        Thread.sleep(3000);
		        //city
		        WebElement city = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("react-select-3-input")));
		        city.sendKeys("jaipur",Keys.ENTER);
		        //highest qualification
		        WebElement highqualification = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("react-select-4-input")));
		        highqualification.sendKeys("Graduate",Keys.ENTER);
		        //job type
		        WebElement jobtype = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("react-select-5-input")));
		        jobtype.sendKeys("Business",Keys.ENTER);
		        //job details
		        //driver.findElement(By.id("occupation")).sendKeys("export");
		        WebElement jobdetail = driver.findElement(By.id("occupation"));
		        jobdetail.clear();
		        jobdetail.sendKeys("export");
		        //click on update button
		        driver.findElement(By.xpath("//*[@id=\"auth-wrapper\"]/div/div/div/div/div/form/fieldset/div[2]/div/button")).click();
		        
		        
		        
		        
		        Thread.sleep(5000);
		        driver.quit();
		        
	
	}

}
