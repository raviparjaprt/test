package Socialb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v123.accessibility.model.AXNodeId;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class jobs {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://uat.socialbharat.org/");
		
		
	//test case 1 to  check opening of correct sight
				String title1 = driver.getTitle(); 
				if(title1.equalsIgnoreCase("Social Bharat")) {
					System.out.println("Test 1 is Passed");
				}else {
					System.out.println("Test 1 is Failed");
				}
				
				
		//enter mob. no. to login
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul[1]/div/button[1]")).click();
	
		
		//test case 2 check that it is login page or not
				String title2 = driver.getTitle(); 
				if(title2.equalsIgnoreCase("Social Bharat")) {
					System.out.println("Test 2 is Passed");
				}else {
					System.out.println("Test 2 is Failed");
				}
				
		
		//enter mobile no.
		driver.findElement(By.id("mobile")).sendKeys("6378846434");
		Thread.sleep(3000);
		//entering password
		driver.findElement(By.id("password")).sendKeys("Ravi@123");
		Thread.sleep(3000);
		//see password
    	//driver.findElement(By.xpath("//*[@id=\"auth-wrapper\"]/div/div/div/div/div[2]/form/div[2]/span/span/span/svg")).click();
		Thread.sleep(3000);
		//login button click
		driver.findElement(By.xpath("//*[@id=\"auth-wrapper\"]/div/div/div/div/div[2]/form/div[3]/button")).click();
		
		Thread.sleep(3000);
		
		
	//test case 3 to check you are loged in or not
				String title3 = driver.getTitle(); 
				if(title3.equalsIgnoreCase("Social Bharat")) {
						System.out.println("Test 3 is Passed");
				}else {
						System.out.println("Test 3 is Failed");
					}
				
		
		//click on job button
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul[1]/li[2]/a")).click();
		Thread.sleep(3000);
		
		
	// test case 4 to check job deshboard
				String title4 = driver.getTitle(); 
				if(title4.equalsIgnoreCase("Social Bharat")) {
					System.out.println("Test 4 is Passed");
				}else { 
					System.out.println("Test 4 is Failed");
				}
				
				
		//click on full time filter
		driver.findElement(By.xpath("//*[@id=\"job-board-section\"]/div/div/div[1]/ul/li[3]/span/a")).click();
		
		
		//searching job in search box
		driver.findElement(By.xpath("//*[@id=\"job-board-section\"]/div/div/div[4]/div/div[1]/div[2]/div[1]/div/input")).sendKeys("developer");
		driver.findElement(By.xpath("//*[@id=\"job-board-section\"]/div/div/div[4]/div/div[1]/div[2]/div[1]/div/span")).click();
		Thread.sleep(3000);
		
		
		//select state in drop down
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				
				 WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("react-select-2-input")));
				 dropdown.sendKeys("Rajasthan",Keys.ENTER);
			        Thread.sleep(5000);
			        //driver.findElement(By.xpath("//*[@id=\"job-board-section\"]/div/div/div[4]/div/div[1]/div[2]/div[1]/div/span")).click();


			        
			      //select city in drop down
					WebDriverWait city = new WebDriverWait(driver, Duration.ofSeconds(10));
					
					 WebElement dropcity = city.until(ExpectedConditions.visibilityOfElementLocated(By.id("react-select-3-input")));
					 dropcity.sendKeys("Rajasthan",Keys.ENTER);
				        Thread.sleep(5000);
		//click on view detail of the job
		driver.findElement(By.xpath("//*[@id=\"scrollableDiv\"]/div/div/div[1]/div/div[1]/a")).click();
		System.out.println("hello");
		Thread.sleep(5000);
		// click on easy apply
		driver.findElement(By.xpath("//*[@id=\"scrollableDiv\"]/div/div/div[1]/div/div[3]/div[1]/a")).click();
		
		
		// test case 5 to check you are on apply page
				String title5 = driver.getTitle(); 
				
				if(title5.equalsIgnoreCase("Social Bharat")) {
					System.out.println("Test 5 is Passed");
				}else { 
					System.out.println("Test 5 is Failed");
				}
		
		//		//click dropdown list of state
		//driver.findElement(By.xpath("//*[@id=\"job-board-section\"]/div/div/div[4]/div/div[1]/div[2]/div[2]/div/div/div[1]/div[2]")).click();
//		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"job-board-section\"]/div/div/div[4]/div/div[1]/div[2]/div[2]/div"));
//		Thread.sleep(4000);
//		Select dropdown= new Select(dropdownElement);
//		Thread.sleep(4000);
//	    dropdown.sendKeys("Assam",Keys.ENTER);
		//dropdown.sendKeys(Keys.ENTER);
		//driver.findElement(By.id("//*[@id=\"job-board-section\"]/div/div/div[4]/div/div[1]/div[2]/div[2]/div/div/div[1]/div[2]")).sendKeys("Assam");
		
		//driver.navigate().refresh();
        //driver.navigate().back();
				
			
		
		
		
		
		
		Thread.sleep(5000);
		driver.quit();

}
}