package Socialb;

import java.time.Duration;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class createjob {
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
				
				//click on job section button
				driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul[1]/li[2]")).click();
				Thread.sleep(3000);
				//click on create jobs
				driver.findElement(By.xpath("//*[@id=\"job-board-section\"]/div/div/div[1]/ul/li[8]/span")).click();
				Thread.sleep(2000);
				
		// test condition to check creat job page
//				WebElement element1 = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div[1]"));
//				String pageText1 = element1.getText();
//				String textToVerify1 = "Create New Job";
//				
//				if (pageText1.contains(textToVerify1)) {
//					System.out.println("Text \"" + textToVerify1 + "\" is present on the page.\ntest case 2 passed");
//				} else {
//					System.out.println("Text \"" + textToVerify1 + "\" is NOT present on the page.\ntest case 2 faild");
//				}
				//System.out.println("1");
		//job title
				String title = "DOVELOP" ;
				driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div[1]/input")).sendKeys(title);
				//System.out.println("2");
		//job sector
				//driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div[2]/div/div/div[1]/div[2]")).sendKeys("IT");
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				//System.out.println("1");
		        WebElement jobsector = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("react-select-6-input")));
		        jobsector.sendKeys("Private Jobs",Keys.ENTER);
				//Thread.sleep(3000);
		//job type
				WebElement jobtype = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("react-select-7-input")));
				jobtype.sendKeys("Full Time",Keys.ENTER);
					//Thread.sleep(3000);
					
		//company name 
					driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div[4]/input")).sendKeys("C-DAC");
					//Thread.sleep(3000);
		//select state
					//not entering value in state column entering in city
					WebElement state = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div[5]/div[1]/div/div/div[1]/div[2]/input")));
			        state.sendKeys("rajasthan",Keys.ENTER);
					Thread.sleep(3000);
		//select city
					WebElement city = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"react-select-9-input\"]")));
			        city.sendKeys("Jaipur",Keys.ENTER);
			        
	 //address
					driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div[6]/div[1]/input")).sendKeys("mansrover");

					
    //application fee details
					driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div[6]/div[2]/textarea")).sendKeys("application fee is 300 rupees for every candidate");
					
		//application start date
					WebElement startdate = driver.findElement(By.id("jobStartDate"));
					// Clear any existing value and input a new date
					startdate.clear();
					startdate.sendKeys("06/06/2024");
					//Thread.sleep(3000);
					
		//application end date
					WebElement endtdate = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div[7]/div[2]/input"));
					endtdate.clear();
					endtdate.sendKeys("20/06/2024");
					
			//add attachements //file not found
//					 WebElement attachment = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div[8]/div/div[1]/div[1]/input"));
//
//				        // Specify the file path of the attachment
//				        String filePath = "\"D:\\softwares\\late admitted students.xlsx\"";
//
//				        // Send the file path to the upload element
//				        attachment.sendKeys(filePath);
					
					
			//apply link
					driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div[8]/div/div[1]/div[3]/textarea")).sendKeys("https://1drv.ms/x/c/2aeaf229dfaabb4d/EV1nd7n4UtNOmVc92NPjcO8BFyrwdb_reH10a7G0DDiGPg?e=wJFfig");
				
			//apply url button
					driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div[8]/div/div[1]/div[5]/label[1]/input")).click();
					
			//apply with resume
					driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div[8]/div/div[1]/div[6]/div[1]/label/input")).click();
					
			//click submit button
					Thread.sleep(3000);
					driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/div[8]/div/div[3]/button")).click();
					
			// check wather job is created or not
					driver.findElement(By.xpath("//*[@id=\"job-board-section\"]/div/div/div[1]/ul/li[7]/span")).click();
					Thread.sleep(4000);
					 WebElement job = driver.findElement(By.xpath("//*[@id=\"scrollableDiv\"]/div/div/div[1]/div/div[1]/h5"));
					 String textToVerify1 = job.getText();
					// String textToVerify1 = title;
					 
					 if (title.contains(textToVerify1)) {
				            System.out.println("job is created successfully");
				        } else {
				            System.out.println("job is NOT created please try again");
				        }
					 
				//contact us
					 driver.findElement(By.xpath("//*[@id=\"job-board-section\"]/div/div/div[1]/ul/li[10]/span[2]")).click();
					 Thread.sleep(2000);
					 //entering details
					 //name
					 driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div/div[2]/div/div/div[2]")).sendKeys("Ravi");
					 //email
					 
					
					
					
					Thread.sleep(2000);
					driver.quit();	

}
}