package Socialb;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class invalidlogin {
	public static void main(String[] args) throws InterruptedException{
	       WebDriver driver = new ChromeDriver();
	   	   driver.manage().window().maximize();
	   	   driver.get("https://uat.socialbharat.org/");
	   	   Thread.sleep(3000);
	   	   driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul[1]/div/button[1]")).click();
	       driver.findElement(By.id("mobile")).sendKeys("963647552");
	   	
	   	   driver.findElement(By.xpath("//*[@id=\"auth-wrapper\"]/div/div/div/div/div[2]/form/div[3]/button")).click();
	   	   Thread.sleep(3000);
	//checking mobile no input invalidation
	   	   System.out.println("mobile number cases");
	   	   
	   	    WebElement mobilenoError = driver.findElement(By.xpath("//*[@id=\"auth-wrapper\"]/div/div/div/div/div[2]/form/div[1]/span"));
	   	    Boolean mobileerror =	mobilenoError.isDisplayed();
	   	   //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	   	   //WebElement mobileError = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"auth-wrapper\"]/div/div/div/div/div[2]/form/div[1]/span")));
	   	   //Boolean merror =	mobileError.isDisplayed();
	   	   if(mobileerror) {
	   		   
	   		   //Check Empty   
	   		   String pageText = mobilenoError.getText();
	   		   String textToVerify = "Mobile is Required."; 
	   		   if (pageText.contains(textToVerify)) {	
	   			   System.out.println("Case - " + textToVerify  + " Matched");
	   		   } else {
	   			   System.out.println("Case - " + textToVerify  + " MisMatched");
	   		   }   		
	   		   
	   		   //10 digits number
	   		   String pageText1 = mobilenoError.getText();
	 		   String textToVerify1 = "Mobile number must be of 10 digits"; 
	 		   if (pageText1.contains(textToVerify1)) {	
	 			   System.out.println("Case1 - " + textToVerify1  + " Matched");
	 		   } else {
	 			   System.out.println("Case1 - " + textToVerify1  + " MisMatched");
	 		   }   		
	 		   
	 		  //number must start with 6, 7, 8, or 9.
	 		  String pageText2 = mobilenoError.getText();
			   String textToVerify2 = "Mobile number must start with 6, 7, 8, or 9."; 
			   if (pageText2.contains(textToVerify2)) {	
				   System.out.println("Case2 - " + textToVerify2  + " Matched");
			   } else {
				   System.out.println("Case2 - " + textToVerify2  + " MisMatched");
			   }   		
			   
	   		   //Mobile number is not registered.
			   String pageText3 = mobilenoError.getText();
			   String textToVerify3 = "Mobile number is not registered."; 
			   if (pageText3.contains(textToVerify3)) {	
				   System.out.println("Case3 - " + textToVerify3  + " Matched");
			   } else {
				   System.out.println("Case3 - " + textToVerify3  + " MisMatched");
			   }   		   
	   	   }else { 
	   		   
	   		   System.out.println("Correct Mobile Number");
	   	   }
	   	   
	   	   System.out.println("\n\n\npassword cases");
	  //checking password inputs
	   	WebElement pass = driver.findElement(By.xpath("//*[@id=\"auth-wrapper\"]/div/div/div/div/div[2]/form/div[2]/span[2]"));
   	    Boolean passerror =	pass.isDisplayed();
	   	   
	   	 if (passerror) {
	   	//Check Empty   
	   		   String pageText4 = mobilenoError.getText();
	   		   String textToVerify4 = "Password is Required"; 
	   		   if (pageText4.contains(textToVerify4)) {	
	   			   System.out.println("Case1 - " + textToVerify4  + " Matched");
	   		   } else {
	   			   System.out.println("Case1 - " + textToVerify4  + " MisMatched");
	   		   }  
	   	 }else {
	   			   System.out.println("password is correct");
	   		   }
	   	 Thread.sleep(3000);
	   	 driver.quit();
	   	   
	   	   	   	   
	   
	}
	}
